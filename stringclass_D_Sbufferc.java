public class stringclass_D_Sbufferc {// string class differ from string buffer class
        public static void main(String[] args) {
            // Using String (Immutable)
            String immutableStr = "Hello";
            immutableStr += " World"; // Creates a new string
            System.out.println("Immutable String: " + immutableStr);
    
            // Using StringBuffer (Mutable)
            StringBuffer mutableBuffer = new StringBuffer("Hello");
            mutableBuffer.append(" World"); // Modifies the existing buffer
            System.out.println("Mutable StringBuffer: " + mutableBuffer.toString());
        }
    }
    `

