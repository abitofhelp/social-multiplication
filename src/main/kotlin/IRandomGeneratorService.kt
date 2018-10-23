package microservices.book.multiplication.service

import microservices.book.multiplication.domain.Multiplication

interface IRandomGeneratorService {

    /**
     * Generate a random integer value between 11 and 99.
     *
     * @return a random integer
     */
    fun generateRandomFactor() : Int
}