fun main() {

    val str: String? = "안녕하세요"

    // let 스코프 함수는 리턴값이 존재
    val let: Int? = str?.let {
        println(it)
        it?.let { println(it) }
        1234 // 마지막에 작성된 코드가 리턴값으로 자동 지정
    }
    println(let)
}