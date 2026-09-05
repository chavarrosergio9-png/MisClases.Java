import java.util.Scanner;
public class ConvertirCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        double kelvin = celsius + 273.15;
        System.out.printf("Celsius: %.2f%n", celsius);
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Kelvin: %.2f%n", kelvin);
        sc.close();
    }
     
}
// "Fahrenheit: %.2f%n" para que nos ponga dos decimales 
// %n para que nos haga un salto de linea.