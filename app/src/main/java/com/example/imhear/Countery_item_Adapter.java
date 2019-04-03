package com.example.imhear;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Countery_item_Adapter extends ArrayAdapter<Countery_item> {

    public Countery_item_Adapter( Context context, ArrayList<Countery_item> CounteryList) {
        super(context, 0, CounteryList);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        return inflater(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position,  View convertView, ViewGroup parent) {
        return inflater(position, convertView, parent);
    }

    private View inflater (int position, View convertView, ViewGroup parent) {

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spiner_contact,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.imge_spiner);
        TextView  textView  = convertView.findViewById(R.id.Code_num);

        Countery_item countery_item = getItem(position);

       if (countery_item != null) {
           imageView.setImageResource(countery_item.getCountery_image());
           textView.setText(countery_item.getCountery_Number());
       }
        return convertView;
    }
}
