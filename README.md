# Backpacker for Kotlin
**Pack your data into a tiny backpack**

Backpacker is a convenient way to serialize data using Protobuffers. Read [the main page of the project](https://github.com/backpack-serializers/backpacker-core) to get fully introduced to Backpack. This readme is intended to explain how to use Backpack in Kotlin.

## Give me an example
If you want to serialize a `Person` like this:
```kotlin
data class Person(
        val name: String,
        val birthday: Date,
        val fingers: Int,
        val hands: Int)
```

You'll need to write a `PersonBackpacker` class that extends `CustomBackpacker` like this:
```kotlin
class PersonBackpacker : CustomBackpacker<Person>() {

    override fun toBytes(person: Person): ByteArray {
        val backpack = Backpack(
                string1 = person.name,
                long1 = person.birthday.time,
                integer1 = person.fingers,
                integer2 = person.hands
        )
        return Backpacker().toBytes(backpack)
    }

    override fun fromBytes(bytes: ByteArray): Person {
        val backpack = Backpacker().fromBytes(bytes)
        return Person(
                name = backpack.string1!!,
                birthday = Date(backpack.long1!!),
                fingers = backpack.integer1!!
                hands = backpack.integer2!!
        )
    }
}
```

And that's all. The `PersonBackpacker` will give you four methods:
- `toBytes(person)` that receives a person and returns a byte array
- `toBytesList(persons)` that receives a list of persons and returns a byte array
- `fromBytes(bytes)` that receives a byte array and returns a person
- `fromBytesList(bytes)`. that receives a byte array and returns a list of persons

## Download

* Grab via Gradle:
```groovy
repositories { jcenter() }
    
compile 'com.github.backpacker:backpacker:1.0.0'
```
* Grab via Maven:
```xml
<repository>
  <id>jcenter</id>
  <url>http://jcenter.bintray.com</url>
</repository>

<dependency>
    <groupId>com.github.backpacker</groupId>
    <artifactId>backpacker</artifactId>
    <version>1.0.0</version>
</dependency>
