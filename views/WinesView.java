package views;

import java.util.Scanner;

import controllers.WinesController;

public class WinesView {
    private WinesController wineController;
    private Scanner scanner;

    public WinesView(WinesController wineController, Scanner scanner) {
        this.wineController = wineController;
        this.scanner = scanner;
    }

    public void showOptions() {
        while (true) {
            System.out.println("[1]--> Ingresar Vino [2] --> Mostrar Vinos por linea");
            try {
                int enterValue = scanner.nextInt();
                while (enterValue > 2 || enterValue < 1) {
                    System.out.println("Opcion inexistente, intentelo de nuevo por favor");
                    enterValue = scanner.nextInt();

                }
                switch (enterValue) {
                    case 1:

                        break;
                    case 2:

                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("El valor que ha ingresado no es valido, programa finalizado");
                break;
            }
        }
    }

    public void enterWine() {

    }

    public void showWines() {

    }

}
