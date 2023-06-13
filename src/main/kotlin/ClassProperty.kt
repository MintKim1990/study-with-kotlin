// 클래스 옆 파라미터는 생성자에 파라미터를 의미하며 constructor 키워드를 생략처리하여 표현가능
class Coffee(
    val name : String = "아메리카노", // val 변수는 Getter 메서드만 생성되어 외부에서 변경이 불가능
    var price : Int = 0,
    val brand : String,
    var iced : Boolean = false
    ) {

    val size : String get() {
        return "라지"
    } // 커스텀 Getter 생성 문법

    var quantity : Int = 0
    set(value) {
        if (value > 0) {
            // 코틀린에서는 Setter 메서드에서 값을 변경할때 field 라는 키워드를 지원하며 이를 백킹필드라하는데
            // 만약 quantity 변수에 직접 value를 호출하면 지속적으로 setter를 호출하여 StackOverflowError가 발생한다.
            field = value
        }
    }

}

// 본문이 없는 클래스도 생성 가능
class EmptyClass

fun main() {

    val coffee = Coffee(brand = "식빵")
    // 코틀린에서는 클래스에 자동으로 Getter, Setter가 할당되어 해당문구는 Setter를 이용하여 값 할당처리
    coffee.price = 1000
    coffee.quantity = 10
    coffee.iced = true

    // 자동 생성된 Getter를 이용하여 출력
    println("${coffee.name} 가격은 ${coffee.price} 사이즈는 ${coffee.size} 수량은 ${coffee.quantity}")

    // 자바 메서드처럼 해당 프로퍼티에 Getter를 호출하는게아니라 프로퍼티 값을 그대로 참조
    if (coffee.iced) {
        println("아이스 커피")
    }


}