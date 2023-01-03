package com.sinyee.babybus.worl.hytesds

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Dosiasodks {


    @GET("const.json")
    suspend fun szoxijcs(): Response<Awoospodkdso>

    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun fodospsdpspd(): Response<Xsowsodks>








}


@Keep
data class Awoospodkdso(
    @SerializedName("geo")
    val coxkf: String,
    @SerializedName("view")
    val nobivivbvhu: String,
    @SerializedName("appsChecker")
    val fiorokdos: String,
)

@Keep
data class Xsowsodks(
    @SerializedName("city")
    val gotkoof: String,
    @SerializedName("country")
    val coxkxocv: String,
    @SerializedName("countryCode")
    val pqosokdko: String,
)


