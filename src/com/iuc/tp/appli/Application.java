package com.iuc.tp.appli;

import com.iuc.tp.bd.DataBase;

public class Application {

    public static void main(String[] args) {
        System.out.println("==== APPLICATION BD ====");

        DataBase dataBase = new DataBase(2);
        dataBase.chargerDriver();
        dataBase.seConnecter("127.0.0.1", "3306", "bd_iuc_3il", "root", "");
    }
}
