package superky.keytwo.less2hw;

import android.content.Intent;
import android.net.Uri;
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
            onDestroy();
        });

        (findViewById(R.id.myCodeBtn)).setOnClickListener(v -> {
            Intent intentCode = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/hrapov-v/less2HW"));
            startActivity(intentCode);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
