package com.github.backpacker

import java.util.Date

class PersonBackpacker {
    fun toBytes(person: Person): ByteArray? {
        val backpack = Backpack(
                string1 = person.name,
                long1 = person.birthday.time,
                integer1 = person.fingers
        )
        return Backpacker().toBytes(backpack)
    }

    fun fromBytes(bytes: ByteArray): Person? {
        val backpack = Backpacker().fromBytes(bytes)
        if (backpack == null) {
            return null
        }
        return Person(
                name = backpack.string1!!,
                birthday = Date(backpack.long1!!),
                fingers = backpack.integer1!!
        )
    }
}