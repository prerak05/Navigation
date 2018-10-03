package com.example.emxcel.navigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {
    private View view;
    private EditText etEmail, etName;
    private Button btnSubmit;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_account, container, false);
        etEmail = view.findViewById(R.id.etEmail);
        etName = view.findViewById(R.id.etName);
        btnSubmit = view.findViewById(R.id.btnSubmit);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nameArg", etName.getText().toString());
                bundle.putString("emailArg", etEmail.getText().toString());
                Navigation.findNavController(view).navigate(R.id.action_accountFragment_to_detatilFragment,bundle);
//                Navigation.createNavigateOnClickListener(R.id.detatilFragment, bundle);
            }
        });


    }
}
