import Enums.EstadoVeiculo;
import Enums.TipoVeiculo;
import Models.Fabricante;
import Models.Veiculo;

import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fabricante ford = new Fabricante(1,"Ford Motor Company");
        Veiculo veiculo = new Veiculo(1,"Picape",ford, TipoVeiculo.CARRO,2024, EstadoVeiculo.NOVO, 209.990);

        System.out.println(veiculo);
    }
}