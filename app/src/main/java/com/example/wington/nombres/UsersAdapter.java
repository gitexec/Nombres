package com.example.wington.nombres;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by wington on 10/30/16.
 */

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context context, List<User> users) {
        super(context, 0, users);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get the data Item
        User user = getItem(position);

        //Check if an existing view is being reused.
        //otherwise inflate the view
        View view = convertView;
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.user_item,null);
        }
        //Populate the data into the template view using the data object
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvHome = (TextView) view.findViewById(R.id.tvHometown);

        tvName.setText(user.getName());
        tvHome.setText(user.getHometown());

        return view;
    }
}
