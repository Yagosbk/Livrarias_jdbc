package Models;

public class ItemOrcamento {

    String isbn;
    String nome;
    int quantidade;
    double valor_unit;

    public ItemOrcamento() {
    }


    public ItemOrcamento(String isbn, String nome, int quantidade, double valor_unit) {
        this.isbn = isbn;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
    }

    public double getValor_unit() {
        return valor_unit;
    }

    public void setValor_unit(double valor_unit) {
        this.valor_unit = valor_unit;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        return nome + " | " + quantidade + " | " + valor_unit + "\n";
    }
}
