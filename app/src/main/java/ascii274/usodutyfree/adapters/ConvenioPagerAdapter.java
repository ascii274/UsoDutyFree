package ascii274.usodutyfree.adapters;

/**
 * Created by casujo on 3/27/17.
 */

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
        return 75;
    }





    @Override
    public CharSequence getPageTitle(int position) {
        /*
         *todo: position starts = 0, articulo start=1
         *Todo: si modificamos el contenido del switch, ver switch ConvenioPlaceholderFragment
         */

        switch (position) {
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
                return "SECTION 9";
            case 9:
                return "SECTION 10";
            case 10:
                return "SECTION 11";
            case 11:
                return "SECTION 12";
            case 12:
                return "SECTION 13";
            case 13:
                return "SECTION 14";
            case 14:
                return "SECTION 15";
            case 15:
                return "SECTION 16";
            case 16:
                return "SECTION 17";
            case 17:
                return "SECTION 18";
            case 18:
                return "SECTION 19";
            case 19:
                return "SECTION 20";
            case 20:
                return "SECTION 21";
            case 21:
                return "SECTION 22";
            case 22:
                return "SECTION 23";
            case 23:
                return "SECTION 24";
            case 24:
                return "SECTION 25";
            case 25:
                return "SECTION 26";
            case 26:
                return "SECTION 27";
            case 27:
                return "SECTION 28";
            case 28:
                return "SECTION 29";
            case 29:
                return "SECTION 30";
            case 30:
                return "SECTION 31";
            case 31:
                return "SECTION 32";
            case 32:
                return "SECTION 33";
            case 33:
                return "SECTION 34";
            case 34:
                return "SECTION 35";
            case 35:
                return "SECTION 36";
            case 36:
                return "SECTION 37";
            case 37:
                return "SECTION 38";
            case 38:
                return "SECTION 39";
            case 39:
                return "SECTION 40";
            case 40:
                return "SECTION 41";
            case 41:
                return "SECTION 42";
            case 42:
                return "SECTION 43";
            case 43:
                return "SECTION 44";
            case 44:
                return "SECTION 45";
            case 45:
                return "SECTION 46";
            case 46:
                return "SECTION 47";
            case 47:
                return "SECTION 48";
            case 48:
                return "SECTION 49";
            case 49:
                return "SECTION 50";
            case 50:
                return "SECTION 51";
            case 51:
                return "SECTION 52";
            case 52:
                return "SECTION 53";
            case 53:
                return "SECTION 54";
            case 54:
                return "SECTION 55";
            case 55:
                return "SECTION 56";
            case 56:
                return "SECTION 57";
            case 57:
                return "SECTION 58";
            case 58:
                return "SECTION 59";
            case 59:
                return "SECTION 60";
            case 60:
                return "SECTION 61";
        }
        return null;

        //return "1"+ position;
    }



}