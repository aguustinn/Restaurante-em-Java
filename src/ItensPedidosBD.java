import java.util.ArrayList;
import java.util.List;

public class ItensPedidosBD {

    private List<ItemPedido> itemPedidoList = new ArrayList<>();
    double total;

    public List<ItemPedido> getItemPedidoList() {
        return itemPedidoList;
    }

    public void setItemPedidoList(List<ItemPedido> itemPedidoList) {
        this.itemPedidoList = itemPedidoList;
    }

    public void exibirItensPedidosBD() {
    System.out.println("===============================================");
    System.out.println("        RELATÓRIO DE PEDIDOS DO DIA            ");
    System.out.println("===============================================");
    System.out.println("Pedidos totais realizados no dia: ");
    for (int i = 0; i < itemPedidoList.size(); i++) {
        ItemPedido item = getItemPedidoList().get(i);
        System.out.println("-----------------------------------------------");
        System.out.println("Número do Pedido: " + item.getNum());
        System.out.println("Nome do Cliente: " + item.getCliente().getNome());
        System.out.println("--------------- Itens do Pedido ---------------");

        List<Prato> pratos = item.getPratos();
        for (int j = 0; j < pratos.size(); j++) {
            Prato prato = pratos.get(j);
            System.out.println("  Nome do Prato: " + prato.getNome());
            System.out.println("  Descrição: " + prato.getDescricao());
            System.out.println("  Quantidade: " + prato.getQuantidade());
            System.out.println("  Valor: R$ " + (prato.getValor() * prato.getQuantidade()));
            total += prato.getValor() * prato.getQuantidade();
            System.out.println("------------------------------------------------");
        }
    }
    System.out.println("===============================================");
    System.out.println("Total vendido no dia: R$ " + total);
    System.out.println("===============================================");
}

}
