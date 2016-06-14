package code.oswaldogh89.whatsapptemplate.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.TextView;

import code.oswaldogh89.whatsapptemplate.R;
import code.oswaldogh89.whatsapptemplate.adapters.Pager_adapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setTitle("Whatsapp");

        viewPagerHome = (ViewPager) findViewById(R.id.homePager);
        setupViewPager();

        TabLayout tabLayout = (TabLayout) findViewById(R.id.homeTabs);
        tabLayout.setupWithViewPager(viewPagerHome);
        setTabsIconsHome(tabLayout);

    }

    private void setupViewPager() {

        viewPagerHome.setAdapter(new Pager_adapter(getSupportFragmentManager()));
        viewPagerHome.setOffscreenPageLimit(3);
        viewPagerHome.setCurrentItem(1);
    }

    public void setTabsIconsHome(TabLayout tabsIcons) {

        TextView tabHome1 = (TextView) LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_tab, null);
        tabHome1.setText("LLAMADAS");
        tabsIcons.getTabAt(0).setCustomView(tabHome1);

        TextView tabHome2 = (TextView) LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_tab, null);
        tabHome2.setText("CHATS");
        tabsIcons.getTabAt(1).setCustomView(tabHome2);

        TextView tabHome3 = (TextView) LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_tab, null);
        tabHome3.setText("CONTACTOS");
        tabsIcons.getTabAt(2).setCustomView(tabHome3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
