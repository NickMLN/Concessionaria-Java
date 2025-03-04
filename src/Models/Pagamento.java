package Models;

import Enums.TipoPagamento;
import Enums.TipoStatus;

import java.time.LocalDate;

public class Pagamento {

    private int id;
    private LocalDate data;
    private TipoPagamento tipo;
    private TipoStatus status;

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
        return "Pagamento{" + "id=" + id + 
        ", data=" + data + 
        ", tipo=" + tipo + 
        ", status=" + status +'}';
    }
}
