package edu.uph.m23si2.pertamaapp.api;

import java.util.List;

import retrofit2.Retrofit;

import edu.uph.m23si2.pertamaapp.model.Provinsi;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiResponse {
    private List<Provinsi> data;

    public List<Provinsi> getData(){
        return data;
    }

}
