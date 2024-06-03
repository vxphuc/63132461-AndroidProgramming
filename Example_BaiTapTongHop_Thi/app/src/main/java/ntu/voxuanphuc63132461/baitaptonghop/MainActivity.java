package ntu.voxuanphuc63132461.baitaptonghop;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFargment = null;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.nav_home){
                    selectedFargment = new homeFragment();
                } else if (itemId == R.id.cau1) {
                    selectedFargment = new cau1Fragment();
                } else if (itemId == R.id.cau2) {
                    selectedFargment = new cau2Fragment();
                } else if (itemId == R.id.cau3) {
                    selectedFargment = new cau3Fragment();
                }else if (itemId == R.id.cau4) {
                    selectedFargment = new cau4Fragment();
                }
                if (selectedFargment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.spaceFragment, selectedFargment).commit();
                }
                return true;
            }
        });
    }
}