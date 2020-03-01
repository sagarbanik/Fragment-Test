package com.sagar.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    String message;
    TextView tvInFragmentB;
    Button btnTest;

    public FragmentB(String message) {
        this.message = message;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentB = inflater.inflate(R.layout.fragment_b,container,false);

        tvInFragmentB = fragmentB.findViewById(R.id.tvInFragmentB);
        tvInFragmentB.setText(message);

        btnTest = fragmentB.findViewById(R.id.btnTest);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),
                        "Hi there", Toast.LENGTH_SHORT).show();
            }
        });

        Bundle bundle = getArguments();
        int amount ;
        if (bundle != null){
            amount = bundle.getInt("AMOUNT_KEY");
            tvInFragmentB.setText(message + "\n" + amount);
        }





        return fragmentB;

    }
}
