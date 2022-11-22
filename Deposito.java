import java.util.Scanner;

public class Deposito {
    String nombre_cuenta;
    String numero_Ced;
    double Cantidad_Dep;
    public  Deposito (){
        nombre_cuenta = "Melani Molina";
        numero_Ced = "0504871297";
        Cantidad_Dep = 70.89;
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

    public double getCantidad_Dep() {
        return Cantidad_Dep;
    }

    public void setCantidad_Dep(double cantidad_Dep) {
        Cantidad_Dep = cantidad_Dep;
    }
    public  void Dato_Deposito(){
        Scanner sc = new Scanner (System.in);
        Retiro dos = new Retiro();
        double suma,deposito;
        String nom_usu;

        System.out.print("Ingrese su Nombre: ");
        nom_usu = sc.next();
        System.out.println("Su Cantidad Actual es: "+dos.getCantidad());
        System.out.println("Nombre de la Cuenta que hace el Deposito: "+dos.getNombre_cuenta());
        System.out.print("Ingrese la Cantidad que Desea Depositar: ");
        deposito = sc.nextInt();
        if(deposito > 0) {
            suma = deposito + dos.getCantidad();
            System.out.println("Su Actual es de: " + suma);
        }else {
            System.out.println("Vuelva a Ingresar al Sistema");
        }
    }

}
