package Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private int id;
    private String nome;
    private String cargo;
    private LocalDate dataContratacao;

    public Funcionario(int id, String nome, String cargo, LocalDate dataContratacao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id).append("\n")
                .append("Nome : ").append(nome).append("\n")
                .append("Cargo: ").append(cargo).append("\n")
                .append("Data da Contratação: ").append(dataContratacao.format(formatter));
        return sb.toString();
    }
}
