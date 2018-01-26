package ascii274.dutyfree;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import ascii274.dutyfree.adapters.ConvenioPagerAdapter;

public class DetalleArticulosConvenioActivity extends AppCompatActivity {

    private ConvenioPagerAdapter mConvenioPagerAdapter;


    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_articulos_convenio);


        mConvenioPagerAdapter = new ConvenioPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.detArtConv_Container);
        mViewPager.setAdapter(mConvenioPagerAdapter);




        /*TODO aqui iniciamos captura codigo articulo */


        Bundle parameters = getIntent().getExtras();
        if(parameters!=null) {

            String cod;
            cod = parameters.getString("codArticulo");
            //System.out.println(cod);

            mViewPager.setAdapter(mConvenioPagerAdapter);

            //cod=start at value=0
            //Toast.makeText(this, "Articulo: "+cod  , Toast.LENGTH_LONG).show();

            switch (cod) {


                case "Artículo 01":
                    mViewPager.setCurrentItem(0);

                    //Toast.makeText(this, "entra", Toast.LENGTH_LONG).show();
                    break;
                case "Artículo 02":
                    mViewPager.setCurrentItem(1);

                    break;
                case "Artículo 03":
                    mViewPager.setCurrentItem(2);
                    break;
                case "Artículo 04":
                    mViewPager.setCurrentItem(3);
                    break;
                case "Artículo 05":
                    mViewPager.setCurrentItem(4);
                    break;
                case "Artículo 06":
                    mViewPager.setCurrentItem(5);
                    break;
                case "Artículo 07":
                    mViewPager.setCurrentItem(6);
                    break;
                case "Artículo 08":
                    mViewPager.setCurrentItem(7);
                    break;
                case "Artículo 09":
                    mViewPager.setCurrentItem(8);
                    break;
                case "Artículo 10":
                    mViewPager.setCurrentItem(9);
                    break;
                case "Artículo 11":
                    mViewPager.setCurrentItem(10);
                    break;
                case "Artículo 12":
                    mViewPager.setCurrentItem(11);
                    break;
                case "Artículo 13":
                    mViewPager.setCurrentItem(12);
                    break;
                case "Artículo 14":
                    mViewPager.setCurrentItem(13);
                    break;
                case "Artículo 15":
                    mViewPager.setCurrentItem(14);
                    break;
                case "Artículo 16":
                    mViewPager.setCurrentItem(15);
                    break;
                case "Artículo 17":
                    mViewPager.setCurrentItem(16);
                    break;
                case "Artículo 18":
                    mViewPager.setCurrentItem(17);
                    break;
                case "Artículo 19":
                    mViewPager.setCurrentItem(18);
                    break;
                case "Artículo 20":
                    mViewPager.setCurrentItem(19);
                    break;
                case "Artículo 21":
                    mViewPager.setCurrentItem(20);
                    break;
                case "Artículo 22":
                    mViewPager.setCurrentItem(21);
                    break;
                case "Artículo 23":
                    mViewPager.setCurrentItem(22);
                    break;
                case "Artículo 24":
                    mViewPager.setCurrentItem(23);
                    break;
                case "Artículo 25":
                    mViewPager.setCurrentItem(24);
                    break;
                case "Artículo 26":
                    mViewPager.setCurrentItem(25);
                    break;
                case "Artículo 27":
                    mViewPager.setCurrentItem(26);
                    break;
                case "Artículo 28":
                    mViewPager.setCurrentItem(27);
                    break;
                case "Artículo 29":
                    mViewPager.setCurrentItem(28);
                    break;
                case "Artículo 30":
                    mViewPager.setCurrentItem(29);
                    break;
                case "Artículo 31":
                    mViewPager.setCurrentItem(30);
                    break;
                case "Artículo 32":
                    mViewPager.setCurrentItem(31);
                    break;
                case "Artículo 33":
                    mViewPager.setCurrentItem(32);
                    break;
                case "Artículo 34":
                    mViewPager.setCurrentItem(33);
                    break;
                case "Artículo 35":
                    mViewPager.setCurrentItem(34);
                    break;
                case "Artículo 36":
                    mViewPager.setCurrentItem(35);
                    break;
                case "Artículo 37":
                    mViewPager.setCurrentItem(36);
                    break;
                case "Artículo 38":
                    mViewPager.setCurrentItem(37);
                    break;
                case "Artículo 39":
                    mViewPager.setCurrentItem(38);
                    break;
                case "Artículo 40":
                    mViewPager.setCurrentItem(39);
                    break;
                case "Artículo 41":
                    mViewPager.setCurrentItem(40);
                    break;
                case "Artículo 42":
                    mViewPager.setCurrentItem(41);
                    break;
                case "Artículo 43":
                    mViewPager.setCurrentItem(42);
                    break;
                case "Artículo 44":
                    mViewPager.setCurrentItem(43);
                    break;
                case "Artículo 45":
                    mViewPager.setCurrentItem(44);
                    break;
                case "Artículo 46":
                    mViewPager.setCurrentItem(45);
                    break;
                case "Artículo 47":
                    mViewPager.setCurrentItem(46);
                    break;
                case "Artículo 48":
                    mViewPager.setCurrentItem(47);
                    break;
                case "Artículo 49":
                    mViewPager.setCurrentItem(48);
                    break;
                case "Artículo 50":
                    mViewPager.setCurrentItem(49);
                    break;
                case "Artículo 51":
                    mViewPager.setCurrentItem(50);
                    break;
                case "Artículo 52":
                    mViewPager.setCurrentItem(51);
                    break;
                case "Artículo 53":
                    mViewPager.setCurrentItem(52);
                    break;
                case "Artículo 54":
                    mViewPager.setCurrentItem(53);
                    break;
                case "Artículo 55":
                    mViewPager.setCurrentItem(54);
                    break;
                case "Artículo 56":
                    mViewPager.setCurrentItem(55);
                    break;
                case "Artículo 57":
                    mViewPager.setCurrentItem(56);
                    break;
                case "Artículo 58":
                    mViewPager.setCurrentItem(57);
                    break;
                case "Artículo 59":
                    mViewPager.setCurrentItem(58);
                    break;

                case "Artículo 60":
                    mViewPager.setCurrentItem(59);
                    break;

                case "Artículo 61":
                    mViewPager.setCurrentItem(60);
                    break;

                case "Artículo 62":
                    mViewPager.setCurrentItem(61);
                    break;
                case "Artículo 63":
                    mViewPager.setCurrentItem(62);
                    break;
                case "Artículo 64":
                    mViewPager.setCurrentItem(63);
                    break;
                case "Artículo 65":
                    mViewPager.setCurrentItem(64);
                    break;
                case "Artículo 66":
                    mViewPager.setCurrentItem(65);
                    break;
                case "Artículo 67":
                    mViewPager.setCurrentItem(66);
                    break;
                case "Artículo 68":
                    mViewPager.setCurrentItem(67);
                    break;
                case "Artículo 69":
                    mViewPager.setCurrentItem(68);
                    break;
                case "Artículo 70":
                    mViewPager.setCurrentItem(69);
                    break;
                case "Artículo 71":
                    mViewPager.setCurrentItem(70);
                    break;
                case "Artículo 72":
                    mViewPager.setCurrentItem(71);
                    break;
                case "Artículo 73":
                    mViewPager.setCurrentItem(72);
                    break;
                case "Artículo 74":
                    mViewPager.setCurrentItem(73);
                    break;
                case "Artículo 75":
                    mViewPager.setCurrentItem(74);
                    break;
                case "Artículo 76":
                    mViewPager.setCurrentItem(75);
                    break;
                case "Capítulo XIII":
                    mViewPager.setCurrentItem(76);
                    break;
                case "Capítulo XIV":
                    mViewPager.setCurrentItem(77);
                    break;

                case "Anexo 1":
                    mViewPager.setCurrentItem(78);
                    break;
                case "Anexo 2":
                    mViewPager.setCurrentItem(79);
                    break;

                default:
                    Toast.makeText(this, "Articulo: "+cod + " No encontrado", Toast.LENGTH_LONG).show();

                    //mViewPager.setAdapter(mConvenioPagerAdapter);
                    break;
            }
        } else{
            mViewPager.setAdapter(mConvenioPagerAdapter);

        }



        // Set up the ViewPager with the sections adapter.
       // mViewPager = (ViewPager) findViewById(R.id.detArtConv_Container);
        //mViewPager.setAdapter(mConvenioPagerAdapter);
        //mViewPager.setCurrentItem(5);



    }

    /*
    apartir de aqui convenio
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        /*
         *todo: descomentar si queremos ver la opcion en los ajustes
         *getMenuInflater().inflate(R.menu.menu_main, menu);
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
