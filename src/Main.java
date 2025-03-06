import Enums.EstadoVeiculo;
import Enums.TipoPagamento;
import Enums.TipoStatus;
import Enums.TipoVeiculo;
import Models.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Cliente cliente1 = new Cliente(1,
                "João", "111.999.777-00",
                "1199999-8888",
                "joão@gmail.com",
                "Interlagos");

        Cliente cliente2 = new Cliente(2,
                "Maria",
                "222.666.444-01",
                "1177788-0000",
                "maria@gmail.com",
                "Jardim ipanema");

        Fabricante ford = new Fabricante(1,"Ford Motor Company");
        Fabricante honda = new Fabricante(2, "honda");

        LocalDate dataContratacao1 = LocalDate.parse("11/09/2020", formatter);
        LocalDate dataContratacao2 = LocalDate.parse("11/09/2010", formatter);

        Funcionario funcionario1 = new Funcionario(1, "Carlos", "Vendedor", dataContratacao1);
        Funcionario funcionario2 = new Funcionario(2, "Miguel", "Gerente", dataContratacao2);

        Veiculo veiculo1 = new Veiculo(1,
                "F-150 Picape",
                ford,
                TipoVeiculo.CARRO,
                2024,
                EstadoVeiculo.NOVO,
                209.990);

        Veiculo veiculo2 = new Veiculo(2,
                "Honda City Sedan",
                honda,
                TipoVeiculo.CARRO,
                2023,
                EstadoVeiculo.SEMI_NOVO,
                97.000);

        LocalDate dataPagamento1 = LocalDate.parse("16/02/2025", formatter);
        LocalDate dataPagamento2 = LocalDate.parse("09/01/2022", formatter);

        Pagamento pagamento1 = new Pagamento(1, dataPagamento1, TipoPagamento.FINANCIAMENTO, TipoStatus.APROVADO);
        Pagamento pagamento2 = new Pagamento(2, dataPagamento2, TipoPagamento.PIX, TipoStatus.APROVADO);

        List<ItemVenda> itemsVenda1 = List.of(
                new ItemVenda(1, veiculo1, 1, veiculo1.getPreco(), 0.10),
                new ItemVenda(1, veiculo2, 1, veiculo2.getPreco(), 0.10));

        List<ItemVenda> itemVenda2 = List.of(
                new ItemVenda(2, veiculo2, 1, veiculo2.getPreco(), 0.05));

        Venda venda1 = new Venda(1, cliente1, funcionario1, dataPagamento1, pagamento1,itemsVenda1);

        Venda venda2 = new Venda(2, cliente2, funcionario2, dataPagamento2, pagamento2,itemVenda2);

        System.out.println("-------------------- Dados das Vendas --------------------");
        System.out.println(venda1);
        System.out.println(venda2);
    }
}