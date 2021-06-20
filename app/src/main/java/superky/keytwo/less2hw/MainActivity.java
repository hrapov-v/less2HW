package superky.keytwo.less2hw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Operation operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        operation = new Operation();
    }

    public void initView() {
        editText = findViewById(R.id.editText);
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
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        clear.setOnClickListener(this);
        div.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        sum.setOnClickListener(this);
        equal.setOnClickListener(this);
        dot.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:
                operation.incrementOperation1();
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 1 '%d' раз", operation.getOperation1()));
                break;
            case R.id.b2:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 2"));
                break;
            case R.id.b3:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 3"));
                break;
            case R.id.b4:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 4"));
                break;
            case R.id.b5:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 5"));
                break;
            case R.id.b6:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 6"));
                break;
            case R.id.b7:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 7"));
                break;
            case R.id.b8:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 8"));
                break;
            case R.id.b9:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 9"));
                break;
            case R.id.b0:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 0"));
                break;
            case R.id.bClear:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку Clear"));
                break;
            case R.id.bDiv:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку '/'"));
                break;
            case R.id.equal:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку '='"));
                break;
            case R.id.bSub:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку '-'"));
                break;
            case R.id.bMul:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку 'X'"));
                break;
            case R.id.bSum:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку '+'"));
                break;
            case R.id.dot:
                editText.setText(String.format(Locale.getDefault(), "Вы нажали на кнопку '.'"));
                break;
        }
    }
}