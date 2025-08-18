import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_connection {

    WebDriver driver;

    public Database_connection(WebDriver driver) {
        this.driver = driver;
    }

    // Connection object
    static Connection con = null;
    // Statement object
    private static Statement stmt;
    // Constant for Database URL
    public static String db_url = "jdbc:mysql://localhost/Testdata";
    //Database username
    public static String db_user = "Your name";
    //Database password
    public static String db_password = "Your password";

    @BeforeTest
    public void setup() throws Exception{

        try{
            // Database connection
            String db_class = "com.mysql.cj.jdbc.Driver";
            Class.forName(db_class).newInstance();
            // Get connection to DB
            Connection con = DriverManager.getConnection(db_url, db_user, db_password);
            // Statement object to send the SQL statement to the Database
            stmt = con.createStatement();

        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Test
    public void test() {
        try{
            String query = "select * from testingdata";
            // Get the contents of userinfo table from DB
            ResultSet res = stmt.executeQuery(query);
            // Print the result untill all the records are printed
            // res.next() returns true if there is any next record else returns false
            while (res.next()){
                System.out.println(res.getString(1));
                System.out.println(res.getString(2));
                System.out.println(res.getString(3));
                System.out.println(res.getString(4));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    @AfterTest
    public void tearDown() throws Exception {
        // Close DB connection
        if (con != null) {
            con.close();
        }
    }
}
