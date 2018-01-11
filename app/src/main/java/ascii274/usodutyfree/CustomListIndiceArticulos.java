package ascii274.usodutyfree;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Document;

/**
 * Created by casujo on 9/8/17.
 */

public class CustomListIndiceArticulos extends ArrayAdapter <String>{

    private String [] strId;
    private String [] strDescription;
    private Activity context;
    private int idSize;
    private int descSize;


    public CustomListIndiceArticulos(@NonNull Activity context,String[] strId, String[] strDescription, int idSize, int descSize) {
    //    super(context, resource);
        super(context,R.layout.activity_custom_list_indice_articulos,strId);

        this.strId=strId;
        this.strDescription=strDescription;
        this.context=context;
        this.idSize=idSize;
        this.descSize=descSize;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      //  return super.getView(position, convertView, parent);

        View v=convertView;
        ViewHolder viewHolder=null;

        if(v==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            v=layoutInflater.inflate(R.layout.activity_custom_list_indice_articulos,null,true);
            viewHolder=new ViewHolder(v);
            v.setTag(viewHolder);


        }
        else {
            viewHolder =(ViewHolder) v.getTag();

        }

        //viewHolder.txtVwConvenio1.setTextSize(descSize);//Capitulo
        viewHolder.txtVwConvenio2.setTextSize(idSize);
        viewHolder.txtVwConvenio3.setTextSize(descSize);

        //text=strId[position].toString();
        /*
        try{

        if(strId[position]!=null ){
            if(strId[position].equals("Artículo 01")) {

                viewHolder.txtVwConvenio1.setVisibility(View.VISIBLE);
                viewHolder.txtVwConvenio1.setText("Capitulo I");


            }


       }
       */
        viewHolder.txtVwConvenio2.setText(strId[position]);
        viewHolder.txtVwConvenio3.setText(strDescription [position]);
        //viewHolder.txtVwConvenio1.setVisibility(View.GONE);
        return v;

    }

    class ViewHolder{
        TextView txtVwConvenio1;//Capitulo
        TextView txtVwConvenio2;
        TextView txtVwConvenio3;

        ViewHolder(View v){
            //txtVwConvenio1=v.findViewById(R.id.txVwCustoLisCon_Cap);
            txtVwConvenio2=v.findViewById(R.id.txVwCustomLisCon_Id);
            txtVwConvenio3=v.findViewById(R.id.txVwCustoLisCon_Desc);


        }
    }
}
