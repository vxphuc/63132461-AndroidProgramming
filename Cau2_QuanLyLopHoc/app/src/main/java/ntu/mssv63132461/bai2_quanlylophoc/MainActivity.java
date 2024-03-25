package ntu.mssv63132461.bai2_quanlylophoc;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtml, edttl, edtcs;
    Button bti, btd, btu, btq;
    ListView lv;
    ArrayList<String> mylist;
    ArrayAdapter<String> myadapter;
    SQLiteDatabase mydatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtml = findViewById(R.id.edtml);
        edttl = findViewById(R.id.edttl);
        edtcs = findViewById(R.id.edtcs);
        bti = findViewById(R.id.bti);
        btu = findViewById(R.id.btu);
        btd = findViewById(R.id.btd);
        btq = findViewById(R.id.btq);
        lv = findViewById(R.id.lv);
        mylist = new ArrayList<>();
    }
}