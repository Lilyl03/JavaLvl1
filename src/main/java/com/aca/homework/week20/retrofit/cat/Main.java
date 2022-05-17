package com.aca.homework.week20.retrofit.cat;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://catfact.ninja/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CatService service = retrofit.create(CatService.class);
        Response<CatFactsResponse> execute = service.getFact().execute();
        System.out.println(execute.body());

    }
}
