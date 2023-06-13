import org.intellij.lang.annotations.Language

// 코틀린 클래스에 기본은 final 클래스로 상속이 불가능하며
// open 이라는 키워드를 붙이면 상속이 가능
open class Dog {
    // open 키워드를 붙어야 상속 클래스에서 오버라이딩 가능
    open var age : Int = 0

    // open 키워드를 붙어야 상속 클래스에서 오버라이딩 가능
    open fun bark() {
        println("멍멍")
    }
}

// 상속
// 하위 클래스에서 상위 클래스에 메서드나 프로퍼티를 오버라이딩하면 자동으로 오버라이딩 한 프로퍼티나 함수는 open 상태
open class Bulldog(
    // Bulldog 클래스 기본 생성자에서 오버라이딩
    override var age: Int = 0
) : Dog() {
    // override 키워드를 붙이면 자동으로 open 상태가 되므로
    // final 키워드를 붙일경우 Bulldog를 상속받는 하위클래스에서 오버라이딩 제한가능
    final override fun bark() {
        println("컹컹")
    }
}

class ChildBulldog : Bulldog() {
    override var age: Int = 0
}

// 추상클래스
abstract class Developer {

    // abstract 키워드를 붙여서 하위클래스에서 구현 강제
    abstract var age : Int
    // abstract 키워드를 붙여서 하위클래스에서 구현 강제
    abstract fun code(language: String)

}

class BackendDeveloper(override var age: Int) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }

}

fun main() {

    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")

}