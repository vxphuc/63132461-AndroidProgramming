package ntu.phuc63132461.cau1_chuyendoiso;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtnp, edtbp, edttlp, edttp;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnp = findViewById(R.id.edtnp);
        edtbp = findViewById(R.id.edtbp);
        edttlp = findViewById(R.id.edttlp);
        edttp = findViewById(R.id.edttp);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimalStr = edttp.getText().toString();
                if (decimalStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số thập phân", Toast.LENGTH_SHORT).show();
                    return;
                }
                try {
                    int decimal = Integer.parseInt(decimalStr);

                    String binary = Integer.toBinaryString(decimal);
                    String octal = Integer.toOctalString(decimal);
                    String hexadecimal = Integer.toHexString(decimal);

                    edtnp.setText(binary);
                    edtbp.setText(octal);
                    edttlp.setText(hexadecimal);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Số thập phân không hợp lệ", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}