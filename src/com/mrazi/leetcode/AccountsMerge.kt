package com.mrazi.leetcode

import java.util.ArrayList

import java.util.TreeSet

import java.util.HashMap


class UnionFind(size: Int) {

    private var size: Int

    private var numComponents: Int

    private var rank: IntArray
    private var parent: IntArray

    init {
        require(size >= 0) { "Size <= 0 is not allowed" }
        this.size = size
        this.numComponents = size

        rank = IntArray(size) { 1 }
        parent = IntArray(size) { ind -> ind }
    }

    fun find(vertex: Int): Int {
        var root = parent[vertex]

        while (root != parent[root]) {
            parent[root] = parent[parent[root]]
            root = parent[root]
        }

        return root
    }

    fun union(vertex1: Int, vertex2: Int) {
        val firstRoot = find(vertex1)
        val secondRoot = find(vertex2)

        if (firstRoot == secondRoot) return

        if (rank[firstRoot] > rank[secondRoot]) {
            parent[secondRoot] = firstRoot
            rank[firstRoot] += rank[secondRoot]
        } else {
            parent[firstRoot] = secondRoot
            rank[secondRoot] += rank[firstRoot]
        }
        this.numComponents--
    }


    fun isConnected(vertex1: Int, vertex2: Int): Boolean {
        return find(vertex1) == find(vertex2)
    }


    fun size(): Int {
        return size
    }

    fun components(): Int {
        return numComponents
    }
}



fun accountsMerge(accounts: List<List<String>>): List<List<String>> {

    val ownersMap = mutableMapOf<String,Int>()
    val unionFind = UnionFind(accounts.size)

    for(i in 0 until accounts.size){
        for(j in 1 until accounts[i].size){

            val mail = accounts[i][j]

            if(!ownersMap.contains(mail)){
                ownersMap.put(mail,i)
            }else{
                val previousAccount = ownersMap[mail]!!
                unionFind.union(previousAccount,i)
            }
        }
    }


    val groupsMap = mutableMapOf<Int,TreeSet<String>>()

    for(ind in 0 until accounts.size){

        val parent = unionFind.find(ind)

        groupsMap.putIfAbsent(parent,TreeSet<String>())

        groupsMap[parent]!!.addAll(accounts[ind].subList(1,accounts[ind].size))
    }


    val res = mutableListOf<List<String>>()

    groupsMap.forEach{ (key,value) ->

        val list = mutableListOf<String>()
        list.add(accounts[key][0])

        for(mail in value){
            list.add(mail)
        }

        res.add(list)

    }


    return res

}