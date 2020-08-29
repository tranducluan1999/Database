package Connectionn;

import java.sql.*;
import java.util.Scanner;

public class TimLaptop {

    private Connection connect;


    public TimLaptop(Connection connect) {
        this.connect = connect;

    }

    // Hiển thị thông tin lap top
    public void showInfoLaptop()
    {
        String sqlS = "Select * from laptop";
        try {
            Statement stm = connect.createStatement();
            ResultSet rs = stm.executeQuery(sqlS);

            System.out.println("---Thông tin laptop---");
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

        } catch (SQLException e) {
            System.out.println(" Sai cau lenh SQL!!! \n" + e);
        }


    }
    // Tìm laptop từ giá x đến giá y
    public void findLaptopByPrice(float x, float y)
    {
            String sql = " Select * from laptop where price between " + x + " and "+ y ;

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
        // tìm laptop bởi ổ cứng và hãng sản xuất

    public void findLaptopByHardDriveAndMaker( )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập hãng sản xuất: ");
        String make =sc.nextLine();
        System.out.println(" Nhập loại ổ cứng: ");
        System.out.println(" 1-SSD");
        System.out.println(" 2-HDD");
        int chon = sc.nextInt();
        sc.nextLine();
        System.out.println(" Nhập dung lượng ổ cứng: ");

         String dungluong =sc.nextLine();
        switch (chon)
        {

            case 1:
            {
                String sqlm = " Select * FROM laptop WHERE maker = " +"'" +make +"'"+ " AND ssd =" +"'"+ dungluong+"'";
                try {
                    Statement stmm = connect.createStatement();
                    ResultSet rs = stmm.executeQuery(sqlm);

                    while(rs.next())
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
                        System.out.println( " : " + id + ", Name: " + name + ", Url: " + url + ", Maker: " + maker+ ", Type: " + type
                                + ", Ram: " + ram + ", CPU: " + cpu + ", SSD: " + ssd + ", HDD :" +hdd + ", Price: " + price
                                + ", Card: " + card + ", ScreenResolution: " +  screenResolution + ",ScreenSize: "+ screenSize +
                                ", Sold: " + sold + ", CreatedTimestamp: " + cretedTimestamp + ", LastUpdatedTimestamp: "+ lastUpdatedTimestamp);

                    }




                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            }
            case 2:
            {
                String sqlh = " Select * FROM laptop WHERE maker = " +"'" +make +"'"+ " AND hdd =" +"'"+ dungluong+"'";
                try {
                    Statement stmh = connect.createStatement();
                    ResultSet rs = stmh.executeQuery(sqlh);
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
                break;

            }
            default:
            {
                System.out.println(" Mời bạn chọn lại!");
                break;
            }
        }

    }


}
