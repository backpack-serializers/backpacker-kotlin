#!/bin/sh
echo "Removing old Kotlin file..."
rm -rf src/main/kotlin/com/github/backpacker/Backpack.kt

out=""
out=$out"\npackage com.github.backpacker"
out=$out"\n data class Backpack ("

positionsByType=20
position=1

incrementPosition(){
    position=`expr $position + 1`
}

createProtoRows(){
    echo "Creating rows of type $1..."
    for i in `seq 1 $positionsByType`
    do
        out=$out"\n val $2$i:$1=null,"
        incrementPosition
    done
}

positionsByType=40
createProtoRows String? string
positionsByType=20
createProtoRows Boolean? boolean
createProtoRows Double? double
createProtoRows Float? float
createProtoRows Int? integer
createProtoRows Long? long

out=$out"\n)"

echo $out >> src/main/kotlin/com/github/backpacker/Backpack.kt
echo "Proto file generated!"
