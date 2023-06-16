
fun main() {

    val str = "안녕하세요"

    // with 스코프함수는 리턴값이 존재 (다만 확장함수가 아님)
    val length = with(str) {
        length // 마지막에 작성된 코드가 리턴값으로 자동 지정
    }
    println(length)

}