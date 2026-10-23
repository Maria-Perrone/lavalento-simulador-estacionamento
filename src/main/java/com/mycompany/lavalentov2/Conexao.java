package com.mycompany.lavalentov2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() {
        try {
            // Substitua "sua_senha" pela senha do seu MySQL Workbench
            String senha = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : "sua_senha";
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/lavalento", "root", senha);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}
