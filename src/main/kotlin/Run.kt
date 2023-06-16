class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    fun connect(): Boolean {
        println("Connect..")
        Thread.sleep(1000)
        println("Connect Success")
        return true
    }
}

fun main() {

    // run 스코프함수는 리턴값이 존재
    val connected = DatabaseClient().run {
        this.url = "localhost:3306"
        this.username = "mysql"
        this.password = "1234"
        this.connect() // 마지막에 작성된 코드가 리턴값으로 자동 지정
    }

    println(connected)

}