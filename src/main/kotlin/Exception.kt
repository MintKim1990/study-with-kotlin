fun main() {

    // Java에서는 InterruptedException 예외처리를 try catch로 처리해줘야하는데
    // 코틀린에 경우 CheckedException에 예외처리를 강제하지 않는다.
    Thread.sleep(1)

    // 코틀린에서는 try catch가 표현식으로 값을 리턴할 수 있다.
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println(e)
    }
    println(a)

    var b : String? = null
    // 엘비스 연산자를 사용하여 c 값은 NonNull한 변수를 보장 (b가 널일경우 에러가 발생하기때문에)
    var c = b ?: failFast("Error")
    // 따라서 c?.length를 하지않아서 컴파일러에서 NonNull 변수라 인식하므로 c.length가 가능
    println(c.length)

}

// throw를 강제하는 메서드에서는 리턴타입이 Notthing이 자동설정된다.
fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}