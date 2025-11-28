import entities.Product;

import java.util.ArrayList;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Product> products = new ArrayList<>();


    boolean running = true;


    while(running){
        System.out.println("======== MENU ========\n" +
                "1 - Cadastrar produto\n" +
                "2 - Listar produtos\n" +
                "3 - Atualizar quantidade\n" +
                "4 - Atualizar preço\n" +
                "5 - Remover produto\n" +
                "6 - Buscar produto\n" +
                "7 - Sair\n" +
                "Escolha uma opção:\n");

        int option;
        option=sc.nextInt();
        sc.nextLine();
        switch (option){
            case 1:
                System.out.println("Digite o nome do produto");
                String nome=sc.nextLine();
                System.out.println("Digite o preço do produto ");
                double preco = sc.nextDouble();
                System.out.println("Digite a quantidade desse produto");
                int quantidade=sc.nextInt();
                sc.nextLine();//limpa a quebra
                Product p = new Product(nome,preco,quantidade);//aqui eu criei o objeto Product
                products.add(p);
                System.out.println("Produto cadastrado com sucesso!");





                break;

            case 2:
                //Listas
                break;

            case 3:
            // atualizar quantidade
            break;

            case 4:
                // atualizar preço
                break;

            case 5:
                // remover
                break;

            case 6:
                // buscar
                break;

            case 7:
             running = false;
             break;

            default:
                //se digitar algo fora da lista
        }
    }
    sc.close();
    }
}