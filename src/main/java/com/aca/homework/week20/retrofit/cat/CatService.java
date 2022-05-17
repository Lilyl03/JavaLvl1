package com.aca.homework.week20.retrofit.cat;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CatService {
    @GET("fact")
    Call<CatFactsResponse> getFact();
}
