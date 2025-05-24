import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nome;
    private String descricao;
    private int quantidade;
    private double valor;

    Prato(String nome, String descricao, int quantidade, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }


    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
