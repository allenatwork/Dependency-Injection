package allen.dependencyinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import allen.dependencyinjection.imlement.Database;
import allen.dependencyinjection.imlement.EmailSender;
import allen.dependencyinjection.imlement.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupCard();
    }

    private void setupCard() {
        Card card = new Card();
        card.setDatabase(new Database());
        card.setEmailSender(new EmailSender());
        card.setiLogger(new Logger());
    }
}
