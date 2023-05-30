package com.koddev.instagramtest.FCM;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAtLXjLqo:APA91bGxOPq-M10cgOuQP0P_xy0_QTu81sz_nA-PZZdMoc4vHvygsVmSjKnGCqVBplrX_2pElzCgHGtITwMvamlzegaB6FhdfSg7g_f3LKYVo_xdDBQONKTbfTi-rqHYsaqx5OnWVgUG"  // FCM 서버 키
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}