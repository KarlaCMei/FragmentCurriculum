package com.example.fragmentcurriculum;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentcurriculum.databinding.FragmentIngresarDatosBinding;
import com.example.fragmentcurriculum.databinding.FragmentObtenerDatosBinding;

public class ObtenerDatosFragment extends Fragment {
    private FragmentObtenerDatosBinding binding;

    public ObtenerDatosFragment() {
    }

    public static ObtenerDatosFragment newInstance() {
        return new ObtenerDatosFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_obtener_datos, container, false);
        return binding.getRoot();    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*if(getArguments()!= null && getArguments().containsKey("KEY")){
            Log.e("llave",getArguments().getString("KEY"));
        }*/

        if(getArguments()!= null && getArguments().containsKey(Constants.USER_NAME)){
            binding.textViewNombre.setText(("NOMBRE:  " + getArguments().getString(Constants.USER_NAME)));
        }
    }
}