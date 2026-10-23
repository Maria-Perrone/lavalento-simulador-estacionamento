-- Script de criação do Banco de Dados e Tabela para o Lava Lento
CREATE DATABASE IF NOT EXISTS lavalento CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE lavalento;

CREATE TABLE IF NOT EXISTS registro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(10) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    tipo_servico VARCHAR(50) NOT NULL,
    hora_entrada TIME,
    hora_saida TIME,
    valor_total DECIMAL(10, 2)
);
