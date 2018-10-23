package microservices.book.multiplication.service

import org.junit.Before
import org.junit.Test
import java.util.stream.Collectors
import java.util.stream.IntStream
import microservices.book.multiplication.service.IRandomGeneratorService

import org.assertj.core.api.Assertions.assertThat
import kotlin.streams.toList

class RandomGeneratorServiceImplTest() {
    private val randomGeneratorService = RandomGeneratorService()

    @Test
    @Throws(Exception::class)
    fun generateRandomFactorIsBetweenExpectedLimits() {
        // when a good sample of randomly generated factors is generated
        val randomFactors = IntStream.range(0, 1000)
                .map { randomGeneratorService.generateRandomFactor() }
                .boxed()//.collect<List<Int>, Any>(Collectors.toList())

        // then all of them should be between 11 and 100
        // because we want a middle-complexity calculation
        assertThat(randomFactors).containsOnlyElementsOf(IntStream.range(11, 100).boxed().toList())
              //  .boxed().collect<List<Int>, Any>(Collectors.toList()))
    }

}