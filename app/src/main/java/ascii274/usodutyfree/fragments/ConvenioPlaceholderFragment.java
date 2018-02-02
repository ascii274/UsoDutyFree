package ascii274.usodutyfree.fragments;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ascii274.usodutyfree.R;


public  class ConvenioPlaceholderFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ConvenioPlaceholderFragment newInstance(int sectionNumber) {
        ConvenioPlaceholderFragment fragment = new ConvenioPlaceholderFragment();
        Bundle args = new Bundle();

        args.putInt(ARG_SECTION_NUMBER, sectionNumber);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int num = getArguments().getInt(ARG_SECTION_NUMBER);




            View rootView = inflater.inflate(R.layout.convenio_activity_content, container, false);
            TextView textViewHead = rootView.findViewById(R.id.txtArtHeader);
            TextView textViewContent = rootView.findViewById(R.id.txtArtContent);
            View view=rootView.findViewById(R.id.viewEnActvtContent);
            view.setBackgroundColor(getResources().getColor(R.color.colLineaCabecera));


            Resources res = getResources();
            int idArticulo = res.getInteger(R.integer.txtIdArticuloSize);
            int descArticulo = res.getInteger(R.integer.txtDescArticuloSize);

            textViewHead.setTextSize(idArticulo);
            //textViewHead.setBackgroundColor(getResources().getColor(R.color.cabecera));
            //textViewHead.setTextColor(getResources().getColor(R.color.txtColorCabecera));
            textViewContent.setTextSize(descArticulo);
            //textViewContent.setTextColor(getResources().getColor(R.color.cabecera));


        /*
        * Seccion de cambio texto
        * */
            Typeface mTypefaceArticulo, mTypefaceDescArticulo;
            String fuenteCabecera = "fonts/DejaVuSans.ttf";
            //String fuenteCabecera="fonts/NunitoLight.ttf";


            mTypefaceArticulo = Typeface.createFromAsset(getContext().getAssets(), fuenteCabecera);
            mTypefaceDescArticulo = Typeface.createFromAsset(getContext().getAssets(), fuenteCabecera);
            textViewHead.setTypeface(mTypefaceArticulo);
            textViewContent.setTypeface(mTypefaceDescArticulo);


        /*
         *todo: si modificamos el contenido del switch, ver switch ConvenioPageAdapter
         */
            switch (num) {
                case 1:
                    textViewHead.setText(R.string.art01Head);
                    textViewContent.setText(R.string.art01Content);
                    break;
                case 2:
                    textViewHead.setText(R.string.art02Head);
                    textViewContent.setText(R.string.art02Content);
                    break;
                case 3:
                    textViewHead.setText(R.string.art03Head);
                    textViewContent.setText(R.string.art03Content);
                    break;
                case 4:
                    textViewHead.setText(R.string.art04Head);
                    textViewContent.setText(R.string.art04Content);
                    break;
                case 5:
                    textViewHead.setText(R.string.art05Head);
                    textViewContent.setText(R.string.art05Content);
                    break;
                case 6:
                    textViewHead.setText(R.string.art06Head);
                    textViewContent.setText(R.string.art06Content);
                    break;

                case 7:
                    textViewHead.setText(R.string.art07Head);
                    textViewContent.setText(R.string.art07Content);
                    break;
                case 8:
                    textViewHead.setText(R.string.art08Head);
                    textViewContent.setText(R.string.art08Content);
                    break;
                case 9:
                    textViewHead.setText(R.string.art09Head);
                    textViewContent.setText(R.string.art09Content);
                    break;
                case 10:
                    textViewHead.setText(R.string.art10Head);
                    textViewContent.setText(R.string.art10Content);
                    break;
                case 11:
                    textViewHead.setText(R.string.art11Head);
                    textViewContent.setText(R.string.art11Content);
                    break;
                case 12:
                    textViewHead.setText(R.string.art12Head);
                    textViewContent.setText(R.string.art12Content);
                    break;
                case 13:
                    textViewHead.setText(R.string.art13Head);
                    textViewContent.setText(R.string.art13Content);
                    break;
                case 14:
                    textViewHead.setText(R.string.art14Head);
                    textViewContent.setText(R.string.art14Content);
                    break;
                case 15:
                    textViewHead.setText(R.string.art15Head);
                    textViewContent.setText(R.string.art15Content);
                    break;
                case 16:
                    textViewHead.setText(R.string.art16Head);
                    textViewContent.setText(R.string.art16Content);
                    break;
                case 17:
                    textViewHead.setText(R.string.art17Head);
                    textViewContent.setText(R.string.art17Content);
                    break;
                case 18:
                    textViewHead.setText(R.string.art18Head);
                    textViewContent.setText(R.string.art18Content);
                    break;
                case 19:
                    textViewHead.setText(R.string.art19Head);
                    textViewContent.setText(R.string.art19Content);
                    break;
                case 20:
                    textViewHead.setText(R.string.art20Head);
                    textViewContent.setText(R.string.art20Content);
                    break;
                case 21:
                    textViewHead.setText(R.string.art21Head);
                    textViewContent.setText(R.string.art21Content);
                    break;
                case 22:
                    textViewHead.setText(R.string.art22Head);
                    textViewContent.setText(R.string.art22Content);
                    break;
                case 23:
                    textViewHead.setText(R.string.art23Head);
                    textViewContent.setText(R.string.art23Content);
                    break;
                case 24:
                    textViewHead.setText(R.string.art24Head);
                    textViewContent.setText(R.string.art24Content);
                    break;
                case 25:
                    textViewHead.setText(R.string.art25Head);
                    textViewContent.setText(R.string.art25Content);
                    break;
                case 26:
                    textViewHead.setText(R.string.art26Head);
                    textViewContent.setText(R.string.art26Content);
                    break;
                case 27:
                    textViewHead.setText(R.string.art27Head);
                    textViewContent.setText(R.string.art28Content);
                    break;
                case 28:
                    textViewHead.setText(R.string.art28Head);
                    textViewContent.setText(R.string.art28Content);
                    break;
                case 29:
                    textViewHead.setText(R.string.art29Head);
                    textViewContent.setText(R.string.art29Content);
                    break;
                case 30:
                    textViewHead.setText(R.string.art30Head);
                    textViewContent.setText(R.string.art30Content);
                    break;
                case 31:
                    textViewHead.setText(R.string.art31Head);
                    textViewContent.setText(R.string.art31Content);
                    break;
                case 32:
                    textViewHead.setText(R.string.art32Head);
                    textViewContent.setText(R.string.art32Content);
                    break;
                case 33:
                    textViewHead.setText(R.string.art33Head);
                    textViewContent.setText(R.string.art33Content);
                    break;
                case 34:
                    textViewHead.setText(R.string.art34Head);
                    textViewContent.setText(R.string.art34Content);
                    break;
                case 35:
                    textViewHead.setText(R.string.art35Head);
                    textViewContent.setText(R.string.art35Content);
                    break;
                case 36:
                    textViewHead.setText(R.string.art36Head);
                    textViewContent.setText(R.string.art36Content);
                    break;
                case 37:
                    textViewHead.setText(R.string.art37Head);
                    textViewContent.setText(R.string.art37Content);
                    break;
                case 38:
                    textViewHead.setText(R.string.art38Head);
                    textViewContent.setText(R.string.art38Content);
                    break;
                case 39:
                    textViewHead.setText(R.string.art39Head);
                    textViewContent.setText(R.string.art39Content);
                    break;
                case 40:
                    textViewHead.setText(R.string.art40Head);
                    textViewContent.setText(R.string.art40Content);
                    break;
                case 41:
                    textViewHead.setText(R.string.art41Head);
                    textViewContent.setText(R.string.art41Content);
                    break;
                case 42:
                    textViewHead.setText(R.string.art42Head);
                    textViewContent.setText(R.string.art42Content);
                    break;
                case 43:
                    textViewHead.setText(R.string.art43Head);
                    textViewContent.setText(R.string.art43Content);
                    break;
                case 44:
                    textViewHead.setText(R.string.art44Head);
                    textViewContent.setText(R.string.art44Content);
                    break;

                case 45:
                    textViewHead.setText(R.string.art45Head);
                    textViewContent.setText(R.string.art45Content);
                    break;

                case 46:
                    textViewHead.setText(R.string.art46Head);
                    textViewContent.setText(R.string.art46Content);
                    break;

                case 47:
                    textViewHead.setText(R.string.art47Head);
                    textViewContent.setText(R.string.art47Content);
                    break;

                case 48:
                    textViewHead.setText(R.string.art48Head);
                    textViewContent.setText(R.string.art48Content);
                    break;

                case 49:
                    textViewHead.setText(R.string.art49Head);
                    textViewContent.setText(R.string.art49Content);
                    break;
                case 50:
                    textViewHead.setText(R.string.art50Head);
                    textViewContent.setText(R.string.art50Content);
                    break;
                case 51:
                    textViewHead.setText(R.string.art51Head);
                    textViewContent.setText(R.string.art51Content);
                    break;
                case 52:
                    textViewHead.setText(R.string.art52Head);
                    textViewContent.setText(R.string.art52Content);
                    break;
                case 53:
                    textViewHead.setText(R.string.art53Head);
                    textViewContent.setText(R.string.art53Content);
                    break;
                case 54:
                    textViewHead.setText(R.string.art54Head);
                    textViewContent.setText(R.string.art54Content);
                    break;
                case 55:
                    textViewHead.setText(R.string.art55Head);
                    textViewContent.setText(R.string.art55Content);
                    break;
                case 56:
                    textViewHead.setText(R.string.art56Head);
                    textViewContent.setText(R.string.art56Content);
                    break;
                case 57:
                    textViewHead.setText(R.string.art57Head);
                    textViewContent.setText(R.string.art57Content);
                    break;
                case 58:
                    textViewHead.setText(R.string.art58Head);
                    textViewContent.setText(R.string.art58Content);
                    break;
                case 59:
                    textViewHead.setText(R.string.art59Head);
                    textViewContent.setText(R.string.art59Content);
                    break;
                case 60:
                    textViewHead.setText(R.string.art60Head);
                    textViewContent.setText(R.string.art60Content);
                    break;
                case 61:
                    textViewHead.setText(R.string.art61Head);
                    textViewContent.setText(R.string.art61Content);
                    break;
                case 62:
                    textViewHead.setText(R.string.art62Head);
                    textViewContent.setText(R.string.art62Content);
                    break;
                case 63:
                    textViewHead.setText(R.string.art63Head);
                    textViewContent.setText(R.string.art63Content);
                    break;
                case 64:
                    textViewHead.setText(R.string.art64Head);
                    textViewContent.setText(R.string.art64Content);
                    break;
                case 65:
                    textViewHead.setText(R.string.art65Head);
                    textViewContent.setText(R.string.art65Content);
                    break;
                case 66:
                    textViewHead.setText(R.string.art66Head);
                    textViewContent.setText(R.string.art66Content);
                    break;
                case 67:
                    textViewHead.setText(R.string.art67Head);
                    textViewContent.setText(R.string.art67Content);
                    break;
                case 68:
                    textViewHead.setText(R.string.art68Head);
                    textViewContent.setText(R.string.art68Content);
                    break;
                case 69:
                    textViewHead.setText(R.string.art69Head);
                    textViewContent.setText(R.string.art69Content);
                    break;
                case 70:
                    textViewHead.setText(R.string.art70Head);
                    textViewContent.setText(R.string.art70Content);
                    break;
                case 71:
                    textViewHead.setText(R.string.art71Head);
                    textViewContent.setText(R.string.art71Content);
                    break;
                case 72:
                    textViewHead.setText(R.string.art72Head);
                    textViewContent.setText(R.string.art72Content);
                    break;
                case 73:
                    textViewHead.setText(R.string.art73Head);
                    textViewContent.setText(R.string.art73Content);
                    break;
                case 74:
                    textViewHead.setText(R.string.art74Head);
                    textViewContent.setText(R.string.art74Content);
                    break;
                case 75:
                    textViewHead.setText(R.string.art75Head);
                    textViewContent.setText(R.string.art75Content);
                    break;
                case 76:
                    textViewHead.setText(R.string.art76Head);
                    textViewContent.setText(R.string.art76Content);
                    break;
                case 77:
                    textViewHead.setText(R.string.capitulo13Head);
                    textViewContent.setText(R.string.capitulo13Content);
                    break;
                case 78:
                    textViewHead.setText(R.string.capitulo14Head);
                    textViewContent.setText(R.string.capitulo14Content);
                    break;

                case 79:
                    //
                    textViewHead.setText(R.string.artAnexo1Head);
                    textViewContent.setText(R.string.artAnexo1Content);
                    break;
                case 80:
                    textViewHead.setText(R.string.artAnexo2Head);
                    textViewContent.setText(R.string.artAnexo2Content);
                    break;
                case 81:
                    textViewHead.setText(R.string.artAnexo3Head);
                    textViewContent.setText(R.string.artAnexo3Content);
                    break;
                case 82:
                    textViewHead.setText(R.string.artAnexo4Head);
                    textViewContent.setText(R.string.artAnexo4Content);
                    break;


            }
            return rootView;
        }




}