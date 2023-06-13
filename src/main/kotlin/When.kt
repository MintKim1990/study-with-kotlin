fun main() {

    // 자바 코드를 코틀린의 when식으로 변환한 코드
    val result = when (2) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        else -> "기타"
    }
    println(result)

    // when 식에서 else 생략 가능
    when (getColor()) {
        Color.RED -> print("red")
        Color.GREEN -> print("green")
    }

    // 여러개의 조건을 콤마로 구분해 한줄에서 정의가 가능
    when (getNumber()) {
        0, 1 -> print("0 || 1")
        else -> print("Not 0 || 1")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2