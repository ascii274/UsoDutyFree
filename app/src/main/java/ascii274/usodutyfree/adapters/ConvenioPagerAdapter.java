package ascii274.usodutyfree.adapters;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ascii274.usodutyfree.fragments.ConvenioPlaceholderFragment;

/*
 *Todo: Utilizado por Actividades: ConvenioActivity y DetalleArticulosConvenioActivity
 */

public class ConvenioPagerAdapter extends FragmentPagerAdapter {

    public ConvenioPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

            return ConvenioPlaceholderFragment.newInstance(position + 1);

    }

    @Override
    public int getCount() {
        // Show  total pages.
        return 82;
    }





    @Override
    public CharSequence getPageTitle(int position) {
        /*
         *todo: position starts = 0, articulo start=1
         *Todo: si modificamos el contenido del switch, ver switch ConvenioPlaceholderFragment
         */

        switch (position) {
                // Texto es la que se ve en los tabs
            case 0:
                return "Artículo 1";
            case 1:
                return "Artículo 2";
            case 2:
                return "Artículo 3";
            case 3:
                return "Artículo 4";
            case 4:
                return "Artículo 5";
            case 5:
                return "Artículo 6";
            case 6:
                return "Artículo 7";
            case 7:
                return "Artículo 8";
            case 8:
                return "Artículo 9";
            case 9:
                return "Artículo 10";
            case 10:
                return "Artículo 11";
            case 11:
                return "Artículo 12";
            case 12:
                return "Artículo 13";
            case 13:
                return "Artículo 14";
            case 14:
                return "Artículo 15";
            case 15:
                return "Artículo 16";
            case 16:
                return "Artículo 17";
            case 17:
                return "Artículo 18";
            case 18:
                return "Artículo 19";
            case 19:
                return "Artículo 20";
            case 20:
                return "Artículo 21";
            case 21:
                return "Artículo 22";
            case 22:
                return "Artículo 23";
            case 23:
                return "Artículo 24";
            case 24:
                return "Artículo 25";
            case 25:
                return "Artículo 26";
            case 26:
                return "Artículo 27";
            case 27:
                return "Artículo 28";
            case 28:
                return "Artículo 29";
            case 29:
                return "Artículo 30";
            case 30:
                return "Artículo 31";
            case 31:
                return "Artículo 32";
            case 32:
                return "Artículo 33";
            case 33:
                return "Artículo 34";
            case 34:
                return "Artículo 35";
            case 35:
                return "Artículo 36";
            case 36:
                return "Artículo 37";
            case 37:
                return "Artículo 38";
            case 38:
                return "Artículo 39";
            case 39:
                return "Artículo 40";
            case 40:
                return "Artículo 41";
            case 41:
                return "Artículo 42";
            case 42:
                return "Artículo 43";
            case 43:
                return "Artículo 44";
            case 44:
                return "Artículo 45";
            case 45:
                return "Artículo 46";
            case 46:
                return "Artículo 47";
            case 47:
                return "Artículo 48";
            case 48:
                return "Artículo 49";
            case 49:
                return "Artículo 50";
            case 50:
                return "Artículo 51";
            case 51:
                return "Artículo 52";
            case 52:
                return "Artículo 53";
            case 53:
                return "Artículo 54";
            case 54:
                return "Artículo 55";
            case 55:
                return "Artículo 56";
            case 56:
                return "Artículo 57";
            case 57:
                return "Artículo 58";
            case 58:
                return "Artículo 59";
            case 59:
                return "Artículo 60";
            case 60:
                return "Artículo 61";
            case 61:
                return "Artículo 62";
            case 62:
                return "Artículo 63";
            case 63:
                return "Artículo 64";
            case 64:
                return "Artículo 65";
            case 65:
                return "Artículo 66";
            case 66:
                return "Artículo 67";
            case 67:
                return "Artículo 68";
            case 68:
                return "Artículo 69";
            case 69:
                return "Artículo 70";
            case 70:
                return "Artículo 71";
            case 71:
                return "Artículo 72";
            case 72:
                return "Artículo 73";
            case 73:
                return "Artículo 74";
            case 74:
                return "Artículo 75";
            case 75:
                return "Artículo 76";

            case 76:
                return "Capítulo XIII";
            case 77:
                return "Capítulo XIV";
            case 78:
                return "Anexo 1";
            case 79:
                return "Anexo 2";
            case 80:
                return "Anexo 3";
            case 81:
                return "Anexo 4";
        }
        return null;

        //return "1"+ position;
    }
}