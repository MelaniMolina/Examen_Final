import java.util.Scanner;

public class Retiro {
    String nombre_cuenta;
    String numero_Ced;
    double Cantidad;

    public  Retiro(){
        nombre_cuenta = "Melani Molina";
        numero_Ced = "0179736212";
        Cantidad = 70.89;
    }

    public String getNombre_cuenta() {
        return nombre_cuenta;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    public String getNumero_Ced() {
        return numero_Ced;
    }

    public void setNumero_Ced(String numero_Ced) {
        this.numero_Ced = numero_Ced;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }
    public  void Dato_Retiro(){
        /*Este Metodo nos permitira realizar la resta al valor y poder generar */
        Scanner sc = new Scanner (System.in);
        Retiro uno = new Retiro();
        double resta,retiro;
        String nom_usu;
        System.out.print("Ingrese su Nombre: ");
        nom_usu = sc.next();
        System.out.println("Su Cantidad Actual es: "+uno.getCantidad());
        System.out.print("Ingrese la Cantidad que Desea Retirar: ");
        retiro = sc.nextInt();
        if(retiro > 0) {
            resta = uno.getCantidad() - retiro;
            System.out.println("Su Saldo Actual es de: " + resta);
        }else {
            System.out.println("Vuelva a Ingresar al Sistema");
        }
    }
}
