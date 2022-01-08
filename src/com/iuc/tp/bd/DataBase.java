package com.iuc.tp.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private String mysqlDriverName = "com.mysql.cj.jdbc.Driver";
    private String postgreDriverName = "org.postgresql.Driver";
    private String oracleDriverName = "oracle.jdbc.driver.OracleDriver";
    private int choixDriver = 0;
    private Connection connection;

    public DataBase(int choixDriver) {
        super();
        this.choixDriver = choixDriver;
    }

    public void chargerDriver() {
        try {
            switch (choixDriver) {
                case 1: {
                    Class.forName(mysqlDriverName).newInstance();
                    System.out.println("==== DRIVER : " + mysqlDriverName + " ====");
                    break;
                }
                case 2: {
                    Class.forName(postgreDriverName).newInstance();
                    System.out.println("==== DRIVER : " + postgreDriverName + " ====");
                    break;
                }
                case 3: {
                    Class.forName(oracleDriverName).newInstance();
                    System.out.println("==== DRIVER : " + oracleDriverName + " ====");
                    break;
                }
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void seConnecter(String host, String port, String dbName, String user, String password) {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?serverTimezone=Africa/Douala";
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("==== CONNEXION ====");
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
}
