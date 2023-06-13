fun main() {

    // Nullable 타입 키워드 : ?
    // Nullable 타입에 변수에 a.length같은 메서드 사용시 컴파일 에러 발생
    var a : String? = null

    // NPE 방지를 위해 ? 연산자를 사용해 Nullable 타입 변수일 경우 결과값이 null을 리턴
    print(a?.length)

    // 엘비스 연산자 : 좌변이 널인경우 우변을 리턴
    val b : Int = a?.length ?: 0

    // 단언 연산자(!!) : 해당 a라는 변수는 절대 Null일수 없다라고 선언하는 키워드
    var d = a!!.length

}