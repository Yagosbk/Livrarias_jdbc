package Models;

import java.util.ArrayList;

public class ItemVenda {

    ArrayList<Venda> listaitens = new ArrayList<>();
    Venda v;
    int quantidade;
    int valor_unit;

    public ItemVenda(ArrayList<Venda> listaitens, Venda v) {
        this.listaitens = listaitens;
        this.v = v;
    }

    public ItemVenda(int quantidade, int valor_unit) {
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
    }

    public int getValor_unit() {
        return valor_unit;
    }

    public void setValor_unit(int valor_unit) {
        this.valor_unit = valor_unit;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Venda getV() {
        return v;
    }

    public void setV(Venda v) {
        this.v = v;
    }

    public ArrayList<Venda> getListaitens() {
        return listaitens;
    }

    public void setListaitens(ArrayList<Venda> listaitens) {
        this.listaitens = listaitens;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "listaitens=" + listaitens +
                ", v=" + v +
                ", quantidade=" + quantidade +
                ", valor_unit=" + valor_unit +
                '}';
    }
}
