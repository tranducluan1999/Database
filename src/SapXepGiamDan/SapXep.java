package SapXepGiamDan;

import java.sql.*;
import java.util.List;

public class SapXep {

        private Connection connect;

    public SapXep(Connection connect) {
        this.connect = connect;
    }

    public SapXep() {

    }

    public void sapXepGiamDan()
        {

            String sql ="select * from laptop order by sold desc";
            try {
                Statement stm = connect.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while (rs.next())
                {

                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String url =rs.getString(3);
                    String maker =rs.getString(4);
                    String type =rs.getString(5);
                    String ram =rs.getString(6);
                    String cpu =rs.getString(7);
                    String ssd =rs.getString(8);
                    String hdd =rs.getString(9);
                    String price =rs.getString(10);
                    String card =rs.getString(11);
                    String screenResolution =rs.getString(12);
                    String screenSize =rs.getString(13);
                    int sold = rs.getInt(14);
                    Timestamp cretedTimestamp = rs.getTimestamp(15);
                    Timestamp lastUpdatedTimestamp = rs.getTimestamp(16);
                    System.out.println( "ID: " + id + ", Name: " + name + ", Url: " + url + ", Maker: " + maker+ ", Type: " + type
                            + ", Ram: " + ram + ", CPU: " + cpu + ", SSD: " + ssd + ", HDD :" +hdd + ", Price: " + price
                            + ", Card: " + card + ", ScreenResolution: " +  screenResolution + ",ScreenSize: "+ screenSize +
                            ", Sold: " + sold + ", CreatedTimestamp: " + cretedTimestamp + ", LastUpdatedTimestamp: "+ lastUpdatedTimestamp);

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
}
