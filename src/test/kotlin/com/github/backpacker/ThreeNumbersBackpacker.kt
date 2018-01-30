package com.github.backpacker

import java.util.Date

class ThreeNumbersBackpacker {
    fun toBytes(threeNumbers: ThreeNumbers): ByteArray? {
        val backpack = Backpack(
                integer1 = threeNumbers.numberOne,
                integer2 = threeNumbers.numberTwo,
                integer3 = threeNumbers.numberThree
        )
        return Backpacker().toBytes(backpack)
    }

    fun fromBytes(bytes: ByteArray): ThreeNumbers? {
        val backpack = Backpacker().fromBytes(bytes)
        if (backpack == null) {
            return null
        }
        return ThreeNumbers(
                backpack.integer1!!,
                backpack.integer2!!,
                backpack.integer3!!
        )
    }
}