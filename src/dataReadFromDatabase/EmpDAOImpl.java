package dataReadFromDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jin on 2016/7/23.
 */
public class EmpDAOImpl {
    private Connection conn = null ;
    private PreparedStatement pstmt = null ;
    public EmpDAOImpl(Connection conn){
        this.conn = conn ;
    }

    public boolean doCreate(Emp emp) throws Exception{
        boolean flag = false ;
        String sql = "INSERT INTO emp(devicenum,ename,regdate,code) VALUES (?,?,?,?)" ;
        this.pstmt = this.conn.prepareStatement(sql) ;
        this.pstmt.setInt(1,emp.getDevicenum()) ;
        this.pstmt.setString(2,emp.getEname()) ;
        this.pstmt.setDate(3,new java.sql.Date(emp.getRegdate().getTime()));
        this.pstmt.setString(4,emp.getCode().toString());
        if(this.pstmt.executeUpdate() > 0){
            flag = true ;
        }
        this.pstmt.close() ;
        return flag ;
    }

    public List<Emp> findAll(String keyWord) throws Exception{
        List<Emp> all = new ArrayList<Emp>() ;
        String sql = "SELECT devicenum,ename,regdate,code FROM emp WHERE devicenum LIKE ? OR ename LIKE ?" ;
        this.pstmt = this.conn.prepareStatement(sql) ;
        this.pstmt.setString(1,"%"+keyWord+"%") ;
        this.pstmt.setString(2,"%"+keyWord+"%") ;
        ResultSet rs = this.pstmt.executeQuery() ;
        Emp emp = null ;
        while(rs.next()){
            emp = new Emp() ;
            emp.setEmpno(rs.getInt(1)) ;
            emp.setEname(rs.getString(2)) ;
            emp.setJob(rs.getString(3)) ;
            emp.setHiredate(rs.getDate(4)) ;
            emp.setSal(rs.getFloat(5)) ;
            all.add(emp) ;
        }
        this.pstmt.close() ;
        return all ;
    }
}
