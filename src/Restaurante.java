import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Restaurante {


    public void metodoPrincipal(){
        boolean verdadeiro = true;
        int opcao, contador = 1;
        List<ItemPedido> itens = new ArrayList<>();
        ItensPedidosBD pedidos = new ItensPedidosBD();
        Cardapio cardapio = new Cardapio();
        
        while(verdadeiro == true){
            Cliente cliente = new Cliente();
            ItemPedido pedido = new ItemPedido();
            Scanner scanner = new Scanner(System.in);
            List<Prato> pratoList = new ArrayList<>();

            System.out.println("=========================");
            System.out.println("Bem-vindo ao restaurante!");
            System.out.println("=========================");
            System.out.println("Digite seu nome: ");

            String nome = scanner.nextLine();
            cliente.setNome(nome);

            System.out.println("--------------------------------------------");
            System.out.println("Digite a opção correspondente do seu prato: ");
            for (int i = 0; i < cardapio.getPratoList().size(); i++){

                System.out.printf("## Prato n°: " + (i + 1) + " | Nome: "+ cardapio.getPratoList().get(i).getNome() + "\n");
            }
            opcao = scanner.nextInt();
            if (opcao > 0 && opcao <= 5){
                pratoList.add(cardapio.getPratoList().get(opcao - 1));
                pedido.setPratos(pratoList);
                pedido.setNum(contador);
                pedido.setCliente(cliente);
                itens.add(pedido);
                pedidos.setItemPedidoList(itens);
                contador++;
            }else{
                System.out.println("Opção inválida.");
                continue;
            }
            System.out.println("Você deseja receber o cupom fiscal de seu pedido? [1] - SIM [2] - NÃO");
            int opcaoCupom = scanner.nextInt();
            if (opcaoCupom == 1){
                System.out.println("Segue seu pedido/ticket:  ");
                pedido.exibirInfo();
            }
            System.out.println("Você deseja realizar um novo pedido? [1] - SIM [2] - NÃO");
            int opcaoRecomecar = scanner.nextInt();
            if (opcaoRecomecar == 1){
                System.out.println("Segue seu pedido/ticket:  ");
                System.out.println("Recomeçando. ");
                verdadeiro = true;
            }else {
                pedidos.exibirItensPedidosBD();
                verdadeiro = false;
            }


        }

    }
}
