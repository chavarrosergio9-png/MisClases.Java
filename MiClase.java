import java.util.Scanner;

public class MiClase{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("¿De qué nUmero quieres la tabla?");
    int numero = sc.nextInt();

    System.out.println("\nTabla del " + numero + ":");
    for (int i = 1 ; i <= 10; i ++){
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }

    sc.close();
}
}

