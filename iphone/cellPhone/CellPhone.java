package iphone.cellPhone;

import iphone.apps.Browser;
import iphone.apps.Phone;
import iphone.apps.Player;

public class CellPhone {

    public Browser browser = new Browser();
    public Phone phone = new Phone();
    public Player player = new Player();

    public CellPhone() {        
    }

    public static void ligar() {
        System.out.print("Iniciando.");
    }

    public static void desligar() {
        System.out.print("Finalizando.");
    }

    public static void reiniciar() {
        System.out.print("Reiniciando.");
    }  
}
