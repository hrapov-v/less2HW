package superky.keytwo.less2hw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        EditText editText = findViewById(R.id.editText);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b0 = findViewById(R.id.b0);
        Button equal = findViewById(R.id.equal);
        Button clear = findViewById(R.id.bClear);
        Button div = findViewById(R.id.bDiv);
        Button sub = findViewById(R.id.bSub);
        Button mul = findViewById(R.id.bMul);
        Button sum = findViewById(R.id.bSum);
        Button dot = findViewById(R.id.dot);
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 3"));
//            }
//
//        });
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        EditText editText = findViewById(R.id.editText);
        switch (v.getId()) {
            case R.id.b1:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 1"));
                break;
            case R.id.b2:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 2"));
                break;
        }
    }
}