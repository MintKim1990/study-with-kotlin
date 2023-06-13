class Product(val name : String, val price : Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel {

    // 인터페이스에서 프로퍼티도 추가 가능
    var coin : Int

    val weight : String
    // 인터페이스에 경우 프로퍼티 초기화를 진핼할 수 없어 Getter, Setter 에서 백킹필드에 접근이 불가
    get() = "20KG"

    fun add(product : Product)

    // default 메서드로 상속시 오버라이딩 필수 제외
    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다.")
        }
    }

    // 상위 인터페이스 상속하여 오버라이딩이 가능
    override fun roll() {
        println("카트가 굴러갑니다.")
    }

    fun printId() = println("1234")
}

interface Order {

    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }

    fun printId() = println("4567")

}

// 코틀린은 다중 인터페이스 상속이 가능
class MyCart(override var coin: Int) : Cart, Order {

    override fun add(product: Product) {

        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name} 상품이 카트에 추가됐습니다.")

        // 상위 인터페이스에 add 메소드가 중첩될경우 super키워드에 <상위인터페이스>를 붙여 어느 메서드에 add인지 식별
        super<Order>.add(product)
    }

    // 상위 인터페이스에서 printId 메서드가 둘다 default 메서드로 구현되어있을경우 중첩되므로 코틀린에서는 오버라이딩을 강제화
    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }

}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감", price = 1000))
    cart.printId()
}