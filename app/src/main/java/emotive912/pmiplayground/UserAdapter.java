package emotive912.pmiplayground;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class UserAdapter extends BaseAdapter {

    Context context;
    ArrayList<User> users;

    public UserAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        User user = (User) getItem(i);

        if (view == null ){
            view = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        }

        TextView tvName = (TextView)view.findViewById(R.id.textName);
        TextView tvSurname = (TextView)view.findViewById(R.id.textSurname);
        //ImageView imageView = (ImageView)view.findViewById(R.id.picture);

        tvName.setText(user.name);
        tvSurname.setText(user.surname);
        //imageView.setImageDrawable(user.image);
        return view;
    }
}
