import java.util.List;

public class ItemPedido extends CalculoTotal{

    private int num;
    private Cliente cliente;
    private List<Prato> pratos;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    @Override
    public void calcularTotal(){
        double soma = 0;
        for (int i = 0; i < pratos.size() ; i++) {
             soma = pratos.get(i).getValor() * pratos.get(i).getQuantidade();

        }
        System.out.println(soma);
    }

    public void exibirInfo() {
    System.out.println("========================================");
    System.out.println("              PEDIDO DE MESA            ");
    System.out.println("========================================");
    System.out.println("Pedido número: " + num);
    if (cliente != null) {
        System.out.println("Cliente: " + cliente.getNome());
    } else {
        System.out.println("Cliente: não informado");
    }
    System.out.println("----------------------------------------");
    System.out.println("Pratos do pedido:");
    if (pratos != null && !pratos.isEmpty()) {
        for (Prato prato : pratos) {
            System.out.println("- " + prato.getNome() + " | Valor: R$ " +prato.getValor());
        }
    } else {
        System.out.println("Nenhum prato adicionado.");
    }
    System.out.println("----------------------------------------");
    System.out.print("Total do pedido: R$: ");
    calcularTotal();
    System.out.println("\n========================================");
    System.out.println("       Obrigado pela preferência!       ");
    System.out.println("========================================");
}

}
