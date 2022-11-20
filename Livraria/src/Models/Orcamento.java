package Models;

public class Orcamento {

    String data_orcamento;
    String nome_comprador;
    String cpf_orcamento;
    String cnpj_orcamento;
    int id_orcamento;
    int pagamento_orcamento;

    public Orcamento() {
    }

    public Orcamento(String data_orcamento, String nome_comprador, String cpf_orcamento, String cnpj_orcamento, int id_orcamento, int pagamento_orcamento) {
        this.data_orcamento = data_orcamento;
        this.nome_comprador = nome_comprador;
        this.cpf_orcamento = cpf_orcamento;
        this.cnpj_orcamento = cnpj_orcamento;
        this.id_orcamento = id_orcamento;
        this.pagamento_orcamento = pagamento_orcamento;
    }

    public int getPagamento_orcamento() {
        return pagamento_orcamento;
    }

    public void setPagamento_orcamento(int pagamento_orcamento) {
        this.pagamento_orcamento = pagamento_orcamento;
    }

    public int getId_orcamento() {
        return id_orcamento;
    }

    public void setId_orcamento(int id_orcamento) {
        this.id_orcamento = id_orcamento;
    }

    public String getCnpj_orcamento() {
        return cnpj_orcamento;
    }

    public void setCnpj_orcamento(String cnpj_orcamento) {
        this.cnpj_orcamento = cnpj_orcamento;
    }

    public String getNome_comprador() {
        return nome_comprador;
    }

    public void setNome_comprador(String nome_comprador) {
        this.nome_comprador = nome_comprador;
    }

    public String getCpf_orcamento() {
        return cpf_orcamento;
    }

    public void setCpf_orcamento(String cpf_orcamento) {
        this.cpf_orcamento = cpf_orcamento;
    }

    public String getData_orcamento() {
        return data_orcamento;
    }

    public void setData_orcamento(String data_orcamento) {
        this.data_orcamento = data_orcamento;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "data_orcamento='" + data_orcamento + '\'' +
                ", nome_comprador='" + nome_comprador + '\'' +
                ", cpf_orcamento='" + cpf_orcamento + '\'' +
                ", cnpj_orcamento='" + cnpj_orcamento + '\'' +
                ", id_orcamento=" + id_orcamento +
                ", pagamento_orcamento=" + pagamento_orcamento +
                '}';
    }
}
