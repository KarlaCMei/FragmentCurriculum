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
       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_ingresar_datos, container, false);
       return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle2 = new Bundle();
        //bundle.putString("KEY","KARLA");

        binding.btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle2.putString(Constants.USER_NAME,binding.editTextNombre.getText().toString());
                Navigation.findNavController(v).navigate(R.id.action_ingresarDatosFragment_to_obtenerDatosFragment,bundle2);

            }
        });
    }

}