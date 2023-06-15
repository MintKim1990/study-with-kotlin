import java.time.LocalDateTime

class MyClass {

    private constructor()

    // 동반객체
    companion object {
        val a = 1234
        fun newInstance() = MyClass()
    }
}

// object 키워드 사용 시 singleton 보장
object DateTimeUtils {

    val now : LocalDateTime
        get() = LocalDateTime.now()

    // 자바 상수와 동일한 의미
    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime) : Boolean {
        return a == b
    }

}

fun main() {

    println(DateTimeUtils.now)

    println(DateTimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DateTimeUtils.same(now, now))

    println(MyClass.a)
    println(MyClass.newInstance())

}