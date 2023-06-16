class User(val name: String, val password: String) {
    fun validate() {
        if (name.isNotBlank() && password.isNotBlank()) {
            println("검증 성공")
        } else {
            println("검증 실패")
        }
    }

    fun printName() = println(name)
}

fun main() {

    // also 스코프함수는 컨텍스트 객체(User) 자체를 다시 리턴
    val user: User = User(name = "mint", password = "1234").also {
        it.validate()
        it.printName()
    }
    println(user.password)

}