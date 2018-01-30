package com.github.backpacker

import com.google.protobuf.ByteString

class Backpacker {

    fun toBytesList(backpacks: List<ByteArray>): ByteArray {
        val builder = BackpackMessageOuterClass.BackpackMessagesList.newBuilder()
        for (backpack in backpacks) {
            builder.addList(ByteString.copyFrom(backpack))
        }
        return builder.build().toByteArray()
    }

    fun fromBytesList(bytes: ByteArray): List<ByteArray?> {
        val parsedBackpackList = BackpackMessageOuterClass.BackpackMessagesList.parseFrom(bytes)
        return parsedBackpackList.listList.map { it.toByteArray() }
    }

    fun toBytes(backpack: Backpack): ByteArray {
        val builder = BackpackMessageOuterClass.BackpackMessage.newBuilder()
        if (backpack.string1 != null) {
            builder.string1 = backpack.string1
        }
        if (backpack.string2 != null) {
            builder.string2 = backpack.string2
        }
        if (backpack.string3 != null) {
            builder.string3 = backpack.string3
        }
        if (backpack.string4 != null) {
            builder.string4 = backpack.string4
        }
        if (backpack.string5 != null) {
            builder.string5 = backpack.string5
        }
        if (backpack.string6 != null) {
            builder.string6 = backpack.string6
        }
        if (backpack.string7 != null) {
            builder.string7 = backpack.string7
        }
        if (backpack.string8 != null) {
            builder.string8 = backpack.string8
        }
        if (backpack.string9 != null) {
            builder.string9 = backpack.string9
        }
        if (backpack.string10 != null) {
            builder.string10 = backpack.string10
        }
        if (backpack.string11 != null) {
            builder.string11 = backpack.string11
        }
        if (backpack.string12 != null) {
            builder.string12 = backpack.string12
        }
        if (backpack.string13 != null) {
            builder.string13 = backpack.string13
        }
        if (backpack.string14 != null) {
            builder.string14 = backpack.string14
        }
        if (backpack.string15 != null) {
            builder.string15 = backpack.string15
        }
        if (backpack.string16 != null) {
            builder.string16 = backpack.string16
        }
        if (backpack.string17 != null) {
            builder.string17 = backpack.string17
        }
        if (backpack.string18 != null) {
            builder.string18 = backpack.string18
        }
        if (backpack.string19 != null) {
            builder.string19 = backpack.string19
        }
        if (backpack.string20 != null) {
            builder.string20 = backpack.string20
        }
        if (backpack.string21 != null) {
            builder.string21 = backpack.string21
        }
        if (backpack.string22 != null) {
            builder.string22 = backpack.string22
        }
        if (backpack.string23 != null) {
            builder.string23 = backpack.string23
        }
        if (backpack.string24 != null) {
            builder.string24 = backpack.string24
        }
        if (backpack.string25 != null) {
            builder.string25 = backpack.string25
        }
        if (backpack.string26 != null) {
            builder.string26 = backpack.string26
        }
        if (backpack.string27 != null) {
            builder.string27 = backpack.string27
        }
        if (backpack.string28 != null) {
            builder.string28 = backpack.string28
        }
        if (backpack.string29 != null) {
            builder.string29 = backpack.string29
        }
        if (backpack.string30 != null) {
            builder.string30 = backpack.string30
        }
        if (backpack.string31 != null) {
            builder.string31 = backpack.string31
        }
        if (backpack.string32 != null) {
            builder.string32 = backpack.string32
        }
        if (backpack.string33 != null) {
            builder.string33 = backpack.string33
        }
        if (backpack.string34 != null) {
            builder.string34 = backpack.string34
        }
        if (backpack.string35 != null) {
            builder.string35 = backpack.string35
        }
        if (backpack.string36 != null) {
            builder.string36 = backpack.string36
        }
        if (backpack.string37 != null) {
            builder.string37 = backpack.string37
        }
        if (backpack.string38 != null) {
            builder.string38 = backpack.string38
        }
        if (backpack.string39 != null) {
            builder.string39 = backpack.string39
        }
        if (backpack.string40 != null) {
            builder.string40 = backpack.string40
        }
        if (backpack.boolean1 != null) {
            builder.boolean1 = backpack.boolean1
        }
        if (backpack.boolean2 != null) {
            builder.boolean2 = backpack.boolean2
        }
        if (backpack.boolean3 != null) {
            builder.boolean3 = backpack.boolean3
        }
        if (backpack.boolean4 != null) {
            builder.boolean4 = backpack.boolean4
        }
        if (backpack.boolean5 != null) {
            builder.boolean5 = backpack.boolean5
        }
        if (backpack.boolean6 != null) {
            builder.boolean6 = backpack.boolean6
        }
        if (backpack.boolean7 != null) {
            builder.boolean7 = backpack.boolean7
        }
        if (backpack.boolean8 != null) {
            builder.boolean8 = backpack.boolean8
        }
        if (backpack.boolean9 != null) {
            builder.boolean9 = backpack.boolean9
        }
        if (backpack.boolean10 != null) {
            builder.boolean10 = backpack.boolean10
        }
        if (backpack.boolean11 != null) {
            builder.boolean11 = backpack.boolean11
        }
        if (backpack.boolean12 != null) {
            builder.boolean12 = backpack.boolean12
        }
        if (backpack.boolean13 != null) {
            builder.boolean13 = backpack.boolean13
        }
        if (backpack.boolean14 != null) {
            builder.boolean14 = backpack.boolean14
        }
        if (backpack.boolean15 != null) {
            builder.boolean15 = backpack.boolean15
        }
        if (backpack.boolean16 != null) {
            builder.boolean16 = backpack.boolean16
        }
        if (backpack.boolean17 != null) {
            builder.boolean17 = backpack.boolean17
        }
        if (backpack.boolean18 != null) {
            builder.boolean18 = backpack.boolean18
        }
        if (backpack.boolean19 != null) {
            builder.boolean19 = backpack.boolean19
        }
        if (backpack.boolean20 != null) {
            builder.boolean20 = backpack.boolean20
        }
        if (backpack.double1 != null) {
            builder.double1 = backpack.double1
        }
        if (backpack.double2 != null) {
            builder.double2 = backpack.double2
        }
        if (backpack.double3 != null) {
            builder.double3 = backpack.double3
        }
        if (backpack.double4 != null) {
            builder.double4 = backpack.double4
        }
        if (backpack.double5 != null) {
            builder.double5 = backpack.double5
        }
        if (backpack.double6 != null) {
            builder.double6 = backpack.double6
        }
        if (backpack.double7 != null) {
            builder.double7 = backpack.double7
        }
        if (backpack.double8 != null) {
            builder.double8 = backpack.double8
        }
        if (backpack.double9 != null) {
            builder.double9 = backpack.double9
        }
        if (backpack.double10 != null) {
            builder.double10 = backpack.double10
        }
        if (backpack.double11 != null) {
            builder.double11 = backpack.double11
        }
        if (backpack.double12 != null) {
            builder.double12 = backpack.double12
        }
        if (backpack.double13 != null) {
            builder.double13 = backpack.double13
        }
        if (backpack.double14 != null) {
            builder.double14 = backpack.double14
        }
        if (backpack.double15 != null) {
            builder.double15 = backpack.double15
        }
        if (backpack.double16 != null) {
            builder.double16 = backpack.double16
        }
        if (backpack.double17 != null) {
            builder.double17 = backpack.double17
        }
        if (backpack.double18 != null) {
            builder.double18 = backpack.double18
        }
        if (backpack.double19 != null) {
            builder.double19 = backpack.double19
        }
        if (backpack.double20 != null) {
            builder.double20 = backpack.double20
        }
        if (backpack.float1 != null) {
            builder.float1 = backpack.float1
        }
        if (backpack.float2 != null) {
            builder.float2 = backpack.float2
        }
        if (backpack.float3 != null) {
            builder.float3 = backpack.float3
        }
        if (backpack.float4 != null) {
            builder.float4 = backpack.float4
        }
        if (backpack.float5 != null) {
            builder.float5 = backpack.float5
        }
        if (backpack.float6 != null) {
            builder.float6 = backpack.float6
        }
        if (backpack.float7 != null) {
            builder.float7 = backpack.float7
        }
        if (backpack.float8 != null) {
            builder.float8 = backpack.float8
        }
        if (backpack.float9 != null) {
            builder.float9 = backpack.float9
        }
        if (backpack.float10 != null) {
            builder.float10 = backpack.float10
        }
        if (backpack.float11 != null) {
            builder.float11 = backpack.float11
        }
        if (backpack.float12 != null) {
            builder.float12 = backpack.float12
        }
        if (backpack.float13 != null) {
            builder.float13 = backpack.float13
        }
        if (backpack.float14 != null) {
            builder.float14 = backpack.float14
        }
        if (backpack.float15 != null) {
            builder.float15 = backpack.float15
        }
        if (backpack.float16 != null) {
            builder.float16 = backpack.float16
        }
        if (backpack.float17 != null) {
            builder.float17 = backpack.float17
        }
        if (backpack.float18 != null) {
            builder.float18 = backpack.float18
        }
        if (backpack.float19 != null) {
            builder.float19 = backpack.float19
        }
        if (backpack.float20 != null) {
            builder.float20 = backpack.float20
        }
        if (backpack.integer1 != null) {
            builder.integer1 = backpack.integer1
        }
        if (backpack.integer2 != null) {
            builder.integer2 = backpack.integer2
        }
        if (backpack.integer3 != null) {
            builder.integer3 = backpack.integer3
        }
        if (backpack.integer4 != null) {
            builder.integer4 = backpack.integer4
        }
        if (backpack.integer5 != null) {
            builder.integer5 = backpack.integer5
        }
        if (backpack.integer6 != null) {
            builder.integer6 = backpack.integer6
        }
        if (backpack.integer7 != null) {
            builder.integer7 = backpack.integer7
        }
        if (backpack.integer8 != null) {
            builder.integer8 = backpack.integer8
        }
        if (backpack.integer9 != null) {
            builder.integer9 = backpack.integer9
        }
        if (backpack.integer10 != null) {
            builder.integer10 = backpack.integer10
        }
        if (backpack.integer11 != null) {
            builder.integer11 = backpack.integer11
        }
        if (backpack.integer12 != null) {
            builder.integer12 = backpack.integer12
        }
        if (backpack.integer13 != null) {
            builder.integer13 = backpack.integer13
        }
        if (backpack.integer14 != null) {
            builder.integer14 = backpack.integer14
        }
        if (backpack.integer15 != null) {
            builder.integer15 = backpack.integer15
        }
        if (backpack.integer16 != null) {
            builder.integer16 = backpack.integer16
        }
        if (backpack.integer17 != null) {
            builder.integer17 = backpack.integer17
        }
        if (backpack.integer18 != null) {
            builder.integer18 = backpack.integer18
        }
        if (backpack.integer19 != null) {
            builder.integer19 = backpack.integer19
        }
        if (backpack.integer20 != null) {
            builder.integer20 = backpack.integer20
        }
        if (backpack.long1 != null) {
            builder.long1 = backpack.long1
        }
        if (backpack.long2 != null) {
            builder.long2 = backpack.long2
        }
        if (backpack.long3 != null) {
            builder.long3 = backpack.long3
        }
        if (backpack.long4 != null) {
            builder.long4 = backpack.long4
        }
        if (backpack.long5 != null) {
            builder.long5 = backpack.long5
        }
        if (backpack.long6 != null) {
            builder.long6 = backpack.long6
        }
        if (backpack.long7 != null) {
            builder.long7 = backpack.long7
        }
        if (backpack.long8 != null) {
            builder.long8 = backpack.long8
        }
        if (backpack.long9 != null) {
            builder.long9 = backpack.long9
        }
        if (backpack.long10 != null) {
            builder.long10 = backpack.long10
        }
        if (backpack.long11 != null) {
            builder.long11 = backpack.long11
        }
        if (backpack.long12 != null) {
            builder.long12 = backpack.long12
        }
        if (backpack.long13 != null) {
            builder.long13 = backpack.long13
        }
        if (backpack.long14 != null) {
            builder.long14 = backpack.long14
        }
        if (backpack.long15 != null) {
            builder.long15 = backpack.long15
        }
        if (backpack.long16 != null) {
            builder.long16 = backpack.long16
        }
        if (backpack.long17 != null) {
            builder.long17 = backpack.long17
        }
        if (backpack.long18 != null) {
            builder.long18 = backpack.long18
        }
        if (backpack.long19 != null) {
            builder.long19 = backpack.long19
        }
        if (backpack.long20 != null) {
            builder.long20 = backpack.long20
        }
        return builder.build().toByteArray()
    }

    fun fromBytes(bytes: ByteArray): Backpack? {
        val parsedBackpack = BackpackMessageOuterClass.BackpackMessage.parseFrom(bytes)
        return Backpack(
                parsedBackpack.string1,
                parsedBackpack.string2,
                parsedBackpack.string3,
                parsedBackpack.string4,
                parsedBackpack.string5,
                parsedBackpack.string6,
                parsedBackpack.string7,
                parsedBackpack.string8,
                parsedBackpack.string9,
                parsedBackpack.string10,
                parsedBackpack.string11,
                parsedBackpack.string12,
                parsedBackpack.string13,
                parsedBackpack.string14,
                parsedBackpack.string15,
                parsedBackpack.string16,
                parsedBackpack.string17,
                parsedBackpack.string18,
                parsedBackpack.string19,
                parsedBackpack.string20,
                parsedBackpack.string21,
                parsedBackpack.string22,
                parsedBackpack.string23,
                parsedBackpack.string24,
                parsedBackpack.string25,
                parsedBackpack.string26,
                parsedBackpack.string27,
                parsedBackpack.string28,
                parsedBackpack.string29,
                parsedBackpack.string30,
                parsedBackpack.string31,
                parsedBackpack.string32,
                parsedBackpack.string33,
                parsedBackpack.string34,
                parsedBackpack.string35,
                parsedBackpack.string36,
                parsedBackpack.string37,
                parsedBackpack.string38,
                parsedBackpack.string39,
                parsedBackpack.string40,
                parsedBackpack.boolean1,
                parsedBackpack.boolean2,
                parsedBackpack.boolean3,
                parsedBackpack.boolean4,
                parsedBackpack.boolean5,
                parsedBackpack.boolean6,
                parsedBackpack.boolean7,
                parsedBackpack.boolean8,
                parsedBackpack.boolean9,
                parsedBackpack.boolean10,
                parsedBackpack.boolean11,
                parsedBackpack.boolean12,
                parsedBackpack.boolean13,
                parsedBackpack.boolean14,
                parsedBackpack.boolean15,
                parsedBackpack.boolean16,
                parsedBackpack.boolean17,
                parsedBackpack.boolean18,
                parsedBackpack.boolean19,
                parsedBackpack.boolean20,
                parsedBackpack.double1,
                parsedBackpack.double2,
                parsedBackpack.double3,
                parsedBackpack.double4,
                parsedBackpack.double5,
                parsedBackpack.double6,
                parsedBackpack.double7,
                parsedBackpack.double8,
                parsedBackpack.double9,
                parsedBackpack.double10,
                parsedBackpack.double11,
                parsedBackpack.double12,
                parsedBackpack.double13,
                parsedBackpack.double14,
                parsedBackpack.double15,
                parsedBackpack.double16,
                parsedBackpack.double17,
                parsedBackpack.double18,
                parsedBackpack.double19,
                parsedBackpack.double20,
                parsedBackpack.float1,
                parsedBackpack.float2,
                parsedBackpack.float3,
                parsedBackpack.float4,
                parsedBackpack.float5,
                parsedBackpack.float6,
                parsedBackpack.float7,
                parsedBackpack.float8,
                parsedBackpack.float9,
                parsedBackpack.float10,
                parsedBackpack.float11,
                parsedBackpack.float12,
                parsedBackpack.float13,
                parsedBackpack.float14,
                parsedBackpack.float15,
                parsedBackpack.float16,
                parsedBackpack.float17,
                parsedBackpack.float18,
                parsedBackpack.float19,
                parsedBackpack.float20,
                parsedBackpack.integer1,
                parsedBackpack.integer2,
                parsedBackpack.integer3,
                parsedBackpack.integer4,
                parsedBackpack.integer5,
                parsedBackpack.integer6,
                parsedBackpack.integer7,
                parsedBackpack.integer8,
                parsedBackpack.integer9,
                parsedBackpack.integer10,
                parsedBackpack.integer11,
                parsedBackpack.integer12,
                parsedBackpack.integer13,
                parsedBackpack.integer14,
                parsedBackpack.integer15,
                parsedBackpack.integer16,
                parsedBackpack.integer17,
                parsedBackpack.integer18,
                parsedBackpack.integer19,
                parsedBackpack.integer20,
                parsedBackpack.long1,
                parsedBackpack.long2,
                parsedBackpack.long3,
                parsedBackpack.long4,
                parsedBackpack.long5,
                parsedBackpack.long6,
                parsedBackpack.long7,
                parsedBackpack.long8,
                parsedBackpack.long9,
                parsedBackpack.long10,
                parsedBackpack.long11,
                parsedBackpack.long12,
                parsedBackpack.long13,
                parsedBackpack.long14,
                parsedBackpack.long15,
                parsedBackpack.long16,
                parsedBackpack.long17,
                parsedBackpack.long18,
                parsedBackpack.long19,
                parsedBackpack.long20
        )
    }
}
