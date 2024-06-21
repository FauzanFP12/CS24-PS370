package com.dicoding.asclepius.predict.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/dicoding/asclepius/predict/api/ApiService;", "", "predict", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "file", "Lokhttp3/MultipartBody$Part;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "/api/predict")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<okhttp3.ResponseBody> predict(@retrofit2.http.Part()
    @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file);
}