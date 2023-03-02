package com.plcoding.cryptocurrencyappyt.domain.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Eric Rajoelison on 28/02/2023.
 */
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
