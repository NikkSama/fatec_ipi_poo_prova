package a4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList <Item> itens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("0-Sair\n1-Adicionar item à coleção\n2-Exibir coleção\n3-Exibir valor da coleção");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    int opcaoAdicionar;
                    do {
                        System.out.println("\n0-Sair\n1-Adicionar moeda\n2-Adicionar selo regular\n3-Adicionar selo comemorativo");
                        opcaoAdicionar = scanner.nextInt();
                        String descricaoItem;
                        float valor;
                        switch (opcaoAdicionar) {
                            case 1:
                                System.out.println("Valor moeda: ");
                                valor = scanner.nextFloat();
                                Moeda moeda = new Moeda(valor);
                                itens.add(moeda);
                                break;
                            case 2:
                                System.out.println("Descrição selo regular: ");
                                descricaoItem = scanner.next();
                                System.out.println("Valor selo regular: ");
                                valor = scanner.nextFloat();
                                SeloRegular seloRegular = new SeloRegular (descricaoItem, valor);
                                itens.add(seloRegular);
                                break;
                            case 3:
                                System.out.println("Descrição selo comemorativo: ");
                                descricaoItem = scanner.next();
                                System.out.println("Valor selo comemorativo: ");
                                valor = scanner.nextFloat();
                                SeloComemorativo seloComemorativo = new SeloComemorativo(descricaoItem, valor);
                                itens.add(seloComemorativo);
                                break;
                            default:
                                break;
                        }
                    } while (opcaoAdicionar != 0);
                    break;
                case 2:
                    for(Item item : itens) {
                        item.exibir();
                    }
                    break;
                case 3:
                    float total = 0;
                    for(Item item : itens) {
                        total += item.getValor();
                    }
                    System.out.println("o valor total é " + total);
                    break;
                default:
                    break;
            }
        }while(opcao != 0);
    }
}
