package com.gicproject.salamkioskapp.data.remote.dto

import com.gicproject.salamkioskapp.domain.model.ResultData
import com.google.gson.annotations.SerializedName

data class ResultDto(
    @SerializedName("x_status") var status: String? = null,
    @SerializedName("x_message") var message: String? = null,
){
    fun toResult(): ResultData {
        return ResultData(
            status = status,
            message = message,
        )
    }
}
