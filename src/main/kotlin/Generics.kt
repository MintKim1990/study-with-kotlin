
class MyGenerics<out T>(val t: T) {
    fun printMessage() = println(t)
}

class Bag<T> {

    fun saveAll(to: MutableList<in T>, from: MutableList<T>) {
        to.addAll(from)
    }
}

fun main() {

    // PECS(Producer - Extends, Consumer - Super)
    // 공변성은 자바 제너릭의 extends 코틀린에서는 out
    // 반공변성은 자바 제너릭의 super 코틀린에서는 in

    var charGenerics: MyGenerics<CharSequence> = MyGenerics("테스트")

    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1","2"), mutableListOf<String>("3","4"))


}