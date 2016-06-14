package code.oswaldogh89.whatsapptemplate.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import code.oswaldogh89.whatsapptemplate.R;
import code.oswaldogh89.whatsapptemplate.adapters.ListItems_adapter;
import code.oswaldogh89.whatsapptemplate.objects.Contact;


public class chats_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView mRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Contact> contacts = new ArrayList<>();

        Contact contacto;

        contacto = new Contact();
        contacto.setName("oswaldo");
        contacto.setImgProfile("http://img.uefa.com/imgml/TP/players/9/2015/324x324/95803.jpg");
        contacto.setPhoneNumber("Disponible");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Yaneth");
        contacto.setImgProfile("http://s9.favim.com/mini/130829/black-and-white-emma-watson-face-hair-Favim.com-887088.jpg");
        contacto.setPhoneNumber("Hey There.! I am using Whatsapp.");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Amigos Universidad");
        contacto.setImgProfile("http://a1.files.biography.com/image/upload/c_fill,cs_srgb,dpr_1.0,g_face,h_300,q_80,w_300/MTE4MDAzNDEwNzI1ODY0OTc0.jpg");
        contacto.setPhoneNumber("jajaja!!");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Mama");
        contacto.setImgProfile("http://www.mountainmamacooks.com/wp-content/uploads/2010/08/mountain-mama-profile-pic-www.mountainmamacooks.com_.jpg");
        contacto.setPhoneNumber("Ocupado.");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Trabajo");
        contacto.setImgProfile("https://s-media-cache-ak0.pinimg.com/736x/2b/89/7d/2b897d08997d99c9c9602d4164044783.jpg");
        contacto.setPhoneNumber("Disponible.");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("oswaldo");
        contacto.setImgProfile("https://pbs.twimg.com/profile_images/378800000305778238/852d2f76797dbe1da82095f988d38fbe_400x400.png");
        contacto.setPhoneNumber("Disponible");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Yaneth");
        contacto.setImgProfile("http://img.uefa.com/imgml/TP/players/9/2015/324x324/95803.jpg");
        contacto.setPhoneNumber("Hey There.! I am using Whatsapp.");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Amigos Universidad");
        contacto.setImgProfile("http://web.mit.edu/chosetec/www/origami/mensetmanus2/mitseal.jpg");
        contacto.setPhoneNumber("jajaja!!");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Mama Telcel");
        contacto.setImgProfile("http://web.mit.edu/chosetec/www/origami/mensetmanus2/mitseal.jpg");
        contacto.setPhoneNumber("Ocupado.");
        contacts.add(contacto);

        contacto = new Contact();
        contacto.setName("Trabajo");
        contacto.setImgProfile("http://s9.favim.com/mini/130829/black-and-white-emma-watson-face-hair-Favim.com-887088.jpg");
        contacto.setPhoneNumber("Disponible.");
        contacts.add(contacto);


        ListItems_adapter adapter = new ListItems_adapter(getActivity(), contacts);
        mRecyclerView.setAdapter(adapter);


        return v;
    }

}
