package jesus.com.mazter707.fress;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import jesus.com.mazter707.fress.fragments.CreditFragment;
import jesus.com.mazter707.fress.fragments.InventoryFragment;
import jesus.com.mazter707.fress.fragments.SalesFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBbottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showSelectedFragment(new InventoryFragment());

        mBbottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);

        mBbottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId()== R.id.menu_inventory){
                    showSelectedFragment(new InventoryFragment());

                }

                if (menuItem.getItemId()== R.id.menu_credit){
                    showSelectedFragment(new CreditFragment());

                }

                if (menuItem.getItemId()== R.id.menu_sales){
                    showSelectedFragment(new SalesFragment());

                }

                return true;
            }
        });
    }

    private void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}
