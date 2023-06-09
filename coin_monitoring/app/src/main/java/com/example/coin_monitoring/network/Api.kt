package com.example.coin_monitoring.network

import com.example.coin_monitoring.network.model.CurrentPriceList
import com.example.coin_monitoring.network.model.RecentCoinPriceList
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    // public/ticker/ALL_KRW
    @GET("public/ticker/ALL_KRW")
    suspend fun getCurrentCoinList(): CurrentPriceList

    // https://apidocs.bithumb.com/reference
    // https://api.bithumb.com/public/transaction_history/BTC_KRW
    @GET("public/transaction_history/{coin}_KRW")
    suspend fun getRecentCoinPrice(@Path("coin") coin: String) : RecentCoinPriceList
}