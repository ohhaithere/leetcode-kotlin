package com.mrazi.leetcode

class DesignAuthenticationManager(timeToLive: Int) {

    val timeToLive = timeToLive
    var map: HashMap<String, Int> = hashMapOf()

    fun generate(tokenId: String, currentTime: Int) {
        map.put(tokenId, currentTime)
    }

    fun renew(tokenId: String, currentTime: Int) {
        val token = map.get(tokenId)
        if(token != null) {
            if (token + timeToLive < currentTime) {
                map.put(tokenId, currentTime)
            }
        }
    }

    fun countUnexpiredTokens(currentTime: Int): Int {
        var count = 0
        map.keys.forEach({
            if (map.get(it)!! > currentTime) {
                count++
            }
        })
        return count
    }

}