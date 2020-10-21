package com.example.passdatafragmentuseinteface;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentAbove extends Fragment {
    private sendData listener;
    Button btnFragAbove;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.
                fragment_above, container, false);
        btnFragAbove = view.findViewById(R.id.btnFragAbove);
        btnFragAbove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener = (sendData) getActivity();
                listener.send("This is data from Frag Above");
            }
        });

        return view ;
    }
}
