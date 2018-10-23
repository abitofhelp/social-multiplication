package microservices.book.multiplication.domain

class Multiplication(val left: Int=0, val right: Int=0) {
    val result: Int = left * right

    override fun toString() : String =
            "Multiplication of left '$left' time '$right' is '$result'"
}