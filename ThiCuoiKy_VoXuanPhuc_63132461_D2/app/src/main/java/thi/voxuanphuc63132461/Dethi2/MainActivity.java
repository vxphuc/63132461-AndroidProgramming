package thi.voxuanphuc63132461.Dethi2;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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
                if (itemId == R.id.nav_home) {
                    selectedFargment = new WelcomeFragment();
                } else if (itemId == R.id.cau1) {
                    selectedFargment = new UnitConverterFragment();
                } else if (itemId == R.id.cau2) {
                    selectedFargment = new WelknownCoffeeFragment();
                } else if (itemId == R.id.cau3) {
                    selectedFargment = new SubjectsFragment();
                } else if (itemId == R.id.cau4) {
                    selectedFargment = new MyCVFragment();
                }
                if (selectedFargment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.spaceFragment, selectedFargment).commit();
                }
                return true;
            }
        });
    }
}