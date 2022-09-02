fun main() {
    val itemPrice = 1000.0
    val itemCount = 15
    val totalPrice: Double = itemPrice * itemCount
    println("Сумма заказа: $totalPrice")

    val minDiscount = 100
    val minDiscountStart = 1_000
    val maxDiscount = totalPrice * 0.05
    val maxDiscountStart = 10_000

    val areYouMeloman = true
    val melomanDiscount = totalPrice * 0.01

    val shoppingCart = if (totalPrice > maxDiscountStart) {
        totalPrice - maxDiscount
    } else if (totalPrice > minDiscountStart) {
        totalPrice - minDiscount
    } else {
        totalPrice
    }

    val result = if (areYouMeloman) shoppingCart - melomanDiscount else shoppingCart
    println("Сумма заказа с учетом скидок: $result")
}
