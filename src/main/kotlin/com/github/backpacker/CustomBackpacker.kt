package com.github.backpacker

abstract class CustomBackpacker<T> {

    abstract fun toBytes(item: T): ByteArray

    abstract fun fromBytes(bytes: ByteArray): T

    fun toBytesList(items: List<T>): ByteArray {
        return Backpacker().toBytesList(items.map { toBytes(it) })
    }

    fun fromBytesList(bytes: ByteArray): List<T?> {
        return Backpacker().fromBytesList(bytes).map { fromBytes(it) }
    }
}