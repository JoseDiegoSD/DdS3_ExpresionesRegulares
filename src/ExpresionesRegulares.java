import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public static void main(String[] args) {
        //Scanner para elegir tu expresion del 1 al 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que expresión quieres probar (que sea del 1-5): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        String mensaje = "";

        switch (opcion) {
            case 1:
                mensaje = validarExpresion("Hola mundo", cadena);
                break;
            case 2:
                mensaje = validarExpresion("[Hh][Oo][Ll][Aa] [Mm][Uu][Nn][Dd][Oo]", cadena);
                break;
            case 3:
                mensaje = validarExpresion("(Java|Python|Go|Pascal|Perl)", cadena);
                break;
            case 4:
                mensaje = validarExpresion("[\\w.%+-]+@(unison|uson)\\.mx$", cadena);
                break;
            case 5:
                mensaje = validarExpresion("^ISI\\d{4}-(1|2)\\.(txt|csv)$", cadena);
                break;
            default:
                mensaje = "Opción no válida.";
        }

        System.out.println(mensaje);
        scanner.close();
    }
    static String validarExpresion(String patron, String cadena) {
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(cadena);
        return mat.matches() ? "Validación Exitosa" : "Error en la validación";
    }
}//JDSD