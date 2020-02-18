package jesus.com.mazter707.fress;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView mBbottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBbottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);

        mBbottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId()== R.id.menu_inventory){

                }

                if (menuItem.getItemId()== R.id.menu_credit){

                }

                if (menuItem.getItemId()== R.id.menu_sales){

                }

                return true;
            }
        });
    }
}
