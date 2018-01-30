package com.github.backpacker

class ThreeNumbersBackpacker : CustomBackpacker<ThreeNumbers>() {

    override fun toBytes(threeNumbers: ThreeNumbers): ByteArray {
        val backpack = Backpack(
                integer1 = threeNumbers.numberOne,
                integer2 = threeNumbers.numberTwo,
                integer3 = threeNumbers.numberThree
        )
        return Backpacker().toBytes(backpack)
    }

    override fun fromBytes(bytes: ByteArray): ThreeNumbers {
        val backpack = Backpacker().fromBytes(bytes)

        return ThreeNumbers(
                backpack.integer1!!,
                backpack.integer2!!,
                backpack.integer3!!
        )
    }
}