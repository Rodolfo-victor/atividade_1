package br.com.lista_atividade;

import java.io.*;

public class CriarArquivo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("meuarquivo.txt");
            fileWriter.write("Olá, mundo!\n");
            fileWriter.close();
            System.out.println("A mensagem foi escrita com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao tentar escrever no arquivo!.");
            e.printStackTrace();
        }
    }
}
