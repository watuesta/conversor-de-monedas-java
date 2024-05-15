import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("Escriba la moneda a convertir: ");
        var monedaAConsultar = lectura.nextLine();

        System.out.println("Moneda destino: ");
        var monedaDestino = lectura.nextLine();

        System.out.println("Valor a convertir");
        var valorAConvertir = Double.valueOf(lectura.nextLine());
        Moneda moneda = consulta.buscaMoneda(monedaAConsultar, monedaDestino, valorAConvertir);
        System.out.println(moneda);


    }
}