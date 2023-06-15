sealed class Develop {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDevelop(override val name: String) : Develop() {
    override fun code(language: String) {
        println("백엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

data class FrontendDevelop(override val name: String) : Develop() {
    override fun code(language: String) {
        println("프론트 개발자입니다. ${language}를 사용합니다.")
    }
}

object DevelopPool {

    val pool = mutableMapOf<String, Develop>();

    fun add(develop: Develop) = when(develop) {
        is BackendDevelop -> pool[develop.name] = develop
        is FrontendDevelop -> pool[develop.name] = develop
    }

    fun get(name: String) = pool[name]

}

fun main() {

    val backendDevelop = BackendDevelop(name = "토니")
    DevelopPool.add(backendDevelop)

    val frontendDevelop = FrontendDevelop(name = "카즈야")
    DevelopPool.add(frontendDevelop)

    println(DevelopPool.get("토니"))
    println(DevelopPool.get("카즈야"))

}