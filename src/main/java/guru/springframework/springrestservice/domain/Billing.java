
package guru.springframework.springrestservice.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Billing implements Serializable
{

    private Card card;
    private final static long serialVersionUID = 6577338081290507077L;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }


}
