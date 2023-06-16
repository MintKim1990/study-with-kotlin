// 확장함수 : 특정 클래스에 메서드를 추가하는 기능
fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

fun main() {
    println("test".first())
    println("test".addFirst('c'))
}