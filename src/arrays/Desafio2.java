package arrays;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean itsOn = true;
        String[] ninjasCadastrados = new String[10];
        int contador = 0;

        while (itsOn) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int resposta = sc.nextInt();
            sc.nextLine();
            switch (resposta) {
                case 1:
                    if (contador > 9) {
                        System.out.println("Número máximo de ninjas cadastrados atingido, você pode listá-los ou encerrar o programa.");
                    } else {
                        System.out.println("Digite o nome do Ninja");
                        String nomeNinja = sc.nextLine();
                        ninjasCadastrados[contador] = nomeNinja;
                        System.out.println("Ninja Cadastrado1 com sucesso!");
                        ++contador;
                    }
                    break;
                case 2:
                    System.out.println("Aqui está a lista de Ninjas ja cadastrada");

                    for (int i = 0; i < ninjasCadastrados.length; ++i) {
                        if (ninjasCadastrados[i] != null) {
                            System.out.println(ninjasCadastrados[i]);
                        }
                    }
                    break;
                case 3:
                    sc.close();
                    itsOn = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

    }
}
