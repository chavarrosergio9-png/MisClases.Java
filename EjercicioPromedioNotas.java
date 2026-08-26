public class EjercicioPromedioNotas{
    public static void main(String[] args){
        // Declaración de variables
        String nombre = "Juan Perez";
        int nota1 = 60;
        int nota2 = 90;
        int nota3 = 39;
        boolean activo = true;

        // calcular el promedio 
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        // mostras resultados 
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Nota 1 :" + nota1);
        System.out.println("Nota 2 :" + nota2);
        System.out.println("Nota 3 :" + nota3);
        System.out.println("Promedio: " + promedio);

        // operador de comparación
        System.out.println("el estudiante aprobo la materia: " + (promedio > 30));
    }
}