package com.vivianafemenia.a08_retrofit.conexiones;

import com.vivianafemenia.a08_retrofit.constantes.Constantes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitObjet {
    public static Retrofit getConexion(){
        return new Retrofit.Builder().baseUrl(Constantes.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
