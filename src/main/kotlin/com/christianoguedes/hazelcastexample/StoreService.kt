package com.christianoguedes.hazelcastexample

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class StoreService {

    @Cacheable("items")
    fun getItemByName(itemName: String): String {
        // some long processing
        Thread.sleep(3000)
        println("new cache: $itemName")
        return "Sample Item: $itemName"
    }
}