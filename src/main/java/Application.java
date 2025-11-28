import entities.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println(
                    "===== MENU =====\n" +
                            "1 - Cadastrar produto\n" +
                            "2 - Listar produtos\n" +
                            "3 - Atualizar quantidade\n" +
                            "4 - Atualizar preço\n" +
                            "5 - Remover produto\n" +
                            "6 - Buscar produto\n" +
                            "7 - Sair\n"
            );

            System.out.print("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine(); // limpa ENTER

            switch (option) {

                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = sc.nextLine();

                    System.out.println("Digite a quantidade:");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o preço:");
                    double preco = sc.nextDouble();
                    sc.nextLine();


                    Product p = new Product(nome, quantidade, preco);
                    products.add(p);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("===LISTA DE PRODUTOS===");

                    if (products.isEmpty()) {
                        System.out.println("Nao há nenhum produto cadastrado até agora");
                    } else {
                        for (int i = 0; i < products.size(); i++) {
                            Product item = products.get(i);

                            System.out.println(
                                    "Nome: " + item.getnome() +
                                            " | Quantidade: " + item.getquantidade() +
                                            " | Preço: " + item.getpreco()
                            );
                        }
                    }

                    break;
                case 3:
                    if (products.isEmpty()){
                        System.out.println("Não há nenhum produto cadastrado até agora");

                    }else{
                        for (int i = 0; i <products.size() ; i++) {
                            Product item = products.get(i);
                            System.out.println("posição " + (i + 1) +
                                    "Nome: " + item.getnome() +
                                    " | Quantidade: " + item.getquantidade() +
                                    " | Preço: " + item.getpreco());
                        }
                        System.out.println("Qual produto vc deseja alterar ?");
                        int posicao=sc.nextInt();
                        sc.nextLine();
                        int index =posicao -1 ;
                        Product escolhido= products.get(index);
                        break;
                        



                        }

                    }
            }
        }

        sc.close();
    }
}
