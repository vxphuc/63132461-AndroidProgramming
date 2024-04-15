package ntu.mssv63132461.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    ArrayList<LandSpace> recylerViewData;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerViewData = getDataForRecylerView();
        recyclerView = findViewById(R.id.Rccland);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutLinear);
        adapter = new Adapter(this, recylerViewData);
        recyclerView.setAdapter(adapter);
    }
    ArrayList<LandSpace> getDataForRecylerView(){
        ArrayList<LandSpace> dsDulieu = new ArrayList<LandSpace>();
        LandSpace landSpace1 = new LandSpace("OIP", "Thap Ha Noi");
        dsDulieu.add(landSpace1);
        dsDulieu.add(new LandSpace("thaptram", "Thap Tram Huong Nha Trang"));
        dsDulieu.add(new LandSpace("R", "Ho Xuan Huong Da Lat"));
        dsDulieu.add(new LandSpace("cau_vang", "Cau Vang Da Nang"));

        return dsDulieu;
    }
}