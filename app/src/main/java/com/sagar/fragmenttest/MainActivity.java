package com.sagar.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    Button btn1,btn2,btn3;
    int amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentB fragmentB = new FragmentB("");

        Bundle bundle = new Bundle();
        bundle.getInt("AMOUNT_KEY",amount);
        fragmentB.setArguments(bundle);

        fragmentTransaction.add(R.id.fragmentContainer,fragmentB);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB fragmentB = new FragmentB("Message 1");

                Bundle bundle = new Bundle();
                bundle.putInt("AMOUNT_KEY",100);
                fragmentB.setArguments(bundle);

                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragmentB).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB fragmentB = new FragmentB("Message 2");

                Bundle bundle = new Bundle();
                bundle.putInt("AMOUNT_KEY",99999);
                fragmentB.setArguments(bundle);

                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragmentB).commit();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB fragmentB = new FragmentB("Message 3");

                Bundle bundle = new Bundle();
                bundle.putInt("AMOUNT_KEY",625810893);
                fragmentB.setArguments(bundle);

                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragmentB).commit();
            }
        });



    }
}
