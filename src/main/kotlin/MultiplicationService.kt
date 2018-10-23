package microservices.book.multiplication.service

import microservices.book.multiplication.domain.Multiplication
import org.springframework.stereotype.Service

@Service
internal class MultiplicationService(val randomGeneratorService: IRandomGeneratorService) : IMultiplicationService {
    /**
     * Creates a Multiplication object with two randomly
     * generated values between 11 and 90.
     *
     * @return a Multiplication object with random values.
     */
    override fun createRandomMultiplication(): Multiplication {
        val factorA = randomGeneratorService.generateRandomFactor()
        val factorB = randomGeneratorService.generateRandomFactor()
        return Multiplication(factorA, factorB)
    }
}