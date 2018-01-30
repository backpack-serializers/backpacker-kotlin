#!/bin/sh
echo "Removing old Kotlin file..."
rm -rf src/main/kotlin/com/github/backpacker/Backpacker.kt

out=""
out=$out"\npackage com.github.backpacker"
out=$out"\n  class Backpacker {"
out=$out"\n    fun toBytes(backpack: Backpack): ByteArray {"
out=$out"\n      val builder = BackpackMessageOuterClass.BackpackMessage.newBuilder()"

positionsByType=10
position=1

incrementPosition(){
    position=`expr $position + 1`
}

createToBytesRows(){
    echo "Creating toBytes() rows of type $1..."
    for i in `seq 1 $positionsByType`
    do
        out=$out"\n   if(backpack.$2$i != null){"
        out=$out"\n     builder.$2$i = backpack.$2$i"
        out=$out"\n   }"
        incrementPosition
    done
}

createFromBytesRows(){
    echo "Creating fromBytes() rows of type $1..."
    for i in `seq 1 $positionsByType`
    do
        out=$out"\n   parsedBackpack.$2$i,"
        incrementPosition
    done
}

position = 1
positionsByType=40
createToBytesRows string string
positionsByType=20
createToBytesRows bool boolean
createToBytesRows double double
createToBytesRows float float
createToBytesRows int32 integer
createToBytesRows int64 long

out=$out"\n   return builder.build().toByteArray()}"
out=$out"\n   fun fromBytes(bytes: ByteArray): Backpack {"
out=$out"\n   val parsedBackpack = BackpackMessageOuterClass.BackpackMessage.parseFrom(bytes)"
out=$out"\n   return Backpack("

position=1
positionsByType=40
createFromBytesRows string string
positionsByType=20
createFromBytesRows bool boolean
createFromBytesRows double double
createFromBytesRows float float
createFromBytesRows int32 integer
createFromBytesRows int64 long


out=$out"\n)}}"

echo $out >> src/main/kotlin/com/github/backpacker/Backpacker.kt
echo "Proto file generated!"
