import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Prato> pratoList = new ArrayList<>();

    Cardapio(){
        Prato prato1 = new Prato("Parmegiana", "Filé à milanesa coberto com molho de tomate e queijo", 10, 35.90);
        Prato prato2 = new Prato("Lasanha", "Lasanha de carne com queijo e molho branco", 8, 28.50);
        Prato prato3 = new Prato("Salada Caesar", "Alface, croutons, parmesão e molho Caesar", 15, 22.00);
        Prato prato4 = new Prato("Pizza Margherita", "Massa fina, molho de tomate, mussarela e manjericão", 12, 40.00);
        Prato prato5 = new Prato("Estrogonofe", "Carne em molho cremoso com arroz branco e batata palha", 7, 30.00);

        pratoList.add(prato1);
        pratoList.add(prato2);
        pratoList.add(prato3);
        pratoList.add(prato4);
        pratoList.add(prato5);

    }

    public List<Prato> getPratoList() {
        return pratoList;
    }
}
