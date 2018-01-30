package com.github.backpacker

class WikipediaArticleBackpacker {
    fun toBytes(wikipediaArticle: WikipediaArticle): ByteArray? {
        val backpack = Backpack(
                string1 = wikipediaArticle.textInEnglish,
                string2 = wikipediaArticle.textInCatalan,
                integer1 = wikipediaArticle.views
        )
        return Backpacker().toBytes(backpack)
    }

    fun fromBytes(bytes: ByteArray): WikipediaArticle? {
        val backpack = Backpacker().fromBytes(bytes)
        return WikipediaArticle(
                backpack.string1!!,
                backpack.string2!!,
                backpack.integer1!!
        )
    }
}