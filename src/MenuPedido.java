import java.util.Scanner;

public class MenuPedido {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("--Menu--");
            System.out.println("1- Criar Lista de Produtos");
            System.out.println("2- Adicionar Elementos");
            System.out.println("3- Listar Elementos");
            System.out.println("4- Remover um Produto");
            System.out.println("5- Exibir Informações da Lista");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    break;
            }
        } while (opcao != 5); 
            sc.close();
    }
}
