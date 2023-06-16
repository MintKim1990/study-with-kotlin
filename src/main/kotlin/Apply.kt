fun main() {

    // apply 스코프함수는 컨텍스트 객체(DatabaseClient) 자체를 다시 리턴
    val databaseClient: DatabaseClient = DatabaseClient().apply {
        this.url = "localhost:3306"
        this.username = "mysql"
        this.password = "1234"
    }

    println(databaseClient.connect())

}