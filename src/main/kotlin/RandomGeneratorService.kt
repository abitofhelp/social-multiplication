package microservices.book.multiplication.service

import org.springframework.stereotype.Service
import java.util.Random

@Service
internal class RandomGeneratorService : IRandomGeneratorService {
    /**
     * Generate a random integer value between 11 and 99.
     *
     * @return a random integer
     */
    override fun generateRandomFactor(): Int {
        return Random().nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR + 1) + MINIMUM_FACTOR
    }

    companion object {

        val MINIMUM_FACTOR = 11
        val MAXIMUM_FACTOR = 99
    }
}