
package domein;

/**
 *
 * @author Thomas
 */
public class Card {
    
    private String value;
    private String suit;
    private boolean faceUp;
    
    public Card(String value, String suit){
        this.value = value;
        this.suit = suit;
        faceUp = false;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void setFaceUp() {
        this.faceUp = true;
    }
    
    public void flip(){
        this.faceUp ^= true;
    }
    
    @Override
    public String toString(){        
        String card = suit.charAt(0)+value;
        return card;
    }
}
