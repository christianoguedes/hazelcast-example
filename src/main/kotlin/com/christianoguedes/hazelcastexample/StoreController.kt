package com.christianoguedes.hazelcastexample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/store")
class StoreController(private val storeService: StoreService) {

    @GetMapping("/{itemName}")
    fun getItemByName(@PathVariable("itemName") itemName: String): String {
        println("get itemName: $itemName")
        return storeService.getItemByName(itemName)
    }
}

