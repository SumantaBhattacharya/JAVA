
// the Run java run the program without creating the class of an object for
// creating the class of an object we use the Run Code
// Constructor Stays Always Inside the Class
// PHP and Oracle are not databases themselves but are associated with databases
/* This Class is for Establishing a Connection with the Server(SQL)
 * It is a Boiler Plate
 * Certainly! A boilerplate code for establishing a connection with a SQL Server in a programming language
 * JDBC is an External API
 * TO COPY THE URL FOLLOW THESE FOLLOWING STEPS
 * Go to Mysql Workbench
 * then select the local instance 
 * then, Right click
 * then press, Copt JDBC Connection String to Clipboard 
 * jdbc:mysql://localhost:3306/?user=root
 * 3306 is pot
*/
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
    // public static void main(String[] args) throws Exception {
        // JDBC AND Database Properties
        private static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";// it is a very sensitive thing thats why we keeping the Database_Driver as Private | It is a Global Variable
        private static final String DB_URL="jdbc:mysql://localhost:3306/empDataset";//WE ARE KEEPING IT FINAL BECAUSE THE DRIVER,URL,USERNAME,PASSWORD ARE CANNOT BE REPLACABLE
        private static final String DB_USERNAME="root";// HERE String is a dataType. The Information given inside these variable are all will be collection of Character/Alphabets
        private static final String DB_PASSWORD="CJnm@#9501";

        public static Connection getConnection() {// The getConnection() method is a static method. In static method only static variables can be USED
        // Connection Interface - object|Initially the connection is not based thats why we have given the value null
        Connection con = null;// Initially It was showing us ERROR!, because we didnt present/Given its return Type
        try {
            // Regester JDBC Driver
            Class.forName(DB_DRIVER);
            // Open the Connection|DriverManager is a component this is provided by the JDBC which helping us with connecting the driver
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);// THE URL WILL SAME FOR EVERYONE|WE CAN DIRECTLY PROVIDE THE VALUE
            // CHECK WHETHER THE CONNECTION IS ESTABLISHED OR NOT
            if (con != null){// if connection is established that means con is not null anymore if not the the connection is not established
                System.out.println(" THE CONNECTION IS ESTABLISHED ");
            }else{
                System.out.println("HE CONNECTION IS NOT ESTABLISHED");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;



    }

}
