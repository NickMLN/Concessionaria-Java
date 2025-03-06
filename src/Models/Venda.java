package Models;

import java.time.LocalDate;
import java.util.List;

public class Venda {

    private int id;
    private Cliente cliente;
    private Funcionario vendedor;
    private LocalDate data;
    private Pagamento pagamento;
    private List<ItemVenda> itensVenda;

    public Venda(int id, Cliente cliente, Funcionario vendedor, LocalDate data, Pagamento pagamento, List<ItemVenda> itensVenda) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.data = data;
        this.pagamento = pagamento;
        this.itensVenda = itensVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ItemVenda itemVenda) {
        this.itensVenda.add(itemVenda);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id da venda: ")
                .append(id)
                .append("\n")
                .append("DADOS DO CLIENTE: \n")
                .append(cliente)
                .append("\n\n")
                .append("DADOS DO VENDEDOR: \n")
                .append(vendedor)
                .append("\n\n")
                .append("DATA DA VENDA: \n")
                .append(data)
                .append("\n\n")
                .append("DADOS DO PAGEMENTO: \n")
                .append(pagamento)
                .append("\n\n")
                .append("ITENS DA VENDA: \n");

        for (ItemVenda itemVenda : itensVenda) {
            sb.append(itemVenda).append("\n\n");
        }

        sb.append("--------------------------------------------------");

        return sb.toString();
    }
}
