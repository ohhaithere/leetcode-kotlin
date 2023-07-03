package com.mrazi.leetcode

class SubstringWithConcatenationOfAllWords {

    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val charCount = words[0].length
        var left = 0
        var right = (words.size * charCount)
        val result = mutableListOf<Int>()

        while (right <= s.length) {
            val substringList = s.substring(left, right).chunked(charCount).toMutableList()
            if (allWordsIncluded(words, substringList)) result.add(left)
            left++
            right++
        }

        return result
    }

    private fun allWordsIncluded(words: Array<String>, substringList: MutableList<String>): Boolean {
        for (word in words) {
            if (!substringList.contains(word)) {
                return false
            } else {
                substringList.remove(word)
            }
        }
        return true
    }

}