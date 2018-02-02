package ascii274.usodutyfree;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Anexo4 extends AppCompatActivity {
    private TextView textViewHead,textViewContent;
    private Typeface mTypefaceArticulo, mTypefaceDescArticulo;
    String fuenteCabecera = "fonts/DejaVuSans.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anexo4);

        textViewHead =(TextView) findViewById(R.id.txtVwAnexo4Head);
        textViewContent = (TextView)findViewById(R.id.txtVwAnexo4Content);
        this.mTypefaceArticulo = Typeface.createFromAsset(getAssets(), fuenteCabecera);
        this.mTypefaceDescArticulo = Typeface.createFromAsset(getAssets(), fuenteCabecera);
        textViewHead.setTypeface(mTypefaceArticulo);
        textViewContent.setTypeface(mTypefaceDescArticulo);
        textViewContent.setTextSize(getResources().getInteger(R.integer.txtIdArticuloSize));
        textViewContent.setTextSize(getResources().getInteger(R.integer.txtDescArticuloSize));
    }
}
