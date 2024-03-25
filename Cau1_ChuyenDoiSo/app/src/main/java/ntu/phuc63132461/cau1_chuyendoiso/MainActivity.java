package ntu.phuc63132461.cau1_chuyendoiso;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editTexttp, editTextnp, editTextbp, editTexttlp, editTextnhap;
    private RadioButton rdbtp, rdbnp, rdbbp, rdbtlp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTexttp = findViewById(R.id.edttp);
        editTextnp = findViewById(R.id.edtnp);
        editTextbp = findViewById(R.id.edtbp);
        editTexttlp = findViewById(R.id.edttlp);
        editTextnhap = findViewById(R.id.edtnhap);

        rdbtp = findViewById(R.id.rdbtp);
        rdbnp = findViewById(R.id.rdbnp);
        rdbbp = findViewById(R.id.rdbbp);
        rdbtlp = findViewById(R.id.rdbtlp);
    }
    void kq(View v)
    {
        String nhap = editTextnhap.getText().toString();

        if (!nhap.isEmpty()) {
            try {
                float nhapso = Float.parseFloat(nhap);

                if (rdbtp.isChecked()) {

                    String nhiphan = Integer.toBinaryString((int) nhapso);
                    editTextnp.setText(nhiphan);
                } else if (rdbbp.isChecked()) {

                    String batphan = Integer.toOctalString((int) nhapso);
                    editTextbp.setText(batphan);
                } else if (rdbtlp.isChecked()) {

                    String thaplucphan = Integer.toHexString((int) nhapso);
                    editTexttlp.setText(thaplucphan);
                }
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Vui lòng nhập số", Toast.LENGTH_SHORT).show();
        }
    }
}