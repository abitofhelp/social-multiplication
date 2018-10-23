package microservices.book.multiplication.service

import microservices.book.multiplication.domain.Multiplication
import org.springframework.context.annotation.Bean

interface IMultiplicationService {

    /**
     * Creates a Multiplication object with two randomly
     * generated values between 11 and 90.
     *
     * @return a Multiplication object with random values.
     */
    fun createRandomMultiplication() : Multiplication
}