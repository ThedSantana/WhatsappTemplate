package code.oswaldogh89.whatsapptemplate.adapters;


import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import code.oswaldogh89.whatsapptemplate.R;
import code.oswaldogh89.whatsapptemplate.objects.Contact;
import de.hdodenhof.circleimageview.CircleImageView;

public class ListItems_adapter extends RecyclerView.Adapter<ListItems_adapter.CustomViewHolder> {
    private final ArrayList<Contact> obj;
    Activity act;

    public ListItems_adapter(Activity contactList_act, ArrayList<Contact> alContacts) {
        this.obj = alContacts;
        this.act = contactList_act;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, null);

        return new CustomViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CustomViewHolder view, final int i) {

        Contact c = obj.get(i);

        Glide.with(act).load(c.getImgProfile()).into(view.imgProfile);
        view.txtName.setText(c.getName());
        view.txtPhone.setText(c.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return (null != obj ? obj.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        final TextView txtName;
        final CircleImageView imgProfile;
        final TextView txtPhone;

        public CustomViewHolder(View view) {
            super(view);
            this.imgProfile = (CircleImageView) view.findViewById(R.id.imgProfile);
            this.txtName = (TextView) view.findViewById(R.id.txtName);
            this.txtPhone = (TextView) view.findViewById(R.id.txtPhone);
        }

    }
}