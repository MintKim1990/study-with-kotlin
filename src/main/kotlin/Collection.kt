import java.util.LinkedList

@OptIn(ExperimentalStdlibApi::class)
fun main() {

    // immutable List (한번 초기화 이후에 값을 할당하거나 수정이 불가능)
    val immutableList = listOf("달러", "유로", "원")

    // mutable List
    val mutableList = mutableListOf("달러")
    mutableList.add("유로")
    mutableList.add("원")

    // immutable Set
    val immutableSet = setOf(1, 2, 3, 4)

    // mutable Set
    val mutableSet = mutableSetOf(1, 2)
    mutableSet.add(3)
    mutableSet.add(4)

    // immutable Map
    val immutableMap = mapOf("one" to 1, "two" to 2)

    // mutable Map
    val mutableMap = mutableMapOf<String, Int>()
    mutableMap["one"] = 1 // 코틀린에서는 값을 넣을경우 해당 문법을 사용하는것을 권장
    mutableMap.put("two", 2) // put도 가능


    // 컬렉션 빌더시 리턴 리스트는 immutable List로 리턴
    val immutableCollectionBuilderList = buildList{
        add(1)
        add(2)
        add(3)
    }

    // linkedList
    var linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    var arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    // 컬렉션 반복
    val iterator = immutableList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    for (currency in immutableList) {
        println(currency)
    }

    immutableList.forEach {
        println(it)
    }


    listOf("a", "b", "c")
        .map { it.uppercase() }
        .forEach { println(it) }

    listOf(1,2,3)
        .filter { number -> number > 1 }
        .forEach { println(it) }

}