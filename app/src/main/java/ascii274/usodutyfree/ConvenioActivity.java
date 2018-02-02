package ascii274.usodutyfree;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import ascii274.usodutyfree.adapters.ConvenioPagerAdapter;

public class ConvenioActivity extends AppCompatActivity {

    private ConvenioPagerAdapter mConvenioPagerAdapter;


    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convenio);

        mConvenioPagerAdapter = new ConvenioPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.actiConve_Container);
        mViewPager.setAdapter(mConvenioPagerAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        /*
         *Todo: decomentar si queremos ver la opcion setting en la actividad.
         * getMenuInflater().inflate(R.menu.menu_main, menu);
         */
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
