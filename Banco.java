import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        int opcion = 0;

        //Constructores
        Scanner sc = new Scanner(System.in);
        Administracion admin = new Administracion();
        Menu menu = new Menu();

        while (opcion != 5) {
            menu.ImprimirMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    admin.Capturar();
                    break;
                case 2:
                    admin.Depositar();
                    break;
                case 3:
                    admin.Retirar();
                    break;
                case 4:
                    admin.Estado();
                    break;
                case 5:
                    break;
            }
        }
    }
    
}