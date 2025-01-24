
//3
/* In JDBC (Java Database Connectivity), the Statement is an interface provided by Java to execute SQL queries against a database. It's part of the java.sql package.  */
//import java.beans.Statement;
//import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
//import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.ResultSet;

public class EmployeeDatabase {
    // creating a method| This method will give exception for handling thing we
    // going to use throws ( For handling exception in methods we use throws)
    public static void createTable(Connection con) throws SQLException {
        String createTableQuery = "CREATE TABLE empInfo(empID int, empName varchar(69),empDesignation varchar(68),empSalary int)";
        // statement is a Component given by the J D B C It helps to execute the queries
        // which we created here
        Statement stmt = con.createStatement();
        stmt.execute(createTableQuery);
    }

    // we have defined InsertRecords
    public static void InsertRecords(Connection con) throws SQLException { // Included in 2nd part of the video
        String Insert_RecordsQuery = "INSERT INTO empInfo(empID, empName, empDesignation, empSalary) VALUES(180, 'Sudip Bhattacharya', 'Minning Engineer', 53000)";
        String Insert_RecordsQuery2 = "INSERT INTO empInfo(empID, empName, empDesignation, empSalary) VALUES" +
                "(181, 'Anita Bhattacharya', 'House wife', 0)," +
                "(143, 'Sumanta Bhattacharya','Software Engineer', 70000)," +
                "(168,'Suman Bhat','Manager',85000)," +
                "(169,'Santanu Banerjee','Web Devloper',69000)," +
                "(186,'Arin Singh','UI/UX Designer', 100000)," +
                "(196,'Indranil Chakraborty','CEO', 150000)";

        // for incerting data
        Statement stmt = con.createStatement();// it is giving us sql exception to hanlde we will use throws keyword
        stmt.execute(Insert_RecordsQuery);
        stmt.execute(Insert_RecordsQuery2);

    }

    public static void updateRecords(Connection con) throws SQLException {
        String updateRecordsQuery = " UPDATE empInfo SET empSalary = 75000 WHERE empID = 143";// THESE ARE QUERY/COMMAND
                                                                                              // OF SQL
        Statement stmt = con.createStatement();// it is giving us sql exception to hanlde we will use throws keyword
        stmt.executeUpdate(updateRecordsQuery);
    }

    public static void selectRecords(Connection con) throws SQLException {
        String selectRecordsQuery = "SELECT * FROM empInfo";// to show the record not in the sql database to show in the
                                                            // terminal
        Statement stmt = con.createStatement();// it is giving us sql exception to handle we will use throws keyword
        stmt.execute(selectRecordsQuery);
        ResultSet resultSet = stmt.executeQuery(selectRecordsQuery);// store the record/data base value

        while (resultSet.next()) {
            int empID = resultSet.getInt("empID");
            String empName = resultSet.getString("empName");
            String empDesignation = resultSet.getString("empDesignation");
            int empSalary = resultSet.getInt("empSalary");

            System.out.println("Employee ID= " + empID);
            System.out.println("Employee Name= " + empName);
            System.out.println("Employee Designation= " + empDesignation);
            System.out.println("Employee Salary= " + empSalary);
            System.out.println();
        }
    }
        public static void deleteRecords(Connection con) throws SQLException {
        String deleteRecordsQuery = "DELETE FROM empInfo WHERE empName = 'Arin Singh' ";// We can use employee id instead of employee name, whatever we like. If we use employee id, then we, instead of giving Arin Singh, we have to give its id number, which is the employee id
        Statement stmt = con.createStatement();// it is giving us sql exception to hanlde we will use throws keyword
        int rowsAffected = stmt.executeUpdate(deleteRecordsQuery);// one row will be deleted ------------------- |__  __ROW |COLUMN
        System.out.println(rowsAffected+ "number of records deleted successfully");// 1 item deleted = 1 will be the value of rowsAffected
        
    }// to count how many items we have deleted 

    public static boolean tableExists(Connection con, String tableName) throws SQLException {
        // DatabaseMetaData is an interface in the Java Database Connectivity (JDBC) API
        // that provides methods for obtaining metadata information about a database.
        DatabaseMetaData metaData = (DatabaseMetaData) con.getMetaData();// typecast
        ResultSet tables = metaData.getTables(null, null, tableName, null); // ResultSet is an Interface to store the
                                                                            // data fetch from mysql|ResultSet is indeed
                                                                            // an interface in the Java Database
                                                                            // Connectivity (JDBC) API, and it is used
                                                                            // to represent the result set of a database
                                                                            // query. When you execute a SQL query
                                                                            // against a database using JDBC, the result
                                                                            // is returned as a ResultSet object.
        return tables.next();// next() send thes information to empInfo
    }

}// sevices-->select any file-->press m-->mysql-->stop-->start
/*
 * 180 Sudip Bhattacharya Minning Engineer 53000
 * 181 Anita Bhattacharya House wife 0
 * 143 Sumanta Bhattacharya Software Engineer 70000
 * 168 Suman Bhat Manager 85000
 * 169 Santanu Banerjee Web Devloper 69000
 * 186 Arin Singh UI/UX Designer 100000
 * 196 Indranil Chakraborty CEO 150000
 * 
 */
/*
 * 1. while (resultSet.next()) {// to display all the infomation we gonna
 * require while loop|this loop is for select each line(one line after)|row
 * while (resultSet.next()){// process and print the retrieved data|to print
 * each and data retrived|column
 * int empID=resultSet.getInt("empID");// if fetch integer data.OUR first column
 * is employ id thats why its int and storing this data to empID variable
 * String empName=resultSet.getString("empName");// next column is empName and
 * name is string value
 * String empDesignation=resultSet.getString("empDesignation");// fetch all the
 * data
 * int empSalary=resultSet.getInt("empSalary");
 * // Now, display the data
 * System.out.println("Employee ID= "+empID );
 * System.out.println("Employee Name= "+empName );
 * System.out.println("Employee Designation= "+empDesignation );
 * System.out.println("Employee Salary= "+empSalary );
 * System.out.println();// to have space
 * }
 * 
 * }
 * 
 */
/*
 * 2.
 * // Outer while loop to iterate over each row in the result set
 * while (resultSet.next()) {
 * // Inner while loop to process and print the retrieved data for each column
 * while (resultSet.next()) {
 * // Retrieve employee ID from the result set
 * int empID = resultSet.getInt("empID");
 * 
 * // Retrieve employee name from the result set
 * String empName = resultSet.getString("empName");
 * 
 * // Retrieve employee designation from the result set
 * String empDesignation = resultSet.getString("empDesignation");
 * 
 * // Retrieve employee salary from the result set
 * int empSalary = resultSet.getInt("empSalary");
 * 
 * // Display the retrieved data
 * System.out.println("Employee ID= " + empID);
 * System.out.println("Employee Name= " + empName);
 * System.out.println("Employee Designation= " + empDesignation);
 * System.out.println("Employee Salary= " + empSalary);
 * System.out.println(); // Add a newline for better readability
 * }
 * }
 */
/*
 * 3.while (resultSet.next()) {
 * int empID = resultSet.getInt("empID");
 * String empName = resultSet.getString("empName");
 * String empDesignation = resultSet.getString("empDesignation");
 * int empSalary = resultSet.getInt("empSalary");
 * 
 * System.out.println("Employee ID= " + empID);
 * System.out.println("Employee Name= " + empName);
 * System.out.println("Employee Designation= " + empDesignation);
 * System.out.println("Employee Salary= " + empSalary);
 * System.out.println();
 * }
 */
