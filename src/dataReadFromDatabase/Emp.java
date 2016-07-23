package dataReadFromDatabase;

import java.util.Date;

/**
 * Created by jin on 2016/7/23.
 */
public class Emp {
    private int     devicenum;
    private String  ename;
    private Date regdate;
    private char[] code = new char[20];  ;

    public int getDevicenum() {
        return devicenum;
    }

    public void setDevicenum(int devicenum) {
        this.devicenum = devicenum;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public char[] getCode() {
        return code;
    }

    public void setCode(char[] code) {
        this.code = code;
    }
}
