package com.example.fragmentcurriculum;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragmentcurriculum.databinding.FragmentIngresarDatosBinding;


public class IngresarDatosFragment extends Fragment {
    private FragmentIngresarDatosBinding binding;
    private EditText editName;
    private Button btnResults;


    public IngresarDatosFragment() {
    }

    public static IngresarDatosFragment newInstance() {
        return new IngresarDatosFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
       // binding = DataBindingUtil.inflate(inflater,R.layout.fragment_ingresar_datos, container, false);
       return inflater.inflate(R.layout.fragment_ingresar_datos, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editName = view.findViewById(R.id.editText_especialidad);
        btnResults = view.findViewById(R.id.btn_guardar);

        Bundle bundle2 = new Bundle();
        bundle2.putString(Constants.USER_NAME,editName.getText().toString());
        //bundle.putString("KEY","KARLA");

        btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_ingresarDatosFragment_to_obtenerDatosFragment,bundle2);

            }
        });
    }

}