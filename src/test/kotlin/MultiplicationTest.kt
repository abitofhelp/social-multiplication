import microservices.book.multiplication.domain.Multiplication
import org.junit.jupiter.api.Assertions.*

internal class MultiplicationTest {

    val left = 2
    val right = 4
    var mult = Multiplication()

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
        mult = Multiplication(left, right)
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @org.junit.jupiter.api.Test
    fun toStringTest() {
        val expected = "Multiplication of left '2' time '4' is '8'"
        assert(expected.equals(mult.toString()))
    }

    @org.junit.jupiter.api.Test
    fun getLeftTest() {
        val expected = left
        assert(expected.equals(mult.left))
    }

    @org.junit.jupiter.api.Test
    fun getRightTest() {
        val expected = right
        assert(expected.equals(mult.right))
    }

    @org.junit.jupiter.api.Test
    fun getResultTest() {
        val expected = left * right
        assert(expected.equals(mult.result))
    }
}