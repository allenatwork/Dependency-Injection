package allen.dependencyinjection;

import allen.dependencyinjection.imlement.Database;
import allen.dependencyinjection.imlement.EmailSender;
import allen.dependencyinjection.itf.IDatabase;
import allen.dependencyinjection.itf.IEmailSender;
import allen.dependencyinjection.itf.ILogger;
import allen.dependencyinjection.imlement.Logger;

/**
 * Created by Allen on 26-Sep-16.
 */
public class Card {
    private IDatabase database;
    private IEmailSender emailSender;
    private ILogger iLogger;


    public Card() {
    }

    // constructor DI
    public Card(IDatabase database, IEmailSender emailSender, ILogger iLogger) {
        this.database = database;
        this.emailSender = emailSender;
        this.iLogger = iLogger;
    }

    // Setter DI
    public void setDatabase(IDatabase database) {
        this.database = database;
    }

    public void setEmailSender(IEmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void setiLogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }

    public void checkout(int orderId, int userId) {
        Database db = new Database();
        db.save(orderId);

        Logger logger = new Logger();
        logger.logInfo("Hello");

        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(userId);
    }
}
