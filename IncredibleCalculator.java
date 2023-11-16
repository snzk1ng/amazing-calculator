import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {
         double num1=1;
             double num=1;
             double total;
        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();

        switch (opcion) {
            case 1: // Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
             //declaro variables num1  num2 y total para hacer la suma y la imprimo
            
             total=num1+num2;
            System.out.println(total);
                break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
            
                total=(num1-num2);
                System.out.println(total);
            break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su
                    // producto.
                    total=(num1/num2);
                    System.out.println(total);

                    break;
            case 4: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división
                    // entera.
                    total=(num1*num2);
                    System.out.println(total);
                break;
            case 5: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división
                    // con decimales.
                    //(USO CLASE LEER )
                    System.out.println("Diga el primer numero");
                    num1=leer.datoint;
                    System.out.println("Ahora el segundo");
                    num2=leer.datoint;

                    total=(num1*num2)
                    System.out.printf("El resultado con decimales de su multiplicacion es de %.2f ",total);
                break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}