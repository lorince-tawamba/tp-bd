package com.iuc.tp.appli;

import com.iuc.tp.bd.DataBase;

public class Application {

    public static void main(String[] args) {
        System.out.println("==== APPLICATION BD ====");

        DataBase dataBase = new DataBase(1);
        dataBase.chargerDriver();
        dataBase.seConnecter("127.0.0.1", "3306", "bd_iuc_3il", "root", "");

        String query = "INSERT INTO `tb_customer` (`id`, `address`, `email`, `nom`, `prenom`, `tel`) VALUES ('2', 'Yaoundé', 'iuc@yahoo.fr', 'NVODO', 'Serge', '67392804');";
        int nbre = dataBase.ecrire(query);
        System.out.println("==== NOMBRE D'ELEMENT ECRIT : " + nbre + " ====");
    }
}
