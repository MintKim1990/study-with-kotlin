class LateInit {

    // lateinit : 가변프로퍼티 지연로딩을 지원하는 키워드
    lateinit var text: String

    fun printText() {
        if (!this::text.isInitialized) { // 초기화여부
            text = "안녕하세요"
        }
        println(text)
    }

}

fun main() {
    val lateInit = LateInit()
    lateInit.printText()
}