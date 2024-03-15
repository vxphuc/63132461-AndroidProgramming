package till.edu.th2_bai5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import till.edu.th2_bai5.R;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    EditText textkq;
    Button Cong, Tru, Nhan, Chia;
    void NutDieuKhien(){
        EditText text1 = (EditText) findViewById(R.id.edt1);
        EditText text2 = (EditText) findViewById(R.id.edt2);
        EditText textkq = (EditText) findViewById(R.id.edtkq);
        Cong = (Button) findViewById(R.id.bt1);
        Tru = (Button) findViewById(R.id.bt2);
        Nhan = (Button) findViewById(R.id.bt3);
        Chia = (Button) findViewById(R.id.bt4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NutDieuKhien();
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = text1.getText().toString();
                String s2 = text2.getText().toString();
                float soA = Float.parseFloat(s1);
                float soB = Float.parseFloat(s2);

                float tong = soA + soB;
                String KQ = String.valueOf(tong);
                textkq.setText(KQ);
            }
        };
        Cong.setOnClickListener(boLangNgheCong);
        Tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = text1.getText().toString();
                String s2 = text2.getText().toString();
                float soA = Float.parseFloat(s1);
                float soB = Float.parseFloat(s2);

                float tong = soA - soB;
                String KQ = String.valueOf(tong);
                textkq.setText(KQ);

            }
        });
        Nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = text1.getText().toString();
                String s2 = text2.getText().toString();
                float soA = Float.parseFloat(s1);
                float soB = Float.parseFloat(s2);

                float tong = soA * soB;
                String KQ = String.valueOf(tong);
                textkq.setText(KQ);

            }
        });
        Chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = text1.getText().toString();
                String s2 = text2.getText().toString();
                float soA = Float.parseFloat(s1);
                float soB = Float.parseFloat(s2);

                float tong = soA / soB;
                String KQ = String.valueOf(tong);
                textkq.setText(KQ);

            }
        });

    }

}