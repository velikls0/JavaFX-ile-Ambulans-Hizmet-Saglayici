package sample;

import java.sql.*;

public class SQLiteJDBC {


    SQLiteJDBC AmbulansHizmetSağlayıcı = new SQLiteJDBC();


    public void addNewUser(String isimSoyisim, int tel, String adres, int yas, String rahatsizligi){
        Connection c = null;
        Statement stmt = null;
        ResultSet rslt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:src\\AmbulansHizmetSağlayıcı.db");
            stmt = c.createStatement();


            String sql = "INSERT INTO Giris (ISIMSOYISIM, TEL, ADRES, YAS, RAHATSIZLIGI)" +
                    "VALUES ('"+ isimSoyisim +"', '"+tel+"', '"+ adres +"', '"+ yas +"', '"+ rahatsizligi +"');";

            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        }catch (Exception e){
            System.err.println(e.getClass().getName()+ ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Veri başarılı bir şekilde tabloya kayıt edildi...");
    }

    public ResultSet getColumn(String tableName){
        Connection c = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:src\\AmbulansHizmetSağlayıcı.db");
            System.out.println("Bağlantı başarılı");

            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM " + tableName);

            rs.close();
            stmt.close();
            c.close();

            return rs;
        }catch (Exception e){
            System.err.println(e.getClass().getName()+ ": " + e.getMessage());
            System.exit(0);
        }

        return rs;
    }







}
