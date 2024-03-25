package ntu.MSSV63132461.cau3_gioithieubanthan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtht, edtCCCD, edtbosung;
    Button button;
    RadioGroup idgroup;
    CheckBox cbds,cbdb, cbcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtht = findViewById(R.id.edtht);
        edtCCCD = findViewById(R.id.edtCCCD);
        edtbosung = findViewById(R.id.edtbosung);
        button = findViewById(R.id.button);
        idgroup = findViewById(R.id.idgroup);
        cbcd = findViewById(R.id.cbcd);
        cbdb = findViewById(R.id.cbdb);
        cbds = findViewById(R.id.cbds);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = edtht.getText().toString();
                if(hoten.length() < 3)
                {
                    Toast.makeText(MainActivity.this,"họ tên phải >= 3 k tự:"
                            , Toast.LENGTH_LONG).show();
                    edtht.requestFocus();
                    edtht.selectAll();
                    return;
                }
                String CCCD = edtCCCD.getText().toString();
                if (CCCD.length() != 12)
                {
                    Toast.makeText(MainActivity.this, "CCCD phải có 12 số:"
                    , Toast.LENGTH_LONG).show();
                    edtCCCD.requestFocus();
                    edtCCCD.selectAll();
                    return;
                }
                int idselect = idgroup.getCheckedRadioButtonId();
                RadioButton radselect = findViewById(idselect);
                String bangcap = radselect.getText().toString();


            }
        });
    }
}