public class Card {
    String[] palo = {"tréboles", "corazones", "picas", "diamantes"};
    String[] color = {"rojo", "negro"};
    String[] valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    public Card(String[] palo, String[] color, String[] valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String[] getPalo() {
        return palo;
    }

    public void setPalo(String[] palo) {
        this.palo = palo;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String[] getValor() {
        return valor;
    }

    public void setValor(String[] valor) {
        this.valor = valor;
    }
}
