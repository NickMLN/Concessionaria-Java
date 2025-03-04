package Models;

import java.time.LocalDate;

public class Venda {
    
    private int id;
    private Cliente cliente;
    private Funcionario vendedor;
    private LocalDate data;
    private Pagamento pagamento;
    private ItemVenda itensVenda;

     public Venda(int id, 
        Cliente cliente, 
        Funcionario vendedor, 
        LocalDate data, 
        Pagamento pagamento, 
        ItemVenda itensVenda) {
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
    public ItemVenda getItensVenda() {
        return itensVenda;
    }
    public void setItensVenda(ItemVenda itensVenda) {
        this.itensVenda = itensVenda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda {\n")
                .append("  id=").append(id).append(",\n")
                .append("  cliente=").append(cliente).append(",\n")
                .append("  vendedor=").append(vendedor).append(",\n")
                .append("  data=").append(data).append(",\n")
                .append("  pagamento=").append(pagamento).append(",\n")
                .append("  itensVenda=").append(itensVenda).append("\n")
                .append("}");
        return sb.toString();
    }
}
