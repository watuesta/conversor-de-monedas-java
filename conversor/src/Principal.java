import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("Escriba la moneda a convertir: ");


        var monedaAConsultar = lectura.nextLine();
        Moneda moneda = consulta.buscaMoneda(monedaAConsultar);
        System.out.println(moneda);


    }
}