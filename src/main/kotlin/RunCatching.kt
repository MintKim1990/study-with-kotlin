fun getStr(): Nothing = throw Exception("에러발생")

fun main() {

    val result = runCatching { // try
        getStr()
    }.getOrElse { // catch
        println(it.message)
        "리턴값"
    }

    println(result)

}