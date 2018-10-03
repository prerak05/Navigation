package com.example.emxcel.navigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private View view;
    private Button btnAccount, btnSetting;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);

        btnAccount = view.findViewById(R.id.btnAccount);
        btnSetting = view.findViewById(R.id.btnSettings);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnAccount.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.accountFragment));
        btnSetting.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.settingFragment));
    }
}
