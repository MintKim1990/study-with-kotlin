
var x = 5 // 탑레벨 변수

fun main() {

    val a : Int = 1

    val b = 1 // 컴파일 에러 나지않는 이유 : 타입 Int형 자동추론

    val c : Int // 지연할당도 가능 타입을 기재하지 않으면 컴파일 에러 발생
    c = 3

    /*
        코틀린 변수 타입 : val, var
        val : 값 초기화 이후 재할당 불가능
        var : 가변변수를 의미하며 값 재할당 가능
     */

}