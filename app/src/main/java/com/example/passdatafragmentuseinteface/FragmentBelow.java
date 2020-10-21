package com.example.passdatafragmentuseinteface;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentBelow extends Fragment {
    TextView tvDisplayBelow;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.
                inflate(R.layout.fragment_below, container, false);
        tvDisplayBelow = view.findViewById(R.id.tvDisplayFragBelow);

        return view ;
    }
    public void UpdateData(String text){
        tvDisplayBelow.setText(text);
    }
}
