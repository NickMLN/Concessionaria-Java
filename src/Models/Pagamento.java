package Models;

import Enums.TipoPagamento;
import Enums.TipoStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pagamento {

    private int id;
    private LocalDate data;
    private TipoPagamento tipo;
    private TipoStatus status;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pagamento(int id, LocalDate data, TipoPagamento tipo, TipoStatus status) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public TipoPagamento getTipo() {
        return tipo;
    }
    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }
    public TipoStatus getStatus() {
        return status;
    }
    public void setStatus(TipoStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id).append("\n")
                .append("Data do Pagamento: ").append(data.format(formatter)).append("\n")
                .append("Tipo de Pagamento: ").append(tipo.toString()).append("\n")
                .append("Status do Pagamento: ").append(status.toString());
        return sb.toString();
    }

}
