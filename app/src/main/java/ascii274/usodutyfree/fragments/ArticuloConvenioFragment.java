package ascii274.usodutyfree.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import ascii274.usodutyfree.IndiceArticulosConvenio;
import ascii274.usodutyfree.R;


public class ArticuloConvenioFragment extends Fragment implements ListView.OnItemClickListener{
    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_indice_articulos_convenio,container,false);

        //return super.onCreateView(inflater, container, savedInstanceState);
        return rootView;

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String valorIdArt= (String) adapterView.getItemAtPosition(i);

        Intent intent=new Intent(getActivity(),IndiceArticulosConvenio.class);
        //valor.toString().trim();

        intent.putExtra("articleNumber", valorIdArt);
        //intent.putExtra("numberArticle",articleNumber);
        startActivity (intent);


    }
}
