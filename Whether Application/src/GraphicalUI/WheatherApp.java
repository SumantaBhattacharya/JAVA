import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import Backend.WhetherApplication;
public class WheatherApp extends JFrame {
    private JSONObject whetherData;// the data we get is in or parsed in object format from the JSON object
    // creating a Constructor

    public WheatherApp() {
        // this.setTitle("Whether"); // Setting or giving a title of the frame
        super("Whether");// call to super must be first statement in constructor
        setSize(420, 650);

        // Center the window on the screen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Previously, when we are pressing the cross button of the
                                                        // frame, it was just closing. But in the terminal, it was
                                                        // not showing that it is closed. That means it just got
                                                        // hidden. So what we did here is Now, if we press the
                                                        // cross button of the frame, it gives the message that it
                                                        // has been closed in the terminal.
        // setResizable(false); // (Prevent frame from being resized) We set it
        // false because we don't want it
        // to change the size of the frame, but we can move the frame through our screen
        // dasable the by default layout of swing
        setLayout(null);// this wii allow the components to be resize and change the position by us

        // Set minimum and maximum size to prevent resizing
        // setMinimumSize(getSize());
        // setMaximumSize(getSize());
        // Initially maximize the window
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Set custom icon
        ImageIcon image = new ImageIcon("C:\\Users\\Sumanta Bhattacharya\\Downloads\\weather-app (1).png");
        setIconImage(image.getImage());
        // calling the methods
        createGUIComponents();
    }

    public void createGUIComponents() {
        // search bar
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15, 15, 330, 45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24)); // Corrected font name

        // whether image
        JLabel whetherConditionImage = new JLabel(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\cloudy.png"));// C:\\Users\\Sumanta
                                                                                                                       // Bhattacharya\\Downloads\\cloudy.png
        whetherConditionImage.setBounds(0, 125, 450, 277);
        // whetherConditionImage.setHorizontalAlignment(SwingConstants.CENTER);

        // Temperature text
        JLabel temperatureText = new JLabel("21°C");
        temperatureText.setBounds(0, 350, 450, 54);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        // Whether condition text
        JLabel whetherCondiotionDescription = new JLabel("Cloudy");
        whetherCondiotionDescription.setBounds(0, 405, 450, 36);
        whetherCondiotionDescription.setFont(new Font("Dialog", Font.PLAIN, 32));
        whetherCondiotionDescription.setHorizontalAlignment(SwingConstants.CENTER);

        // humidity Image
        JLabel humidityImage = new JLabel(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\humidity.png"));
        humidityImage.setBounds(15, 500, 74, 66);
        // humidity text
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");// html code
        humidityText.setBounds(90, 500, 85, 55);
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));

        // wind speed Image
        JLabel windspeedImage = new JLabel(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\windspeed.png"));
        windspeedImage.setBounds(220, 500, 74, 66);
        // wind text
        JLabel windspeedText = new JLabel("<html><b>Wind</b> 15km/h</html>");// html code
        windspeedText.setBounds(310, 500, 85, 55);
        windspeedText.setFont(new Font("Dialog", Font.PLAIN, 16));

        // search button
        // Assuming the "photos" folder is directly under the project directory
        // Alternatively, you can use getResourceAsStream for more flexibility
        // Initialize searchButton here
        // it should be always last
        JButton searchButton = new JButton(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\search.png"));// C:\\Users\\Sumanta
                                                                                                                // Bhattacharya\\Downloads\\search.png
        searchButton.setBounds(355, 13, 47, 45);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // backend code
                // get location from the user
                String userInput = searchTextField.getText();// to place text in the search field
                // validate input remove widespace example los angels - losangles
                // userInput = userInput.replaceAll("\\s+", "");
                // if (userInput.length() == 0) {
                // return;
                // } else {
                // System.out.println(userInput);
                // }
                if (userInput.replaceAll("\\s+", "").length() <= 0) {
                    //System.out.println(userInput);
                    return;
                }
                // retrive whether data
                whetherData = WeatherApp.getWhetherData(userInput);
                // update weather image
                String weatherCondition = (String) whetherData.get("weather_Condition");// the weather dta is coming in
                                                                                        // json format and it need to be
                                                                                        // converted to String here
                // depending on the condition we will update the weather image
                switch (weatherCondition) {
                    case "Clear":
                        whetherConditionImage.setIcon(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\clear.png"));
                        break;
                    case "Cloudy":
                        whetherConditionImage.setIcon(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\cloudy.png"));
                        break;
                    case "Rain":
                        whetherConditionImage.setIcon(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\rain.png"));
                        break;
                    case "Snow":
                        whetherConditionImage.setIcon(loadImage("C:\\Users\\Sumanta Bhattacharya\\Downloads\\snow.png"));
                        break;
                }
                // update temperature text
                double temperature = (double) whetherData.get("temperature");
                temperatureText.setText(temperature + " C");
                // update whetherCondiotionDescription
                whetherCondiotionDescription.setText(weatherCondition);
                // update humidity
                long humidity = (long) whetherData.get("humidity");
                humidityText.setText("<html><b>Humidity</b> " + humidity + "%</html>");
                // update humidity
                long windspeed = (long) whetherData.get("windspeed");
                windspeedText.setText("<html><b>Wind</b> " + windspeed + "km/h</html>");// variable

            }
        });
/*PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java\Whether Application\src\GraphicalUI> cd "C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java\Whether Application\src\GraphicalUI\" && javac -classpath ".;C:\Users\Sumanta Bhattacharya\Downloads\json-simple-1.1.1.jar" -Xlint:deprecation -Xlint:unchecked WheatherApp.java */
        // Add the components
        add(searchTextField);
        add(searchButton);
        add(whetherConditionImage);
        add(temperatureText);
        add(whetherCondiotionDescription);
        add(humidityImage);
        add(humidityText);
        add(windspeedImage);
        add(windspeedText);
    }

    private ImageIcon loadImage(String path) {
        File file = new File(path);
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        try {
            BufferedImage image = ImageIO.read(file);
            return new ImageIcon(image);
        } catch (IOException e) {
            System.out.println("Could not find the image at: " + path);
            // Provide a user-friendly message or handle the exception accordingly
            return null;
        }
    }

    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(new Runnable() {// applying the concept of multithreading
            @Override
            public void run() {
                // deplay our whether app gui
                new WheatherApp().setVisible(true);// creating an instance of the class
                // testing that location geographical data from the API
                // Assuming WhetherApplication has a static method called getLocationData
                // System.out.println(WeatherApp.getLocationData("Tokyo"));
                // Initially, do not maximize the window
                // weatherApp.setExtendedState(JFrame.NORMAL);
                // System.out.println(WeatherApp.getCurrentTime());

            }
        });
    }
}
// java -classpath ".;C:\Users\Sumanta Bhattacharya\Downloads\json-simple-1.1.1.jar" WheatherApp

// cd
// "C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java\Whether
// Application\src\GraphicalUI\" && javac -classpath "
// .;C:\Users\Sumanta Bhattacharya\Downloads\json-simple-1.1.1.jar"
// -Xlint:deprecation -Xlint:unchecked WeatherApp.java

// cd"C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java\Whether
// Application\src\GraphicalUI\" && javac -classpath " .;C:\Users\Sumanta
// Bhattacharya\Downloads\json-simple-1.1.1.jar" -Xlint:deprecation
// -Xlint:unchecked WeatherApp.java
// public class WhetherApp extends JFrame {

// // Constructor
// public WhetherApp() {
// this.setVisible(true); // By default, it is set to false. We need to set it
// to true so it can be visible to the user
// this.setTitle("Youth Career Hub");
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setResizable(false);
// this.setSize(450, 650);
// }

// public static void main(String[] args) {
// // Create an instance of the WhetherApp class
// SwingUtilities.invokeLater(() -> new WhetherApp());
// }
// }
// Constructor
// public WhetherApp() {
// initialize();
// }

// // Method for calling initialization methods
// private void initialize() {
// }
/* Tabnine: AI Autocomplete & Chat for Javascript, Python, Ty */
// http://www.java2s.com/Code/Jar/s/Downloadswingxall164jar.htm
// ------------Weather Application - CORE JAVA (Project 1)---------------

// Project Description:

// This Core Java weather application is a hands-on project that immerses
// learners in the world of API integration. By interfacing with weather data
// APIs, this project teaches students how to fetch and display real-time
// weather information. Users can access current weather conditions, detailed
// forecasts, and location-specific updates with ease.

// Through this project, learners gain a deep understanding of core Java
// concepts such as HTTP requests, JSON parsing, and data manipulation. They
// become proficient in handling API responses, extracting relevant data, and
// presenting it in a user-friendly format. This practical experience not only
// improves Java programming skills but also equips students with valuable
// knowledge in working with external data sources.

// By completing this weather application, students enhance their ability to
// create robust, data-driven Java applications and set the foundation for more
// complex API-driven projects in the future.

// Tools Use in this project:

// (1) Swing & Core Java
// (2) Geolocation API:https://open-meteo.com/en/docs/geocoding-api
// (3) Weatherforecast
// API:https://open-meteo.com/en/docs#latitude=33.767&longitude=-118.1892
// (4) JSON Data: https://code.google.com/archive/p/json-simple/downloads

// Project Demo: https://youtu.be/CDgyMstjtCo

// Part 1 [Building the UI ] - https://youtu.be/30J6jIDtuI4

// Part 2 [Fetching GEO Location Data from API - Backend] -
// https://youtu.be/sUM1kLnEpCE

// Part 3 [Fetching Weather Forecast from API - Backend] -
// https://youtu.be/Rmqd_St4jAA

// Part 4 [Display the data from backend to frontend dynamically - Connecting
// backedn with frontend] - https://youtu.be/L9vvzHu3C9Q
// https://drive.google.com/drive/folders/1ecGq_Map0MW1OghOSRiEd50Y8dyKeQxi
// {
// "results": [
// {
// "id": 2950159,
// "name": "Berlin",
// "latitude": 52.52437,
// "longitude": 13.41053,
// "elevation": 74,
// "feature_code": "PPLC",
// "country_code": "DE",
// "admin1_id": 2950157,
// "admin3_id": 6547383,
// "admin4_id": 6547539,
// "timezone": "Europe/Berlin",
// "population": 3426354,
// "postcodes": [
// "10967",
// "13347"
// ],
// "country_id": 2921044,
// "country": "Germany",
// "admin1": "Land Berlin",
// "admin3": "Berlin, Stadt",
// "admin4": "Berlin"
// },
// {
// "id": 5083330,
// "name": "Berlin",
// "latitude": 44.46867,
// "longitude": -71.18508,
// "elevation": 311,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 5090174,
// "admin2_id": 5084973,
// "admin3_id": 5083340,
// "timezone": "America/New_York",
// "population": 9367,
// "postcodes": [
// "03570"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "New Hampshire",
// "admin2": "Coos",
// "admin3": "City of Berlin"
// },
// {
// "id": 4500771,
// "name": "Berlin",
// "latitude": 39.79123,
// "longitude": -74.92905,
// "elevation": 50,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 5101760,
// "admin2_id": 4501019,
// "admin3_id": 4500776,
// "timezone": "America/New_York",
// "population": 7590,
// "postcodes": [
// "08009"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "New Jersey",
// "admin2": "Camden",
// "admin3": "Borough of Berlin"
// },
// {
// "id": 5245497,
// "name": "Berlin",
// "latitude": 43.96804,
// "longitude": -88.94345,
// "elevation": 246,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 5279468,
// "admin2_id": 5255015,
// "admin3_id": 5245510,
// "timezone": "America/Chicago",
// "population": 5420,
// "postcodes": [
// "54923"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "Wisconsin",
// "admin2": "Green Lake",
// "admin3": "City of Berlin"
// },
// {
// "id": 4348460,
// "name": "Berlin",
// "latitude": 38.32262,
// "longitude": -75.21769,
// "elevation": 11,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 4361885,
// "admin2_id": 4374180,
// "timezone": "America/New_York",
// "population": 4529,
// "postcodes": [
// "21811"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "Maryland",
// "admin2": "Worcester"
// },
// {
// "id": 4930431,
// "name": "Berlin",
// "latitude": 42.3812,
// "longitude": -71.63701,
// "elevation": 100,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 6254926,
// "admin2_id": 4956199,
// "admin3_id": 4930436,
// "timezone": "America/New_York",
// "population": 2422,
// "postcodes": [
// "01503"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "Massachusetts",
// "admin2": "Worcester",
// "admin3": "Town of Berlin"
// },
// {
// "id": 4556518,
// "name": "Berlin",
// "latitude": 39.92064,
// "longitude": -78.9578,
// "elevation": 710,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 6254927,
// "admin2_id": 5212857,
// "admin3_id": 4556520,
// "timezone": "America/New_York",
// "population": 2019,
// "postcodes": [
// "15530"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "Pennsylvania",
// "admin2": "Somerset",
// "admin3": "Borough of Berlin"
// },
// {
// "id": 4557666,
// "name": "East Berlin",
// "latitude": 39.9376,
// "longitude": -76.97859,
// "elevation": 131,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 6254927,
// "admin2_id": 4556228,
// "admin3_id": 4557667,
// "timezone": "America/New_York",
// "population": 1534,
// "postcodes": [
// "17316"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "Pennsylvania",
// "admin2": "Adams",
// "admin3": "Borough of East Berlin"
// },
// {
// "id": 5147132,
// "name": "Berlin",
// "latitude": 40.56117,
// "longitude": -81.7943,
// "elevation": 391,
// "feature_code": "PPL",
// "country_code": "US",
// "admin1_id": 5165418,
// "admin2_id": 5157783,
// "admin3_id": 5147154,
// "timezone": "America/New_York",
// "population": 898,
// "postcodes": [
// "44610"
// ],
// "country_id": 6252001,
// "country": "United States",
// "admin1": "Ohio",
// "admin2": "Holmes",
// "admin3": "Berlin Township"
// },
// {
// "id": 1510159,
// "name": "Berlin",
// "latitude": 54.00603,
// "longitude": 61.19308,
// "elevation": 228,
// "feature_code": "PPL",
// "country_code": "RU",
// "admin1_id": 1508290,
// "admin2_id": 1489213,
// "timezone": "Asia/Yekaterinburg",
// "population": 613,
// "postcodes": [
// "457130"
// ],
// "country_id": 2017370,
// "country": "Russia",
// "admin1": "Chelyabinsk",
// "admin2": "Troitskiy Rayon"
// }
// ],
// "generationtime_ms": 3.731966
// }
/*
 * java project - referenced libraries - + = add your jar file
 * API = APPLICATION PROGRAMMING INTERFACE
 * Less code
 * security
 * ease to implement
 * 
 */