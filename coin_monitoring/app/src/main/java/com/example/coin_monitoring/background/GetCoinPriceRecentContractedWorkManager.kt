package com.example.coin_monitoring.background

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import timber.log.Timber

// 최근 거래된 코인 가격 내역을 가져오는 WorkManager

// 1. 관심있어하는 코인 리스트를 가져와서
// 2. 관심있는 코인 각각의 가격 변동 정보를 가져와서 ( New API )
// 3. DB에 저장
class GetCoinPriceRecentContractedWorkManager(val context: Context,workerParameters: WorkerParameters)
    :CoroutineWorker(context, workerParameters){
    override suspend fun doWork(): Result {
        Timber.d("doWork")
        return Result.success()
    }

}