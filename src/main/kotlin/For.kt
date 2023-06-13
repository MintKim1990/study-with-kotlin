fun main() {

    println("범위연산자")
    // 범위 연산자 .. 를 사용해 for loop 돌리기기
    for (i in 0..3) {
        println(i)
    }

    println("until")
    // until 키워드 사용시 마지막 숫자는 포함하지 않는 for loop 가 실행
    for (i in 0 until 3) {
        println(i)
    }

    println("step")
    // step 키워드는 범위연산자 계산식을 표현하며 step 값만큼씩 증가
    for (i in 0..6 step 2) {
        println(i)
    }

    println("downTo")
    // downTo 키워드는 값을 감소시키며 for loop 실행
    for (i in 3 downTo 1) {
        println(i)
    }

    println("배열반복")
    // downTo 키워드는 값을 감소시키며 for loop 실행
    var numbers = arrayOf(1,2,3)
    for (i in numbers) {
        println(i)
    }

}