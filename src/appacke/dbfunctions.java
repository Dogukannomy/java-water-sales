




package appacke;

import java.sql.PreparedStatement;
import java.sql.ResultSet;





public class dbfunctions {
   
    DB db = new DB ();
    
    /**
     * admin login
     * @param username
     * @param userpass
     * @return boolean
     */
    public boolean adminlogin (String username , String userpass ){
        boolean statu = false;
        try {
            String query = "SELECT * FROM `waterdrink` WHERE `username` = ? AND `userpass` = ? ";
            PreparedStatement pre = db.pre(query);
            pre.setString(1, username);
             pre.setString(2, userpass);
             ResultSet rs = pre.executeQuery();
             statu = rs.next();
        } catch (Exception e) {
            System.err.println("admin login error" + e);
            statu = false;
        }
        return statu ;
    }
    
    
    
}
