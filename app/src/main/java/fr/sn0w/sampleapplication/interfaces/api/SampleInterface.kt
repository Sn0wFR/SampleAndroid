package fr.sn0w.sampleapplication.interfaces.api
import fr.sn0w.sampleapplication.models.api.SampleRequest
import fr.sn0w.sampleapplication.models.api.SampleResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

/**
 * Created by Sn0w on 29/07/2023.
 */
interface SampleInterface {
    @GET("/sample")
    fun getSample(@Header("Authorization") authorization: String): Call<SampleResponse>

    @POST("/sample")
    fun postSample(@Body body: SampleRequest): Call<Unit>
}