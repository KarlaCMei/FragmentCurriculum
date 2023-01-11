package com.example.fragmentcurriculum;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ObtenerDatosFragment extends Fragment {
    private TextView textName;


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
        return inflater.inflate(R.layout.fragment_obtener_datos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textName = view.findViewById(R.id.textView_nombre);
        /*if(getArguments()!= null && getArguments().containsKey("KEY")){
            Log.e("llave",getArguments().getString("KEY"));
        }*/

        if(getArguments()!= null && getArguments().containsKey(Constants.USER_NAME)){
            textName.setText(("Apellido " + getArguments().getString(Constants.USER_NAME)));
        }
    }
}