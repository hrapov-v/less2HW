package superky.keytwo.less2hw;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_send);
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        ImageView imageView = findViewById(R.id.imgView);
        if (intent.ACTION_SEND.equals(action)&&type.equals("image/*")) {
            imageView.setImageURI(intent.getParcelableExtra(intent.EXTRA_STREAM));
        }

        }

}
