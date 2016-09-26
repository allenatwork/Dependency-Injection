package allen.dependencyinjection;

import allen.dependencyinjection.imlement.Database;
import allen.dependencyinjection.imlement.EmailSender;
import allen.dependencyinjection.imlement.Logger;

/**
 * Created by Allen on 26-Sep-16.
 */
public class Card {
    public void checkout(int orderId, int userId) {
        Database db = new Database();
        db.save(orderId);

        Logger logger = new Logger();
        logger.logInfo("Hello");

        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(userId);
    }
}
