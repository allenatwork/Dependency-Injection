package allen.dependencyinjection.container;

import allen.dependencyinjection.Card;
import allen.dependencyinjection.imlement.Database;
import allen.dependencyinjection.imlement.EmailSender;
import allen.dependencyinjection.imlement.Logger;

/**
 * Created by Allen on 26-Sep-16.
 */
public class CardContainer {
    public Card createCard() {
        Card card = new Card();
        card.setiLogger(new Logger());
        card.setEmailSender(new EmailSender());
        card.setDatabase(new Database());
        return card;
    }
}
