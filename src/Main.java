import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado="";
        String documentoIdentidad="";
        String diaDescanso="";
        String usuarioEmpleado="";
        String contrasenaUsuario="";
        double salarioBruto=0;
        double salarioNeto=0;
        double retencionSalud=0;
        double retencionPension=0;
        double valorSalarioMinimo=0;
        double valorHora=0;
        double cantidadHora=0;
        double bonificacionEmpleado=0;
        int auxilioTransporte= 200000;

        System.out.println("Ingresar su usuario");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        contrasenaUsuario = sc.nextLine();
        if(usuarioEmpleado.equals ("usurio") && contrasenaUsuario.equals("123")){
            System.out.println("Ingreso de forma correcta");
            System.out.println("Ingrese el nombre del empleado");
            nombreEmpleado = sc.nextLine();
            System.out.println("Ingrese su documento de identidad");
            documentoIdentidad=sc.nextLine();
            System.out.println("Ingrese el dia de descanso (lunes a viernes)");
            diaDescanso=sc.nextLine();
            System.out.println("Ingrese el vlor de el vlor de la hora: ");
            valorHora =sc.nextDouble();
            System.out.println("Ingrese la cantidad de horas laboradas");
            cantidadHora=sc.nextDouble();
            salarioBruto=valorHora*cantidadHora;
            System.out.println("Ingrese el salario minimo para este año");
            valorSalarioMinimo= sc.nextDouble();
            if (salarioBruto>(valorSalarioMinimo*2)){
                bonificacionEmpleado=0;
                auxilioTransporte=0;
            } else {
                bonificacionEmpleado=salarioBruto*0.3;
                auxilioTransporte=200000;
            }
            salarioNeto=salarioBruto+bonificacionEmpleado+auxilioTransporte;
            System.out.println("El salario neto es: " + salarioNeto);

        }else {
            System.out.println("Error de credenciales");
        }
    }

}