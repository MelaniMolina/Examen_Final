import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int op;
        Retiro ret_can = new Retiro();
        Deposito sum_dep = new Deposito();
        System.out.println("<<<--- BANCO PICHINCHA(Cajero Electrónico) --->>>");
        System.out.println("1.Desea Depositar en la cuenta");
        System.out.println("2.Desea Realizar un Retiro");
        System.out.println("Elija la Opcion");
        System.out.print(">>");
        op = sc.nextInt();
        do {
          switch (op){
              case 1:
                  System.out.println("Seleccionado la Opcion 1");
                  sum_dep.Dato_Deposito();
                  break;
              case 2:
                  System.out.println("Seleccionado la Opcion 2");
                  ret_can.Dato_Retiro();
                  break;
          }


            System.out.println("Desea Salir Presione 3");
        }while(op == 3);
    }
}