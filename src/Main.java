import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        showMenu();
    }

    public static String getColor(String palo) {
        if (palo.equalsIgnoreCase("picas") || palo.equalsIgnoreCase("tréboles")) {
            return "negro";
        }
        if (palo.equalsIgnoreCase("corazones") || palo.equalsIgnoreCase("diamantes")) {
            return "rojo";
        }

        return null;
    }

    public static void showMenu(){
        String[] palo = {"picas", "corazones", "diamantes", "tréboles"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }

        }
        byte opcion = 0;
        do{
            try {
                opcion = Byte.parseByte(JOptionPane.showInputDialog("Bienvenido a Poker!\n"
                        + "Selecciona una opción\n"
                        + "1. Mezclar Deck\n"
                        + "2. Sacar una carta\n"
                        + "3. Carta al azar\n"
                        + "4. Generar una mano de 5 cartas\n"
                        + "0. Salir"));
            }catch (Throwable e){
                JOptionPane.showMessageDialog(null, "Opción inválida");
                showMenu();
            }
            switch (opcion){
                case 1:
                    System.out.println("Mezclar Deck\n" + deck.mezclar());
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    deck.hand();
                    break;
                case 0:
                    opcion = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }while (opcion != 0);
    }
}
