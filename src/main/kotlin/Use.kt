import java.io.FileWriter

fun main() {
    FileWriter("test.txt")
        .use { // try with 구문처럼 use 확장함수는 내부적으로 finally 구문에서 close를 자동처리
            it.write("Hello Kotlin")
        }
}