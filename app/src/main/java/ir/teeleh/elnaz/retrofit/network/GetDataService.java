package ir.teeleh.elnaz.retrofit.network;

import java.util.List;

import ir.teeleh.elnaz.retrofit.model.RetroPhoto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
