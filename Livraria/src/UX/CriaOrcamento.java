package UX;

import DAO.DAOOrcamento;
import Models.ItemOrcamento;
import java.util.ArrayList;
import java.util.Scanner;

public class CriaOrcamento {
    public static int Menu() {

        System.out.println("-----------------------------------------" + "\n" +
                "DIGITE A OPÇÃO DESEJADA: " + "\n" +
                "[1] Para adiconar um livro a lista" + "\n" +
                "[2] Para cancelar o orçamento" + "\n" +
                "-----------------------------------------");

        Scanner entry = new Scanner(System.in);
        int escolha = entry.nextInt();
        return escolha;
    }

    public static boolean Escolha(int escolha) {

        ArrayList<ItemOrcamento> listaItens = new ArrayList<>();
        double valortotal = 0;

        switch (escolha) {

            case 1:
                String nomeIsbn;
                int flag = 0;
                do {
                    System.out.println("Livro | Valor Unitário | Quantidade");
                    for (ItemOrcamento itensOrcamento : listaItens) {

                        System.out.println(itensOrcamento.getNome() + " | " + itensOrcamento.getValor_unit() + " | " + itensOrcamento.getQuantidade() + "\n");
                    }
                    System.out.println("Digite o nome do livro ou seu ISBN, se desejar continuar com o orçamento digite 1 se deseja cancelar o orçamento digite 0 :");
                    Scanner sc = new Scanner(System.in);
                    nomeIsbn = sc.nextLine();
                    DAOOrcamento.TabletoList(nomeIsbn, listaItens);
                    if (nomeIsbn.equals("0")) {
                        System.out.println("Se deseja mesmo cancelar digite 0, se não digite 1 :");
                        Scanner canc = new Scanner(System.in);
                        int cancel = canc.nextInt();
                        if (cancel == 0) {
                            System.out.println("O orçamento foi cancelado");
                            return true;
                        }

                    } else if (nomeIsbn.equals("1"))
                        flag = 1;
                } while (flag == 0);

                for (ItemOrcamento itensOrcamento : listaItens) {
                    valortotal = valortotal + (itensOrcamento.getValor_unit() * itensOrcamento.getQuantidade());
                }

                System.out.println("Informe nome ou razão social: ");

                Scanner sc = new Scanner(System.in);

                String nome = sc.nextLine();

                flag = 1;
                String CPFCNPJ = null;
                while (flag == 1) {
                    System.out.println("Informe cpf ou cnpj: ");
                    CPFCNPJ = sc.nextLine();
                    if (CPFCNPJ.length() < 11 || CPFCNPJ.length() > 14) {
                        System.out.println("CPF ou CNPJ inválidos\n");
                        flag = 1;
                    } else {
                        flag = 0;
                    }
                }


                flag = 1;
                String data;
                System.out.println("Informe a data: ");
                data = sc.nextLine();
                while (flag == 1) {
                    if (data == "") {
                        System.out.println("Data não informada");
                        flag = 1;
                        System.out.println("Informe a data: ");
                        data = sc.nextLine();
                    } else {
                        flag = 0;
                    }
                }


                System.out.println("-----------------------------------------" + "\n" +
                        "DIGITE A OPÇÃO DESEJADA PARA A FORMA DE PAGAMENTO: " + "\n" +
                        "[1] Para pagar com dinheiro" + "\n" +
                        "[2] Para pagar com pix" + "\n" +
                        "-----------------------------------------");

                int formapagamento = sc.nextInt();


                System.out.println("-----------------------------------------" + "\n" +
                        "SEGUE A LISTA COMPLETA DO ORÇAMENTO" + "\n" +
                        "-----------------------------------------");


                System.out.println("Livro | Valor Unitário | Quantidade");

                for (ItemOrcamento itensOrcamento : listaItens) {

                    System.out.println(itensOrcamento.getNome() + " | " + itensOrcamento.getValor_unit() + " | " + itensOrcamento.getQuantidade() + "\n");

                }

                System.out.println("Valor total: " + valortotal);

                System.out.println("-----------------------------------------" + "\n" +
                        "DIGITE A OPÇÃO DESEJADA PARA A IMPRESSÃO: " + "\n" +
                        "[1] PASSAR A LISTA PARA UM ARQUIVO" + "\n" +
                        "[2] TERMINAR O ORÇAMENTO" + "\n" +
                        "-----------------------------------------");

                int imprimir = sc.nextInt();

                if (imprimir == 1) {
                    DAOOrcamento.Escrevearquivo(nome, CPFCNPJ, data, valortotal, formapagamento, listaItens);
                    System.out.println("Orçamento realizado com sucesso");

                } else
                    System.out.println("Fim do orçamento");

            case 2:
                System.out.println("Fim do orçamento");

            default:
                return false;
        }

    }
}
