interface Payable {
    fun isPayable(): Boolean
}

enum class PaymentStatus(val label: String) : Payable {
    UNPAID("미지급") { override fun isPayable(): Boolean = true },
    PAID("지급완료") { override fun isPayable(): Boolean = false },
    FAILED("지급실패") { override fun isPayable(): Boolean = false },
    REFUNDED("환불") { override fun isPayable(): Boolean = false };
}

fun main() {

    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    if (paymentStatus == PaymentStatus.PAID) {
        println("결제 완료 상태")
    }

    for (status in PaymentStatus.values()) {
        println("[${status}](${status.label}) : ${status.ordinal}")
    }

}