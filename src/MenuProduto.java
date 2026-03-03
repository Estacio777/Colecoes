import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduto{

    ArrayList<Produto> produtos = new ArrayList<>();

    public int exibirOpcoes(){
        int opcao=-1;

        Scanner s = new Scanner(System.in);

        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Remover Produto");
        System.out.println("3- Listar Produto");
        System.out.println("4- Exibir Informacoes de um Produto");
        System.out.println();
        System.out.println("Ou Digite 0 para Sair!");
        System.out.println("Qual a Opcao Desejada?");

        if (s.hasNextInt()) {
            opcao = s.nextInt();
            this.executaAcao(opcao);
        }
        else{
            System.out.println("Opcao Escolhida Invalida!");
        }

    

        return opcao;
    }
    public void executaAcao(int opcao){
        if (opcao==1) {
            this.cadastrar();
        }
    }
        public void cadastrar(){
            Scanner s = new Scanner(System.in);
            System.out.print("Digite o nome do produto:");
            String nome = s.next();
            System.out.print("Digite o preco do produto:");
            double preco = s.nextDouble();
            Produto p = new Produto(nome, preco);
            produtos.add(p);
            System.out.print("Produto cadastrado com sucesso!");
        }
    
}