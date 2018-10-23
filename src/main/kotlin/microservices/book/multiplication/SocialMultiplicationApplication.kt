package microservices.book.multiplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SocialMultiplicationApplication

fun main(args: Array<String>) {
    runApplication<SocialMultiplicationApplication>(*args)
}
