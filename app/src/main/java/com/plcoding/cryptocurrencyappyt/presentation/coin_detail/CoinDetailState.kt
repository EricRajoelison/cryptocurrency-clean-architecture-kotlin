package com.plcoding.cryptocurrencyappyt.presentation.coin_detail

import com.plcoding.cryptocurrencyappyt.domain.model.Coin
import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

/**
 * Created by Eric Rajoelison on 28/02/2023.
 */
data class CoinDetailState(
    val isLoading : Boolean = false ,
    val coin : CoinDetail? = null,
    val error : String = ""
)
