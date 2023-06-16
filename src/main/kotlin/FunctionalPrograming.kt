val printMessage: (String) -> Unit = {
    message: String -> println(message)
}

val printMessage2: (String) -> Unit = {
        message -> println(message)
}

val printMessage3: (String) -> Unit = {
        println(it)
}

val plus: (Int, Int) -> Int = {
    a, b -> a + b
}

val func : () -> Unit = {
    println("Hello")
}

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

// 고차함수 (파라미터로 함수를 받거나 리턴으로 함수를 리턴하는 함수)
fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

// 익명함수
fun outerFunc() : () -> Unit {
    // 익명함수 리턴
    return fun() {
        println("익명함수 리턴")
    }
}

fun lamdaOuterFunc() : () -> Unit {
    // 람다 익명함수 리턴
    return { println("익명함수 리턴") }
}

fun lamdaOuterFunc2() : () -> Unit = { println("익명함수 리턴") }

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

val sum2 = { x: Int, y: Int -> x + y }

fun main() {

    // forEachStr 메서드는 마지막 파라미터로 func를 받는데 후행람다전달 문법으로 표현가능
    forEachStr(listOf("a", "b")) {
        message -> println(message)
    }

    // 람다래퍼런스
    val callReference = ::func
    callReference()()

    listOf("1", "2", "3").map(String::toInt).forEach(::println)

}