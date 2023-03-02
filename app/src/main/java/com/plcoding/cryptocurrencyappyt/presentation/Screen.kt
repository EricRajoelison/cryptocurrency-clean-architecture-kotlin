package com.plcoding.cryptocurrencyappyt.presentation

/**
 * Created by Eric Rajoelison on 28/02/2023.
 */
sealed class Screen (val route: String){
    object CoinListScreen : Screen("coin_list_screen")
    object CoinDetailScreen : Screen ("coin_detail_screen")
}