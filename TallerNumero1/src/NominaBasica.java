public class NominaBasica {
    public static void main(String[] args) {
        String nombreEmpleado = "Laura torres";
        // declaración de variables
        int horasTrabajadas = 42;
        int valorHora = 15000;

        //calculos requeridos 
        double salarioBruto = horasTrabajadas * valorHora;
        double descuento = salarioBruto * 0.08;
        double retencion = salarioBruto * 0.05;
        double salarioNeto = salarioBruto - descuento - retencion;

        // impresion o salida de resultados 
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("horasTrabajadas: " + horasTrabajadas);
        System.out.println("pago por hora: " + valorHora);
        System.out.println("salario bruto: " + salarioBruto);
        System.out.println("descuento: " + descuento);
        System.out.println("retención: " + retencion);
        System.out.println("salario neto: " + salarioNeto);
    }
}
