import java.util.ArrayList;
import java.util.Scanner;

public class Administracion {
    String nombre;
    int PIN;
    float saldo;

    Scanner sc = new Scanner(System.in);
    Cuenta cuenta = new Cuenta(nombre, PIN, saldo);

    //Arraylist que contendra la cuentas creadas
    ArrayList<Cuenta> lista_cuentas = new ArrayList<Cuenta>();
    
    //Metodo para la creacion de una cuenta
    public void Capturar() {
        System.out.println("\nIngrese el nombre del propietario (Nombre Apellido): ");
        nombre = sc.nextLine();
        System.out.println("Ingrese un PIN de seguridad (numerico): ");
        PIN = sc.nextInt();
        sc.nextLine();
        
        cuenta = new Cuenta(nombre, PIN, 0);

        lista_cuentas.add(cuenta);
    }

    //Metodo para depositar saldo a una cuenta
    public void Depositar() {
        System.out.println("\nIngrese el nombre del propietario de la cuenta: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el PIN de seguridad: ");
        PIN = sc.nextInt();
        sc.nextLine();

        lista_cuentas.get(0);
        for(int i = 0; i < lista_cuentas.size(); i++) {
            if(nombre == lista_cuentas.get(i).getNombre() && PIN == lista_cuentas.get(i).getPIN()) {
                System.out.println("Ingrese la cantidad a retirar: ");
                saldo = sc.nextFloat();
                saldo = saldo + lista_cuentas.get(i).getSaldo();
                lista_cuentas.get(i).setSaldo(saldo);

            }
        }
    }

    //Metodo para retirar de una cuenta
    public void Retirar() {
        System.out.println("\nIngrese el nombre del propietario de la cuenta: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el PIN de seguridad: ");
        PIN = sc.nextInt();
        sc.nextLine();
        
        lista_cuentas.get(0);
        for(int i = 0; i < lista_cuentas.size(); i++) {
            if(nombre == lista_cuentas.get(i).getNombre() && PIN == lista_cuentas.get(i).getPIN()) {
                System.out.println("Ingrese la cantidad a retirar: ");
                saldo = sc.nextFloat();
                saldo = saldo - lista_cuentas.get(i).getSaldo();
                lista_cuentas.get(i).setSaldo(saldo);

            }
        }
    }

    //Metodo para imprimir el estado de cuenta 
    public void Estado() {
        String string = "";

        System.out.println("\nIngrese el nombre del propietario de la cuenta: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el PIN de seguridad: ");
        PIN = sc.nextInt();

        lista_cuentas.get(0);
        for(int i = 0; i < lista_cuentas.size(); i++) {
            if(nombre == lista_cuentas.get(i).getNombre() && PIN == lista_cuentas.get(i).getPIN()) {
                string += "Propietario: "+lista_cuentas.get(i).getNombre() + "\n";
                string += "Saldo: "+lista_cuentas.get(i).getSaldo() + "\n";
            }
        }
    }

}