import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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
        System.out.println("El tamaño del deck es: " + deck.getCard().size());
        System.out.println("Mezclar Deck\n" + deck.mezclar());
        System.out.println("Se seleccionó la carta de encima");
        deck.head();
        System.out.println("Se seleccionó una carta al azar");
        deck.pick();
        System.out.println("Se seleccionaron cinco cartas");
        deck.hand();
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
}
