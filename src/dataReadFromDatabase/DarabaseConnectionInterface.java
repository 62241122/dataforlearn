package dataReadFromDatabase;

import java.sql.Connection;

/**
 * Created by jin on 2016/7/21.
 */
public interface DarabaseConnectionInterface {
    public Connection getConnection();
    public void close() throws Exception ;
}
