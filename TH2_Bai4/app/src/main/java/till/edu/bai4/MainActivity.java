package till.edu.bai4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    EditText textkq;
    Button Cong, Tru, Nhan, Chia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NutDieuKhien();

    }
    void NutDieuKhien(){
        EditText text1 = (EditText) findViewById(R.id.edt1);
        EditText text2 = (EditText) findViewById(R.id.edt2);
        EditText textkq = (EditText) findViewById(R.id.edtkq);
        Cong = (Button) findViewById(R.id.bt1);
        Tru = (Button) findViewById(R.id.bt2);
        Nhan = (Button) findViewById(R.id.bt3);
        Chia = (Button) findViewById(R.id.bt4);
    }
    void xulycong(View s){
        String s1 = text1.getText().toString();
        String s2 = text2.getText().toString();
        float soA = Float.parseFloat(s1);
        float soB = Float.parseFloat(s2);

        float tong = soA + soB;
        String KQ = String.valueOf(tong);
        textkq.setText(KQ);
    }
    void xulytru(View s){
        String s1 = text1.getText().toString();
        String s2 = text2.getText().toString();
        float soA = Float.parseFloat(s1);
        float soB = Float.parseFloat(s2);

        float tong = soA - soB;
        String KQ = String.valueOf(tong);
        textkq.setText(KQ);
    }
    void xulynhan(View s){


        String s1 = text1.getText().toString();
        String s2 = text2.getText().toString();
        float soA = Float.parseFloat(s1);
        float soB = Float.parseFloat(s2);

        float tong = soA * soB;
        String KQ = String.valueOf(tong);
        textkq.setText(KQ);
    }
    void xulychia(View s){
        String s1 = text1.getText().toString();
        String s2 = text2.getText().toString();
        float soA = Float.parseFloat(s1);
        float soB = Float.parseFloat(s2);

        float tong = soA / soB;
        String KQ = String.valueOf(tong);
        textkq.setText(KQ);
    }
}