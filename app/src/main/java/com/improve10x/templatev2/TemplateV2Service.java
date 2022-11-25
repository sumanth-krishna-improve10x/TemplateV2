package com.improve10x.templatev2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TemplateV2Service {

    @GET("template")
    Call<List<TemplatesV2>> fetchData();

}
