fun main() {

    // if..else
    var job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("비개발자")
    }

    // 코틀린의 if..else 리턴이 가능
    val age : Int = 10

    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    // 코틀린은 삼항 연산자가 없다. if..else로 처리가 가능하기때문
    val a = 1
    val b = 2
    var c = if (b > a) b else a

}