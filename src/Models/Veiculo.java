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
        return "Veiculo {" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", fabricante=" + fabricante +
                ", tipo=" + tipo +
                ", anoFabricacao=" + anoFabricacao +
                ", estado=" + estado +
                ", preco=" + preco +
                '}';
    }
}
