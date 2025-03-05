package Models;

import Enums.EstadoVeiculo;
import Enums.TipoVeiculo;

import java.util.Calendar;

public class Veiculo {

    private int id;
    private String modelo;
    private Fabricante fabricante;
    private TipoVeiculo tipo;
    private int anoFabricacao;
    private EstadoVeiculo estado;
    private double preco;

    public Veiculo(int id,
                   String modelo,
                   Fabricante fabricante,
                   TipoVeiculo tipo,
                   int anoFabricacao,
                   EstadoVeiculo estado,
                   double preco) {
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
        this.estado = estado;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public EstadoVeiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVeiculo estado) {
        this.estado = estado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Modelo: ").append(modelo).append("\n")
                .append("Fabricante: ").append(fabricante).append("\n")
                .append("Tipo do Veiculo: ").append(tipo).append("\n")
                .append("Ano do Veiculo: ").append(anoFabricacao).append("\n")
                .append("Estado do Veiculo: ").append(estado).append("\n")
                .append("Preço sem Desconto: R$ ").append(String.format("%.3f",preco));
        return sb.toString();
    }
}
