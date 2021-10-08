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
        System.out.println(card.get(0));
        card.remove(0);
        System.out.println("Quedan " + card.size()+ " cartas en el deck");
    }

    public void pick(){
        Random random = new Random();
        System.out.println(card.get(random.nextInt(card.size())));
        card.remove(random.nextInt(card.size()));
        System.out.println("Quedan " + card.size() + " cartas en el deck");
    }

    public void hand(){
        for(int i=0; i<5; i++){
            System.out.println(card.get(i));
        }
        for(int i=0; i<5; i++){
            card.remove(i);
        }
        System.out.println("Quedan " + card.size()+ " cartas en el deck");
    }
}
