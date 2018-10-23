package microservices.book.multiplication.service

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

import org.assertj.core.api.Assertions.assertThat
import org.mockito.BDDMockito.given

class MultiplicationServiceImplTest() {

    lateinit var multiplicationServiceImpl: IMultiplicationService

    @Mock
    private val randomGeneratorService: IRandomGeneratorService? = null

    @Before
    fun setUp() {
        // With this call to initMocks we tell Mockito to process the annotations
        MockitoAnnotations.initMocks(this)
        multiplicationServiceImpl = MultiplicationService(randomGeneratorService!!)
    }

    @Test
    fun createRandomMultiplicationTest() {
        // given (our mocked Random Generator service will return first 50, then 30)
        given(randomGeneratorService!!.generateRandomFactor()).willReturn(50, 30)

        // when
        val multiplication = multiplicationServiceImpl.createRandomMultiplication()

        // assert
        assertThat(multiplication.left).isEqualTo(50)
        assertThat(multiplication.right).isEqualTo(30)
        assertThat(multiplication.result).isEqualTo(1500)
    }
}