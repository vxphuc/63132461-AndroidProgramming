package ntu.mssv63132461.bai2_quanlylophoc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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
        myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mylist);
        lv.setAdapter(myadapter);
        mydatabase = openOrCreateDatabase("qllophoc.db", MODE_PRIVATE, null);
        try {
            String sql = "CREATE TABLE tbllop(malop TEXT primary key, tenlop TEXT,chiso INTERGER)";
            mydatabase.execSQL(sql);
        }
        catch (Exception e)
        {
            Log.e("Error", "Table đã tồn tại:");
        }
        bti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String malop = edtml.getText().toString();
                String tenlop = edttl.getText().toString();
                int chiso = Integer.parseInt(edtcs.getText().toString());
                ContentValues myvalue = new ContentValues();
                myvalue.put("malop", malop);
                myvalue.put("tenlop", tenlop);
                myvalue.put("chiso", chiso);
                String msg = "";
                if (mydatabase.insert("tbllop", null, myvalue) == -1)
                {
                    msg = "Fail to insert.";
                }
                else {
                    msg = "insert record successfully";
                }
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        btd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String malop = edtml.getText().toString();
                int n = mydatabase.delete("tbllop", "malop = ?",new String[]{malop});
                String msg = "";
                if (n == 0)
                {
                    msg = "No record Delete";
                }else {
                    msg = n + "record is Delete";
                }
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int chiso = Integer.parseInt(edtcs.getText().toString());
                String malop = edtml.getText().toString();
                ContentValues myvalue = new ContentValues();
                myvalue.put("chiso", chiso);
                int n = mydatabase.update("tbllop", myvalue, "malop = ?", new String[]{malop});
                String msg = "";
                if (n == 0)
                {
                    msg = "No record Update";
                }else {
                    msg = n +"record is Update";
                }
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        btq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mylist.clear();
                Cursor c = mydatabase.query("tbllop", null
                        , null, null, null
                        , null, null);
                c.moveToNext();
                String data = "";
                while (c.isAfterLast() == false)
                {
                    data = c.getString(0)+" - "+ c.getString(1)+" - "+ c.getString(2);
                    c.moveToNext();
                    mylist.add(data);
                }
                c.close();
                myadapter.notifyDataSetChanged();
            }
        });
    }
}