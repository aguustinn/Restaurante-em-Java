import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Restaurante {


    public void metodoPrincipal(){
        boolean verdadeiro = true;
        while(verdadeiro = true){
            Cliente cliente = new Cliente();
            ItemPedido pedido = new ItemPedido();
            Cardapio cardapio = new Cardapio();
            int opcao, contador = 1;
            Scanner scanner = new Scanner(System.in);
            List<Prato> pratoList = new ArrayList<>();

            System.out.println("Digite a opção correspondente do seu prato: ");
            for (int i = 0; i < cardapio.getPratoList().size(); i++){

                System.out.printf("Prato n°: " + (i + 1) + " | Nome: "+ cardapio.getPratoList().get(i).getNome() + "\n");
            }
            opcao = scanner.nextInt();
            if (opcao > 0 && opcao < 5){
                pratoList.add(cardapio.getPratoList().get(opcao));
                pedido.setPratos(pratoList);
                pedido.setNum(contador);
                pedido.setCliente(cliente);
                contador++;
            }else{
                System.out.println("Opção inválida.");
                return;
            }
            pedido.exibirInfo();
            break;
        }









    }
}
