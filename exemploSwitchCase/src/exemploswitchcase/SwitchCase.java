package exemploswitchcase;

import java.util.Scanner;

public class SwitchCase {

    public void AmosarDía() {

        System.out.println("****MENU****\n 1 -> Luns\n 2 -> Martes\n 3 -> Mercores\n 4 -> Xoves\n 5 -> Venres\n 6 -> Sábado\n 7 -> Domingo\n ELIXE UNHA OPCIÓN");
        Scanner ler = new Scanner(System.in);
        int opcion = ler.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Luns");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Mércores");
                break;
            case 4:
                System.out.println("Xoves");
                break;
            case 5:
                System.out.println("Venres");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opción non válida.");
        }
    }

}
