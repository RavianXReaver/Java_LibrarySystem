/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;

import java.sql.SQLException;

/**
 *
 * @author shenal
 */
public class Member implements Person,Manage {
    String execmsg="-1";
    @Override
    public String addPerson(String title, String name, String nationality, String city, String country, String contact) {
       String sql = "INSERT INTO Author(title,name,nationality,city,country,contact)" +
                "VALUES('"+title+ "','"+name+ "','"+nationality+ "','"+city+ "','"+country+ "','"+contact+"')";
         try{
    DatabaseCon con = new DatabaseCon();
    execmsg=con.insert(sql);
    }
    
    catch(SQLException e){
        execmsg = "Could not add Member!";
    }
    catch(Exception e){
        
        execmsg = e.toString();
    }
    finally{
    return execmsg;
    } 
    }

    @Override
    public void viewPerson() {
       
    }
    
     @Override
    public void search() {
       
    }

    @Override
    public void sort() {
        
    }

    
}
