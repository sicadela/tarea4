/*
 * Copyright (c) 2020
 * By Pablo Fernandez
 * ferning98@gmail.com
 */

package com.ferncuy.curso3semana4.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ferncuy.curso3semana4.R;
import com.ferncuy.curso3semana4.adapter.MascotaAdaptador;
import com.ferncuy.curso3semana4.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaMascotasFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public ListaMascotasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_lista_mascotas, container, false);

        listaMascotas = view.findViewById(R.id.recyclerFragmentListaMascotas);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(linearLayoutManager);

        inicializarListaMascotas();
        inicializarAdaptador();

        return view;
    }

    public void inicializarAdaptador() {

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perro1, "Paul"));
        mascotas.add(new Mascota(R.drawable.perro2, "Daisy"));
        mascotas.add(new Mascota(R.drawable.perro3, "Frodo"));
        mascotas.add(new Mascota(R.drawable.perro4, "Thor"));
        mascotas.add(new Mascota(R.drawable.perro5, "Maggy"));
    }

}
