package com.example.emxcel.navigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetatilFragment extends Fragment {

    private View view;
    private TextView tvName, tvEmail;

    public DetatilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detatil, container, false);
        tvEmail = view.findViewById(R.id.tvEmail);
        tvName = view.findViewById(R.id.tvName);
        Bundle bundle = getArguments();
        if (bundle != null) {
            tvName.setText(bundle.getString("nameArg"));
            tvEmail.setText(bundle.getString("emailArg"));
        }
        return view;
    }

}
