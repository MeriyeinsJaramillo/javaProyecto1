import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado="";
        String documentoIdentidad="";
        String diaDescanso="";
        String usuarioEmpleado="";
        String contrasenaUsuario="";
        double salrioBruto=0;
        double salarioNeto=0;
        double retencionSalud=0;
        double retencionPension=0;
        double valorrHora=0;
        double cantidadHora=0;
        double bonificacionEmpleado=0;
        int auxilioTransporte= 200000;

        System.out.println("Ingresar su usuario");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        contrasenaUsuario = sc.nextLine();
        if(usuarioEmpleado.equals ("usurio") && contrasenaUsuario.equals("123")){
            System.out.println("hola");
        }else {
            System.out.println("Error de credenciales");
        }
    }

}