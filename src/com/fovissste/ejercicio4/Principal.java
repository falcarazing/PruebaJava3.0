package com.fovissste.ejercicio4;

import com.fovissste.ejercicio4.Repository.ReporteRepo;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) throws SQLException, FileNotFoundException {
        ReporteRepo repo = new ReporteRepo();
        repo.CrearYEscribirEnFile();
    }
}
