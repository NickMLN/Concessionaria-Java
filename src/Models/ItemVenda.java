package Models;

import java.util.Date;

public class ItemVenda {
    private int id;
    private Veiculo veiculo;
    private int quantidade;
    private double preco;
    private double desconto;

    public ItemVenda(int id, Veiculo veiculo, int quantidade, double preco, double desconto) {
        this.id = id;
        this.veiculo = veiculo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return this.preco -= (preco * this.desconto) * this.quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id).append("\n")
                .append(veiculo).append("\n")
                .append("Quantidade: ").append(quantidade).append("\n")
                .append("Desconto: ").append(desconto * 100).append("%\n")
                .append("Valor da Venda Total: R$ ").append(String.format("%.3f", getTotal()));
        return sb.toString();
    }
}
