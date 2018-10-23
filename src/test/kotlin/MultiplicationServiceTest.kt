package microservices.book.multiplication.service

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.assertj.core.api.Assertions.assertThat
import org.mockito.BDDMockito.given

@RunWith(SpringRunner::class)
@SpringBootTest
class MultiplicationServiceTest() {
    lateinit private var multiplicationService: MultiplicationService

    @MockBean
    private val randomGeneratorService: IRandomGeneratorService? = null

    @Test
    fun createRandomMultiplicationTest() {
        // given (our mocked Random Generator service will return first 50, then 30)
        given(randomGeneratorService!!.generateRandomFactor()).willReturn(50, 30)

        // when
        multiplicationService = MultiplicationService(randomGeneratorService)
        val multiplication = multiplicationService.createRandomMultiplication()

        // assert
        assertThat(multiplication.left).isEqualTo(50)
        assertThat(multiplication.right).isEqualTo(30)
        assertThat(multiplication.result).isEqualTo(1500)
    }
}