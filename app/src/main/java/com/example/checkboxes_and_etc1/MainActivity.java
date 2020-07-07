package com.example.checkboxes_and_etc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ch0, ch1, ch2, ch3, ch4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding CheckBox by its unique ID
        ch0=(CheckBox)findViewById(R.id.choco_syrup);
        ch1=(CheckBox)findViewById(R.id.sprinkles);
        ch2=(CheckBox)findViewById(R.id.crushed_nuts);
        ch3=(CheckBox)findViewById(R.id.cherries);
        ch4=(CheckBox)findViewById(R.id.orio);
    }

    public void showToast(View view) {
        String msg="";

        if (ch0.isChecked())
            // Chocolate syrup
            msg += "Chocolate syrup ";
            //or msg = msg + "Chocolate syrup ";

        if (ch1.isChecked())
            // Sprinkles
            msg += "Sprinkles ";

        if (ch2.isChecked())
            // Crushed nuts
            msg += "Crushed nuts ";

        if (ch3.isChecked())
            // Cherries
            msg += "Cherries ";

        if (ch4.isChecked())
            // Orio cookie crumbles
            msg += "Orio cookie crumbles ";

        Toast.makeText(this, "Toppings: " + msg,
                Toast.LENGTH_SHORT).show();

    }
}