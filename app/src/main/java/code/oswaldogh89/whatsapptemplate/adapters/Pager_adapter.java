package code.oswaldogh89.whatsapptemplate.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import code.oswaldogh89.whatsapptemplate.fragments.chats_fragment;
import code.oswaldogh89.whatsapptemplate.fragments.contactos_fragment;
import code.oswaldogh89.whatsapptemplate.fragments.llamadas_fragment;

/**
 * Created by Oswaldo Gomez on 23/07/2015.
 */
public class Pager_adapter extends FragmentStatePagerAdapter {

    public Pager_adapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int pos) {

        Fragment fragment = null;
        switch (pos) {

            case 0:
                fragment = new llamadas_fragment();
                break;
            case 1:
                fragment = new chats_fragment();
                break;
            case 2:
                fragment = new contactos_fragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

}