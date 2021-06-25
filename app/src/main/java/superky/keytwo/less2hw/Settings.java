package superky.keytwo.less2hw;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        Intent intent = new Intent(this, MainActivity.class);
        (findViewById(R.id.backButton)).setOnClickListener(v -> {
            this.startActivity(intent);
        });
    }

}
