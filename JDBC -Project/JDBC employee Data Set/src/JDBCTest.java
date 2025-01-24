
//2*
/*  finally is not a keyword, we cannot use it in methods, contructors etc. 
finally has a block{ 

}
finally block genarally use for Resouce handling
it will execute surely

finally flowchart
(start)--->[try]---><exception--NO-->[ignore catch block]-->[finally block execute]-->(end)
                             |--YES-->[ignore the rest of the code]-->[excute catch]-->[finally block execute]-->(end)

                             */
/* In your JDBCTest class, you are catching a general Exception and then catching SQLException. This is not allowed in Java because more specific exceptions must be caught before more general ones. */
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args) {
        Connection con = null;
        // NOW,WE HAVE TO CALL GET CONNECTION METHOD
        // NOW, WE HAVE TO CALL GET CONNECTION METHOD
        try {
            // GET THE CONNECTION
            con = JDBCUtil.getConnection(); // it gives classnotfoundexception
            // CREATE A TABLE
            if (!EmployeeDatabase.tableExists(con, "empInfo")) {
                // CREATE THE TABLE. EmployeeDatabase we have created the table
                EmployeeDatabase.createTable(con); // SQL exception
                System.out.println(" Table empInfo created successfully");
            } else {
                System.out.println("Table empInfo already exists.");
            }
            /*
             * CREATE THE TABLE. EmployeeDatabase we have created the table
             * EmployeeDatabase.createTable(con); // SQL exception
             * System.out.println("Table empInfo created successfully");
             */

            // Insert the Records
            EmployeeDatabase.InsertRecords(con);
            System.out.println(" the Records Inserted successfully");
            
            //Update Records
              EmployeeDatabase.updateRecords(con);
              System.out.println(" the Records Updated successfully");  // when we are doing this /* Insert the Records and */ selectrecords  will not be able to show any records beacuse in sql no data are already present it can only present in terminal those information which is already there is the sql

            // Read/Seclect the Records
             EmployeeDatabase.selectRecords(con);
            // Delete Records
             EmployeeDatabase.deleteRecords(con);
             
        } catch (SQLException exc) {
            exc.printStackTrace(); // Handle SQL exception
        } catch (Exception exce) {
            exce.printStackTrace(); // Handle general exception
        } finally {// to break the connection after the work done
            try {
                if (con != null) {// If the connection is not equal to none, that means the connection is
                                  // established the work is done, so close the connection
                    // If the connection is equal to null, then the work is not done yet.
                    // The connection is not established, and if the connection is not established,
                    // it cannot be closed.
                    con.close();
                }
            } catch (SQLException excep) {
                excep.printStackTrace();
            }
        }
    }// it will gives us 2 kind of exception to handle this we need to use multiple
     // catch block
}// finally will execute whether it gives exception on not !
/*
 * > cd
 * "c:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java\JDBC -Project\JDBC employee Data Set\src\"
 * ; if ($?) { javac JDBCTest.java } ; if ($?) { java JDBCTest }
 * java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
 * at
 * java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader
 * .java:641)
 * at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(
 * ClassLoaders.java:188)
 * at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
 * at java.base/java.lang.Class.forName0(Native Method)
 * at java.base/java.lang.Class.forName(Class.java:391)
 * at java.base/java.lang.Class.forName(Class.java:382)
 * at JDBCUtil.getConnection(JDBCUtil.java:34)
 * at JDBCTest.main(JDBCTest.java:11)
 */
// https://dev.mysql.com/downloads/connector/j/
// https://dev.mysql.com/downloads/file/?id=522774
// C:\Users\Sumanta Bhattacharya\Downloads\mysql-connector-j-8.2.0.zip
// C:\Users\Sumanta
// Bhattacharya\Downloads\mysql-connector-j-8.2.0.zip\mysql-connector-j-8.2.0
// Select Operating System:
// PLATFORM INDEPENDENT

/*
 * JAVA PROJECTS
 * REFERENCED LIBRARIES
 * +
 */
/*
 * rs\SUMANT~1\AppData\Local\Temp\cp_c008h4qtlss3l26xy5rue5gwb.argfile'
 * 'JDBCTest'
 * THE CONNECTION IS ESTABLISHED
 */
/*
 * PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java> &
 * 'C:\Program Files\Java\jdk-20\bin\java.exe'
 * '@C:\Users\SUMANT~1\AppData\Local\Temp\cp_c008h4qtlss3l26xy5rue5gwb.argfile'
 * 'JDBCTest'
 * THE CONNECTION IS ESTABLISHED
 * Table empInfo created successfully
 */
/*
 * THE CONNECTION IS ESTABLISHED
 * java.sql.SQLSyntaxErrorException: Table 'empinfo' already exists
 * at
 * com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:121)
 * at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(
 * SQLExceptionsMapping.java:122)
 * at com.mysql.cj.jdbc.StatementImpl.executeInternal(StatementImpl.java:767)
 * at com.mysql.cj.jdbc.StatementImpl.execute(StatementImpl.java:652)
 * at EmployeeDatabase.createTable(EmployeeDatabase.java:14)
 * at JDBCTest.main(JDBCTest.java:28)
 * 
 * IT IS GIVING US EXCEPTION BECAUSE THE CONNECTION IS ALREADY EMPINFO IS
 * ALREADY INCERTED/CREATED INSIDE THE EMPDATASET
 */