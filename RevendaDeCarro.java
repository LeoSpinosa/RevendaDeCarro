package RevendaDeCarro;

import java.util.*;

public class Atividade_RevendaDeCarro {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        List<String> estoqueCarro = new ArrayList<>();

        int contador = 1;

        System.out.println("====== Spinosa's Car ======");

        for (int a = 0; a < 6; a++) {

            System.out.println("\nInforme o " + contador + "° carro para preencher o estoque: ");
            String carros = input.next();

            estoqueCarro.add(carros);
            contador += 1;

        }

        while (true) {

            System.out.println("Deseja continuar acrescentando o estoque? (SIM ou NAO) ");
            String resposta = input.next();

            if (resposta.toUpperCase().equals("SIM")) {
                System.out.println("Informe o " + contador + "° carro para preencher o estoque: ");
                String carros = input.next();

                estoqueCarro.add(carros);
                contador += 1;

                System.out.println("Deseja continuar acrescentando o estoque? (SIM ou NAO) ");
                resposta = input.next();

                if (resposta.toUpperCase().equals("NAO")) {

                    break;

                } else if (resposta.toUpperCase().equals("NÃO")) {

                    break;

                } else {

                    System.out.println("Informação inválida");
                }

            } else if (resposta.toUpperCase().equals("NAO")) {

                break;

            } else {

                System.out.println("Informação inválida");
            }

        }

        System.out.println("\nTemos em estoque os seguintes carros; " + estoqueCarro);

        while (true) {

            System.out.println("\nQual carro deseja comprar? ");
            String escolhaCarro = input.next();

            if (estoqueCarro.contains(escolhaCarro)) {

                System.out.println("\nDeseja comprar o " + escolhaCarro + "? (SIM ou NAO) ");
                String compraCarro = input.next();

                if (compraCarro.toUpperCase().equals("SIM")) {

                    System.out.println("Certo, como você planeja compra-lo? 1 = AVISTA ou 2 = TROCA ");
                    int compraTroca = input.nextInt();

                    if (compraTroca == 1) {

                        System.out.println("\nParabens, voce comprou o " + escolhaCarro);

                        estoqueCarro.remove(escolhaCarro);

                        Thread.sleep(1500);
                        System.out.println("\nAinda temos em estoque os carros; " + estoqueCarro);

                        break;

                    } else if (compraTroca == 2) {

                        System.out.println("Ok, vamos fazer a troca de seu carro..");

                        Thread.sleep(1000);

                        System.out.println("Qual seu carro para troca? ");
                        String carroUsuario = input.next();

                        System.out.println("\nParabens, voce comprou o " + escolhaCarro + " em troca do " + carroUsuario);

                        int indiceCarro = estoqueCarro.indexOf(escolhaCarro);
                        estoqueCarro.set(indiceCarro, carroUsuario);

                        Thread.sleep(1500);
                        System.out.println("\nAgora temos em estoque os carros; " + estoqueCarro);

                        break;

                    } else {

                        System.out.println("Informação inválida");
                    }

                } else if (compraCarro.toUpperCase().equals("NAO")) {

                    System.out.println("Até a proxima então.");
                    break;

                } else {

                    System.out.println("\nInformação inválida");
                }

            } else {

                while (true) {

                    System.out.println("O carro escolhido não temos em estoque, apenas os seguintes carros; ");
                    System.out.println(estoqueCarro);

                    Thread.sleep(1000);
                    break;
                }

            }

        }

    }

}
