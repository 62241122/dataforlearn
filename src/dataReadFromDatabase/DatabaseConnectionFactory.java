package dataReadFromDatabase;

/**
 * Created by jin on 2016/7/23.
 */
public class DatabaseConnectionFactory {
    public static DatabaseConnection getDatabaseConnectionInstance() throws Exception{
        return new DatabaseConnection() ;
    }
}

