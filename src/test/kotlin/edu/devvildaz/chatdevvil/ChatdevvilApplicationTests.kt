package edu.devvildaz.chatdevvil

import edu.devvildaz.chatdevvil.models.AppUser
import org.junit.jupiter.api.Test
import org.junit.platform.commons.logging.Logger
import org.junit.platform.commons.logging.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono

@SpringBootTest
class ChatdevvilApplicationTests {
    companion object {
        @JvmStatic val LOGGER : Logger = LoggerFactory.getLogger(ChatdevvilApplicationTests.javaClass)
    }

    val client : WebClient = WebClient.builder().baseUrl("http://localhost:8080").build()

    @Test
    fun testHelloWorld() {
        client.get()
            .uri("/v1/numbers")
            .retrieve().bodyToFlux(AppUser::class.java).subscribe(System.out::println)
            /*.expectBody()
            .json("[1, 2, 3]")*/

    }
}
