import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        String monedaAConsultar = "";
        String monedaDestino = "";
        Integer opc = 999;
        Scanner lectura = new Scanner(System.in);

        while (opc != 0) {
            System.out.println("\n        BIENVENID@ AL CONVERSOR DE MONEDAS - (2024) - |ExchangeRate-API|\n");
            System.out.println("1) Dolar(USD)           ---> Peso Colombiano(COP)");
            System.out.println("2) Peso Argentino(ARS)  ---> Dolar(USD)");
            System.out.println("3) Boliviano(BOB)       ---> Dolar(USD)");
            System.out.println("4) Peso Colombiano(COP) ---> Dolar(USD)");
            System.out.println("5) Peso Chileno(CLP)    ---> Dolar(USD)");
            System.out.println("6) Real Brasileño(BRL)  ---> Dolar(USD)");
            System.out.println("0) Salir\n");
            System.out.println("Elija qué tipo de conversión desea hacer: ");

            opc = lectura.nextInt();

            switch (opc) {
                case 1:
                    monedaAConsultar = "USD";
                    monedaDestino = "COP";
                    break;
                case 2:
                    monedaAConsultar = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    monedaAConsultar = "BOB";
                    monedaDestino = "USD";
                    break;
                case 4:
                    monedaAConsultar = "COP";
                    monedaDestino = "USD";
                    break;
                case 5:
                    monedaAConsultar = "CLP";
                    monedaDestino = "USD";
                    break;
                case 6:
                    monedaAConsultar = "BRL";
                    monedaDestino = "USD";
                    break;
                case 0:
                    System.out.println("\nGracias por utilizar el conversor.");
                    break;
            }
            if (opc > 0 && opc < 7){
                ConsultaMoneda consulta = new ConsultaMoneda();
                System.out.println("Valor a convertir");
                var valorAConvertir = Double.valueOf(lectura.nextDouble());
                Moneda moneda = consulta.buscaMoneda(monedaAConsultar, monedaDestino, valorAConvertir);
                System.out.println("$"+valorAConvertir+monedaAConsultar+" son: $"+moneda.conversion_result()+monedaDestino);
            }else if(opc != 0 && opc > 6) {
                System.out.println("Ingrese una opción válida =>");
            }
        }
    }
}