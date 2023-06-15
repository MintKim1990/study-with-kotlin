// data class 는 DTO 같은 data Object 키워드를 의미하며 기본적으로 equals, hashcode, tostring 등을 기본지원
data class Person(val name: String, val age: Int)

fun main() {

    val person = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)

    println(person == person2) // eqauls
    println(hashSetOf(person).contains(person2)) // hashcode
    println(person) // toString
    println(person.copy()) // copy
    println("이름=${person.name}, 나이=${person.age}") // getter
    println("이름=${person.component1()}, 나이=${person.component2()}")


}