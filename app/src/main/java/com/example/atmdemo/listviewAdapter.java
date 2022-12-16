package com.example.atmdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class listviewAdapter extends ArrayAdapter<modal> {

    // constructor for our list view adapter.
    public listviewAdapter(@NonNull Context context, ArrayList<modal> dataModalArrayList) {
        super(context, 0, dataModalArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // below line is use to inflate the
        // layout for our item of list view.
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.cutome_list_layout, parent, false);
        }

        // after inflating an item of listview item
        // we are getting data from array list inside
        // our modal class.
        modal modal = getItem(position);

        // initializing our UI components of list view item.
        TextView layout_amount = listitemView.findViewById(R.id.layout_amount);
        TextView listLayoutTwoThousand = listitemView.findViewById(R.id.listLayoutTwoThousand);
        TextView layoutListFiveHundred = listitemView.findViewById(R.id.layoutListFiveHundred);
        TextView layoutListOneHundred = listitemView.findViewById(R.id.layoutListOneHundred);


        layout_amount.setText(modal.widAmount);
        listLayoutTwoThousand.setText(modal.twoThousand);
        layoutListFiveHundred.setText(modal.fiveHundred);
        layoutListOneHundred.setText(modal.oneHundred);
        // below line is use to add item click listener
        // for our item of list view.
        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on the item click on our list view.
                // we are displaying a toast message.
                Toast.makeText(getContext(), "Item clicked is : " + modal.widAmount, Toast.LENGTH_SHORT).show();
            }
        });
        return listitemView;
    }
}
