// 기본적인 함수 선언 스타일
fun sum(a: Int, b: Int) : Int {
    return a + b
}

// 표현식 스타일
fun sum2(a: Int, b: Int) : Int = a + b

// 표현식 & 반환타입 생략 : 코틀린에서 자동추론
fun sum3(a: Int, b: Int) = a + b

// 바디가 있는 함수는 반환 타입을 제거하면 컴파일 오류
fun sum4(a: Int, b: Int) : Int {
    return a + b
}

// 반환타입이 없는 함수는 Unit을 반환한다.
fun printSum(a: Int, b: Int) : Unit {
    println("$a + $b = ${a + b}")
}

// 디폴트 파라미터
fun greeting(message: String = "Hello!!") {
    println(message)
}

fun main() {
    log(message = "인포 로그")
    // 네임드 아규먼트를 이용하여 파라미터 매핑
    log(level = "DEBUG", "인포 로그")
    // 정상적인 파라미터 전송
    log("DEBUG", "인포 로그")
    // 네임드 아규먼트 : 파라미터 이름을 매핑시켜서 순서가 반대로 되어도 제대로 파라미터 매핑이 가능
    log(message = "에러 로그", level = "ERROR")
}

fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}