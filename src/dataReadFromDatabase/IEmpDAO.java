package dataReadFromDatabase;
import java.util.List;

/**
 * Created by jin on 2016/7/23.
 */
public interface IEmpDAO {
    public boolean doCreate(Emp emp) throws Exception ;
    public List<Emp> findAll(String keyWord) throws Exception ;
    public Emp findById(int empno) throws Exception ;
}
