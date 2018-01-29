package ascii274.dutyfree;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

//Toast.makeText(this, "entra", Toast.LENGTH_LONG).show();

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonAnexo1,buttonAnexo2,buttonConvenio,buttonFavoritos,buttonVerArticulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAnexo1=(Button) findViewById(R.id.btnAnexo1);
        buttonAnexo1.setOnClickListener(this);

        buttonAnexo2=(Button) findViewById(R.id.btnAnexo2);
        buttonAnexo2.setOnClickListener(this);


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
                Intent intentAnexo1=new Intent(this,Anexo1.class);
                startActivity(intentAnexo1);
                break;
            case R.id.btnAnexo2:
                Intent intentAnexo2=new Intent(this,Anexo2.class);
                startActivity(intentAnexo2);
                break;


            default:

                break;

        }
    }
}
