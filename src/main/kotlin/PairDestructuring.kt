
fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun plus(triple: Triple<Int, Int, Int>) = triple.first + triple.second + triple.third

fun main() {

    println(plus(Pair(1,3)))
    println(plus(Triple(1,3,5)))

    // 구조분해할당 (우측 트리플을 분해하여 3개에 프로퍼티에 각각 할당)
    val (a, b, c) = Triple(1,3,5)
    println("$a, $b, $c")

    val (d, e, f) = Triple(7,8,9).toList()
    println("$d, $e, $f")

    val mutableMap = mutableMapOf("김민태" to "개발자") // to 문법은 내부적으로 Pair로 구현
    for ((key, value) in mutableMap) {
        println("${key}의 직업은 $value")
    }
}