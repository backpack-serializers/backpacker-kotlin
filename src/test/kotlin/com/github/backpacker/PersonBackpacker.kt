package com.github.backpacker

import java.util.*

class PersonBackpacker : CustomBackpacker<Person>() {

    override fun toBytes(person: Person): ByteArray {
        val backpack = Backpack(
                string1 = person.name,
                long1 = person.birthday?.time,
                integer1 = person.fingers
        )
        return Backpacker().toBytes(backpack)
    }

    override fun fromBytes(bytes: ByteArray): Person {
        val backpack = Backpacker().fromBytes(bytes)
        return Person(
                name = backpack.string1!!,
                birthday = if (backpack.long1 != null) {
                    Date(backpack.long1!!)
                } else {
                    null
                },
                fingers = backpack.integer1!!
        )
    }
}