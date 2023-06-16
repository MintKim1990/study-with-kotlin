class HelloBot {

    // by lazy : 불변프로퍼티 지연로딩을 지원하는 키워드 (greeting 프로퍼티를 사용하는 시점에 lazy로 작성한 부분이 한번만 초기화 수행)
    // 멀티스레드 환경에서도 독립성 보장
    val greeting: String by lazy {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)

}

fun getHello() = "안녕하세요"

fun main() {

    val helloBot = HelloBot()

    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }

}