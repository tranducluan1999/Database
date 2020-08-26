package Connectionn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Connecctionn {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                    "store_cms_plusplus?characterEncoding=utf8", "root", "Anhluankk1999");
            System.out.println("SQL Connection to database established!");
            //showlaptop
            TimLaptop tim = new TimLaptop(connection);
            tim.showInfoLaptop();

            // Find laptop by price
            System.out.println(" Nhập giá thứ nhất: ");
            float x = sc.nextFloat();

            System.out.println(" Nhập giá thứ hai: ");
            float y =sc.nextFloat();
            tim.findLaptopByPrice(x,y);

            // find laptop by o cung va hang sx
            tim.findLaptopByHardDriveAndMaker();
            

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console "  + e);
            return ;
        }
    }
}
