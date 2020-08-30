package SapXepGiamDan;

import Connectionn.TimLaptop;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Connect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        java.sql.Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                    "store_cms_plusplus?characterEncoding=utf8", "root", "Anhluankk1999");
            System.out.println("SQL Connection to database established!");
            //showlaptop
            //TimLaptop tim = new TimLaptop(connection);
            //tim.showInfoLaptop();
            System.out.println(" Sap xep laptop giam dan theo so ban");
            SapXep sapXep = new SapXep();
            sapXep.sapXepGiamDan();


        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console " + e);
            return;
        }
    }
}
