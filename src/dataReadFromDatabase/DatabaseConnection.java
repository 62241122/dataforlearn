package dataReadFromDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Created by jin on 2016/7/21.
 */
public class DatabaseConnection implements DarabaseConnectionInterface{
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/learn";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public Connection conn = null;
    public DatabaseConnection() throws Exception {
        try {
            Class.forName(DRIVER);
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (Exception e){
            throw e ;
        }finally {

        }
    }
    public Connection getConnection(){
        return this.conn ;
    }
    public void close() throws Exception {
        if(this.conn != null){
            try{
                this.conn.close() ;
            }catch(Exception e){
                throw e ;
            }finally {

            }
        }
    }


}
