package com.github.backpacker

abstract class CustomBackpacker<T> {

    abstract fun toBytes(person: T): ByteArray

    abstract fun fromBytes(bytes: ByteArray): T?

    fun toBytesList(persons: List<T>): ByteArray {
        return Backpacker().toBytesList(persons.map { toBytes(it) })
    }

    fun fromBytesList(bytes: ByteArray): List<T?> {
        return Backpacker().fromBytesList(bytes).map { fromBytes(it) }
    }
}