package io.paketo.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/")
class HelloWorldController(
) {
    @GetMapping()
    fun helloWorld(): Mono<ResponseEntity<String?>> {
        return Mono.just(ResponseEntity.ok("Hello word!"))
    }
}