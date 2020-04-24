package com.fovissste.ejercicio4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Conexion() {
    }

    public Connection ConexionSql(){
        Connection conn = null;
        String dbName = "test";
        String serverip="45.40.139.98";
        String instancia = "SQLEXPRESS";
        String serverport="1433";
        String databaseUserName = "AdminBD_des";
        String databasePassword = "Desa#0216";
        String url = "jdbc:sqlserver://"+serverip+"\\"+instancia+":"+serverport+";databaseName="+dbName+"";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
