



public class Deck {

    private Card[] cards = new Card[52];

    public Deck() {
        refill();
    }

    public final void refill() {
        int i = 0;
      
            }
   

    public Card drawCard() {
        Card card = null;
        while (card == null) {
            int index = (int)(Math.random()*cards.length);
            card = cards[index];
            cards[index] = null;
        }
        return card;
    }
}
