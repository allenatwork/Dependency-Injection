package allen.dependencyinjection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import allen.dependencyinjection.container.CardContainer;

public class MainActivity extends AppCompatActivity {
    Card card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardContainer cardContainer = new CardContainer();
        card = cardContainer.createCard();
    }

}
