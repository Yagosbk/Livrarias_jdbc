package Models;

public class Venda {
    int forma_pagamento;
    String data_venda;
    String cpf_comprador;
    String cnpj_comprador;
    int id_venda;

    public Venda(int forma_pagamento, String data_venda, String cpf_comprador, String cnpj_comprador, int id_venda) {
        this.forma_pagamento = forma_pagamento;
        this.data_venda = data_venda;
        this.cpf_comprador = cpf_comprador;
        this.cnpj_comprador = cnpj_comprador;
        this.id_venda = id_venda;

    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getCnpj_comprador() {
        return cnpj_comprador;
    }

    public void setCnpj_comprador(String cnpj_comprador) {
        this.cnpj_comprador = cnpj_comprador;
    }

    public String getCpf_comprador() {
        return cpf_comprador;
    }

    public void setCpf_comprador(String cpf_comprador) {
        this.cpf_comprador = cpf_comprador;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public int getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(int forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "forma_pagamento=" + forma_pagamento +
                ", data_venda='" + data_venda + '\'' +
                ", cpf_comprador='" + cpf_comprador + '\'' +
                ", cnpj_comprador='" + cnpj_comprador + '\'' +
                ", id_venda=" + id_venda +
                '}';
    }
}
