package com.fovissste.ejercicio4.Repository;

import com.fovissste.ejercicio4.Conexion;

import java.io.*;
import java.sql.*;

public class ReporteRepo {
    Connection connection;
    String selectSql = "select p.id_estado, sum(p.numero_empleado) as total_empleados_estado, e.nombre\n" +
            "from  plantas p\n" +
            "inner join estados e on p.id_estado = e.id_estado\n" +
            "group by p.id_estado,e.nombre";

    public ReporteRepo() {
        connection = new Conexion().ConexionSql();
    }

    public StringBuffer getDatosDeBd() throws SQLException {
        ResultSet resultSet = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                stringBuffer.append(resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3));
                stringBuffer.append(System.getProperty("line.separator"));
                System.out.println(resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3));
            }
        } catch (SQLException e) {
            return null;
        }
        finally {
            if(connection != null){
                connection.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        }
        return stringBuffer;
    }

    public void CrearYEscribirEnFile() throws SQLException {
        StringBuffer stringBuffer = getDatosDeBd();
        System.out.println("stringBuffer:"+ stringBuffer);
        File fichero = new File ("ReporteEmpleados.txt");
        System.out.println(fichero);
        String linea = "id_estado"+","+"numero_empleados"+","+"Nombre_estado";
        BufferedWriter output = null;
        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            output = new BufferedWriter(new FileWriter((fichero), false));
            output.append(linea);
            output.append(System.getProperty("line.separator"));
            output.write(String.valueOf(stringBuffer));
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                output.flush();
                if (output  != null) {
                    output.close();
                }
            } catch (Exception e2) { }
        }

    }

}
