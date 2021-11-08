import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> card;
    private Integer numCard = 52;

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    public String mezclar() {
        Collections.shuffle(card);
        return "mezclando...\n" + "Se mezcló el deck";
    }

    public void  head(){
        if (card.size()< 1){
            System.out.println("Se han agotado las cartas");
        }else {
            try {
                System.out.println(card.get(0));
                card.remove(0);
                System.out.println("Quedan " + card.size() + " cartas en el deck");
            } catch (Throwable e) {
                System.out.println("Ha ocurrido un error");
            }
        }
    }

    public void pick(){
        if (card.size()< 1){
            System.out.println("Se han agotado las cartas");
        }else {
            try {
                Random random = new Random();
                System.out.println(card.get(random.nextInt(card.size())));
                card.remove(random.nextInt(card.size()));
                System.out.println("Quedan " + card.size() + " cartas en el deck");
            } catch (Throwable e) {
                System.out.println("Ha ocurrido un error");
            }
        }
    }

    public void hand() {
        if (card.size() < 1) {
            System.out.println("Se han agotado las cartas");
        } else if (card.size() >= 5){
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(card.get(i));
                }
                for (int i = 0; i < 5; i++) {
                    card.remove(i);
                }
                System.out.println("Quedan " + card.size() + " cartas en el deck");
            } catch (Throwable e) {
                System.out.println("Ya no hay suficientes cartas, intenta otra opción");
                System.out.println("Quedan " + card.size() + " cartas en el deck");
            }
        }
    }
}
