package com.plcoding.cryptocurrencyappyt.domain.model

import com.plcoding.cryptocurrencyappyt.data.remote.dto.TeamMember

/**
 * Created by Eric Rajoelison on 28/02/2023.
 */
data class CoinDetail (
    val coinId : String ,
    val name :String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags : List<String>,
    val team : List<TeamMember>
    )