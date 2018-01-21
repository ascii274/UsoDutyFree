package ascii274.dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Toast.makeText(this, "entra", Toast.LENGTH_LONG).show();

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonConsaguinidad,buttonConvenio,buttonFavoritos,buttonVerArticulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConsaguinidad=(Button) findViewById(R.id.btnAnexo1);
        buttonConsaguinidad.setOnClickListener(this);


        buttonVerArticulo=(Button) findViewById(R.id.btnVerArticulo);
        buttonVerArticulo.setOnClickListener(this);

        buttonConvenio=(Button) findViewById(R.id.btnConvenio);
        buttonConvenio.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnConvenio:
                Intent intentConvenio= new Intent(this,ConvenioActivity.class);
                startActivity(intentConvenio);
                break;
            case R.id.btnVerArticulo:
                Intent intentArtConvenio= new Intent(this,IndiceArticulosConvenio.class);
                startActivity(intentArtConvenio);
                break;
            case R.id.btnAnexo1:
                Intent intentConsaguinidad=new Intent(this,Consaguinidad.class);
                startActivity(intentConsaguinidad);
                break;


            default:

                break;

        }
    }
}
