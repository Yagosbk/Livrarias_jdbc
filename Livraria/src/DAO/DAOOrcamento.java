package DAO;

import Models.ItemOrcamento;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DAOOrcamento {

    public static void TabletoList(String entrada, ArrayList listaItens) {
        Connection connection = null;
        Statement selectStmt = null;
        ResultSet resultSet = null;
        ;
        try {
            connection = DriverManager.getConnection("URL", "root", "root");
            selectStmt = connection.createStatement();
            ResultSet rs = selectStmt.executeQuery("SELECT * FROM livros WHERE nome = '" + entrada + "' OR isbn = '" + entrada + "'");
            while (rs.next()) {
                Models.ItemOrcamento o = new ItemOrcamento();
                o.setNome(rs.getString("nome"));
                o.setIsbn(rs.getString("isbn"));
                System.out.println("Digite a quantidade :");
                Scanner entry = new Scanner(System.in);
                int escolha = entry.nextInt();
                o.setQuantidade(escolha);
                o.setValor_unit(rs.getInt("valor_unit"));
                listaItens.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Escrevearquivo(String nome, String cpf, String data, double valortotal, int formadepagamento, ArrayList listaItens) {

        try {
            File myObj = new File("orcamento" + nome + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("Arquivo criado: " + myObj.getName());
            } else {
                System.out.println("Já existe esse arquivo.");
            }

            FileWriter myWriter = new FileWriter("orcamento" + nome + ".txt");
            myWriter.write("Nome : " + nome + "\n");
            myWriter.write("CPF : " + cpf + "\n");
            myWriter.write("Data : " + data + "\n");

            myWriter.write("Livro | Valor Unitário | Quantidade\n");

            myWriter.write(String.valueOf(listaItens) + "\n");


            if (formadepagamento == 1)
                myWriter.write("Tipo de pagamento : Dinheiro\n");

            else if (formadepagamento == 2)
                myWriter.write("Tipo de pagamento : Pix\n");

            myWriter.write("Valor total : " + valortotal + "\n");
            myWriter.close();

        } catch (IOException e) {
            System.out.println("Algum erro ocorreu.");
            e.printStackTrace();
        }
    }

}

