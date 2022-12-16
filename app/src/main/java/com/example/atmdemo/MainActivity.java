package com.example.atmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView l;
    TextView totalAmount;
    EditText amountTxt;
    Button debitBtn;
    ArrayList<modal> entries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalAmount = findViewById(R.id.totalAmount);
        amountTxt = findViewById(R.id.amountTxt);
        debitBtn = findViewById(R.id.debitBtn);
        l = findViewById(R.id.list);
        listviewAdapter adapter = new listviewAdapter(MainActivity.this, entries);

        l.setAdapter(adapter);

        debitBtn.setOnClickListener(view -> {
            int amount = Integer.parseInt(amountTxt.getText().toString());
            int total = Integer.parseInt(totalAmount.getText().toString());
            if (amount % 100 == 0) {
                if (amount > total) {
                    amountTxt.setError("This Amount Is Not Available");
                    amountTxt.requestFocus();
                } else if (amount <= 0) {
                    amountTxt.setError("Enter Valid Amount");
                    amountTxt.requestFocus();
                } else {
                    totalAmount.setText(String.valueOf(total - amount));

                    int t = 0;
                    while (amount >= 2000) {
                        t++;
                        amount -= 2000;
                    }


                    int f = 0;
                    while (amount >= 500) {
                        f++;
                        amount -= 500;
                    }

                    int h = 0;
                    while (amount >= 100) {
                        h++;
                        amount -= 100;
                    }


                    Log.e("TAG", "onCreate: 2000:- " + t + " 500:- " + f + "100:- " + h);
                    entries.add(new modal(amountTxt.getText().toString(), "TwoThousandNote :" + t, "FiveHundred :" + f, "OneHundred :" + h));
                    adapter.notifyDataSetChanged();
                }
            } else {
                amountTxt.setError("Please Enter Valid Amount!");
                amountTxt.requestFocus();
            }
        });
    }
}