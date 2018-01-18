package com.example.pranay.databindingexample;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by kuliza-336 on 18/01/18.
 */

public interface ApiCalls {
    @GET("{user}")
    Observable<GitPojo> getUserDetails(@Path("user") String user);
}
