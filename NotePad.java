// Global variables
JFrame window;
JTextArea textArea;
JScrollPane scrollPane;
JMenuBar menuBar;
JMenu menuFile, menuEdit, menuFormat, menuColor, menuView;
JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
JMenuItem iwrap, iColor_1, iColor_2, iColor_3;
JMenu menuFont, menuFontSize;
FunctionsFile file = new FunctionsFile();
FunctionFormat format = new FunctionFormat();
FunctionColor color = new FunctionColor();
FunctionEdit edit = new FunctionEdit();
JLabel statusBar;
boolean wordWrapON = false;
UndoManager un = new UndoManager();

public static void main(String[] args) {
    new Notepad();
}

public Notepad() {
    createWindow();
    createTextArea();
    createMenuBar();
    createFileMenu();
    createFormatMenu();
    createColorMenu();
    createEditMenu();
    addViewFunctionality();
    format.selectedFont = "Arial";
    format.createFont(18);
    window.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java\n" +
            "otepad.png"));
}

public void createWindow() {
    window = new JFrame("Notepad Clone");
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(800, 600);
    window.setResizable(false);
    window.setLocationRelativeTo(null);
    // Remove window decorations
    // window.setUndecorated(true);
    // window.setLayout(true);
    statusBar = new JLabel("Ready");
    statusBar.setBorder(BorderFactory.createEtchedBorder());
    window.add(statusBar, BorderLayout.SOUTH);
}

public void createTextArea() {
    textArea = new JTextArea();
    textArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
        @Override
        public void undoableEditHappened(UndoableEditEvent e) {
            un.addEdit(e.getEdit());
        }
    });
    scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    textArea.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateStatus();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateStatus();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateStatus();
        }
    });
    window.add(scrollPane);
}

private void updateStatus() {
    int caretPosition = textArea.getCaretPosition();
    int lineNumber = 1;
    try {
        lineNumber = textArea.getLineOfOffset(caretPosition) + 1;
    } catch (BadLocationException e) {
        e.printStackTrace();
    }
    String text = textArea.getText();
    int wordCount = countWords(text);
    String statusText = "Line: " + lineNumber + " | Position: " + caretPosition + " | Word Count: " + wordCount;
    statusBar.setText(statusText);
}

private int countWords(String text) {
    String[] words = text.split("\s+");
    return words.length;
}

public void createMenuBar() {
    menuBar = new JMenuBar();
    window.setJMenuBar(menuBar);
    menuFile = new JMenu("File");
    menuBar.add(menuFile);
    menuEdit = new JMenu("Edit");
    menuBar.add(menuEdit);
    menuFormat = new JMenu("Format");
    menuBar.add(menuFormat);
    menuColor = new JMenu("Color");
    menuBar.add(menuColor);
    menuView = new JMenu("View");
    menuBar.add(menuView);
}

public void createFileMenu() {
    iNew = new JMenuItem("New tab");
    menuFile.add(iNew);
    iNew.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            file.newFile();
        }
    });
    iNew.setActionCommand("New");
    iOpen = new JMenuItem("Open");
    menuFile.add(iOpen);
    iOpen.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            file.newOpen();
        }
    });
    iSave = new JMenuItem("Save");
    menuFile.add(iSave);
    iSave.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            file.newSave();
        }
    });
    iSaveAs = new JMenuItem("Save as");
    menuFile.add(iSaveAs);
    iSaveAs.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            file.newSave_as();
        }
    });
    iExit = new JMenuItem("Close tab");
    menuFile.add(iExit);
    iExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    iExit.setActionCommand("Exit");
}

public void addViewFunctionality() {
    JMenuItem toggleFullScreenItem = new JMenuItem("Toggle");
    menuView.add(toggleFullScreenItem);
    menuFont = new JMenu("Zoom");
    JMenuItem increaseFontSizeItem = new JMenuItem("Zoom in");
    JMenuItem decreaseFontSizeItem = new JMenuItem("Zoom out");
    menuFont.add(increaseFontSizeItem);
    menuFont.add(decreaseFontSizeItem);
    menuView.add(menuFont);
    toggleFullScreenItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            window.setExtendedState(
                    window.getExtendedState() == JFrame.MAXIMIZED_BOTH ? JFrame.NORMAL : JFrame.MAXIMIZED_BOTH);
        }
    });
    increaseFontSizeItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Font currentFont = textArea.getFont();
            int size = currentFont.getSize() + 4;
            if (size > 72) {
                size = 72;
            }
            textArea.setFont(currentFont.deriveFont((float) size));
        }
    });
    decreaseFontSizeItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Font currentFont = textArea.getFont();
            int size = currentFont.getSize() - 2;
            if (size < 8) {
                size = 8;
            }
            textArea.setFont(currentFont.deriveFont((float) size));
        }
    });
}

public void createFormatMenu() {
    iwrap = new JMenuItem("Word wrap: OFF");
    menuEdit.add(iwrap);
    iwrap.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            format.wordwrap();
        }
    });
    iwrap.setActionCommand("Word wrap");
    menuFont = new JMenu("Font");
    menuEdit.add(menuFont);
    iFontArial = new JMenuItem("Arial");
    iFontArial.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            format.setFont("Arial");
        }
    });
    iFontArial.setActionCommand("F_Arial");
    menuFont.add(iFontArial);
    iFontCSMS = new JMenuItem("Comic Sans MS");
    iFontCSMS.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            format.setFont("Comic Sans MS");
        }
    });
    iFontCSMS.setActionCommand("F_CSMS");
    menuFont.add(iFontCSMS);
    iFontTNR = new JMenuItem("Times New Roman");
    iFontTNR.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            format.setFont("Times New Roman");
        }
    });
    iFontTNR.setActionCommand("F_TNR");
    menuFont.add(iFontTNR);
    iFontCalibri = new JMenuItem("Calibri");
    iFontCalibri.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            format.setFont("Calibri");
        }
    });
    iFontCalibri.setActionCommand("F_Calibri");
    menuFont.add(iFontCalibri);
    iFontCourierNew = new JMenuItem("Courier New");
    iFontCourierNew.addActionListener(new ActionListener() {
        @Override