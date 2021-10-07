import java.util.List;

public class Deck {
    private final List<Card> cards;
    private int index = 0;


    public Deck(List<Card> cards) {
        this.cards = cards;
    }
}
