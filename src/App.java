import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao = 0;
        MenuProduto n = new MenuProduto();

        do{
            opcao = n.exibirOpcoes();
        }while(opcao !=0);

    }
}
