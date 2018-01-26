package ascii274.dutyfree;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class IndiceArticulosConvenio extends AppCompatActivity {

  private   ListView listView;
  private   String[] resCodeArt;
  private   String[] resDescription;

  /*Datos del tipo de texto*/
  private ListView cambioTxtCabecera,tipoTxtContenido;
  private TextView txtViewCambioTexto;
  private Typeface tipoNunito;
  String fuente="fonts/NunitoLight.ttf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indice_articulos_convenio);

        Resources resources=getResources();
        int intIdSize= resources.getInteger(R.integer.txtIdArticuloSize);
        int intDescSize=resources.getInteger(R.integer.txtDescArticuloSize);

        /*Parte cambio texto*/

        /*Escogemos los codigos de articulos araCodeArt dentro de codigos_articulos_2017_2019.xml*/
        resCodeArt=resources.getStringArray(R.array.araCodeArt);
       /*escogemos descripcion codigo araDescCodeArt dentro de descripcion_articulos_2017_2019.xml*/
        resDescription=resources.getStringArray(R.array.araDescCodeArt);


        listView=(ListView) findViewById(R.id.lstVieEnFragArtConv);

        CustomListIndiceArticulos customListIndiceArticulos =new CustomListIndiceArticulos(this,resCodeArt,resDescription,intIdSize,intDescSize);

        listView.setAdapter(customListIndiceArticulos);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            /*
             *Todo: siguiente linea comentado es para mostrar el codigo que he picado
             *Toast.makeText(IndiceArticulosConvenio.this,resCodeArt[i].trim(),Toast.LENGTH_SHORT).show();
             */

            String valorCodArticulo= (String) adapterView.getItemAtPosition(i);
            Intent intent=new Intent(getApplication(),DetalleArticulosConvenioActivity.class);

            intent.putExtra("codArticulo", valorCodArticulo);
            startActivity (intent);
            }
        });




    }


}
