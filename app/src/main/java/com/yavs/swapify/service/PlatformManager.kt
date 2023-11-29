package com.yavs.swapify.service

import com.yavs.swapify.utils.Platform

class PlatformManager {
    companion object {
        private val deezerService = DeezerService()
        fun getService(platform: Platform): PlatformService{
            return when(platform){
                Platform.Deezer -> deezerService
            }
        }
    }


}