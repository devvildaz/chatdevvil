package edu.devvildaz.chatdevvil.api.v1

import edu.devvildaz.chatdevvil.models.AppUser
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Controller
@RequestMapping("v1")
class UserController {
    @GetMapping(path = ["/numbers"],
        produces = [MediaType.APPLICATION_STREAM_JSON_VALUE])
    @ResponseBody
    fun getNumbers() = Flux.range(1, 3)
}