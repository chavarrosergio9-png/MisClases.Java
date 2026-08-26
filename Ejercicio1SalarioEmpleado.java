public class Ejercicio1SalarioEmpleado {
    public static void main(String[]args){
        //Declaración de variables
        String nombreEmpleado = "sergio chavarro";
        int horasTrabajadas = 42;
        double pagoPorHora = 20.000;
        Boolean activo = true;

        //Cálculo del salario
        double salario = horasTrabajadas * pagoPorHora;


        //bonificacion por horas extras (+35h)
        double bonificacion = 0;
        if (horasTrabajadas > 35) {
            bonificacion = 100;
        }

        //Cálculo del salario total
        double salarioTotal = salario + bonificacion;


        //Impresión de resultados
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("horasTrabajadas: " + horasTrabajadas);
        System.out.println("pago por hora: " + pagoPorHora);
        System.out.println("activo:" + activo);
        System.out.println("salario: " + salario);
        System.out.println("bonificacion: " + bonificacion);
        System.out.println("salario total: " + salarioTotal);


        // operadores de comparacion 
        System.out.println("el empleado trabaja mas de 35 horas: " + (horasTrabajadas > 35));
        


    }
}