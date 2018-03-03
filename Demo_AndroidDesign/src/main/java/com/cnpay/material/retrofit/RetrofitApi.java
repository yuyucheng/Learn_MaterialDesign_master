package com.cnpay.material.retrofit;

import com.cnpay.material.entity.ListCache;
import com.cnpay.material.entity.ListNet;
import com.cnpay.material.entity.ListRequest;
import com.cnpay.material.entity.LoginRequest;
import com.cnpay.material.entity.LoginResponse;
import com.cnpay.material.entity.RegisterRequest;
import com.cnpay.material.entity.RegisterResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Retrofit 接口
 *
 * @date: 2018/2/8 0008 下午 4:17
 * @author: yuyucheng
 */
public interface RetrofitApi {
    @GET
    Observable<LoginResponse> login(@Body LoginRequest request);
    @POST
    Observable<RegisterResponse> regist(@Body RegisterRequest request);

    @GET
    Observable<ListNet> getNetList(@Body ListRequest net);

    @GET
    Observable<ListCache> getCacheList(@Body ListRequest cache);
}
