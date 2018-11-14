package in.smartresidesolutions.adminapp;

import in.smartresidesolutions.adminapp.model.LoginBean;
import retrofit2.Call;
import retrofit2.http.GET;

interface LoginApiInterface {

    /*@GET("/api/unknown")
    Call<LoginBean> doGetListResources();*/

    @GET("/Services/examples/login.json")
    Call<LoginBean> getUser();

    /*@GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);*/
}

