package com.example.retrofit_lailafiqyrahayu_18.model

import com.google.gson.annotations.SerializedName

data class Province (
    @SerializedName("FID")
    val fid: Int,
    @SerializedName("Kode_Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus_Posi")
    val positive: Int,
    @SerializedName("Kasus_Semb")
    val recover: Int,
    @SerializedName("Kasus_Meni")
    val death: Int,
)
