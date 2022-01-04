package com.darknamer.apidemo.controllers.apis

import com.darknamer.apidemo.core.models.Message
import com.darknamer.apidemo.services.MessageService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/message")
class MessageController {

    @GetMapping("/all")
    fun index(): List<Message> {
        val svc = MessageService()
        return svc.all()
    }

    @GetMapping("/findByText")
    fun findByText(@RequestParam text: String): List<Message> {
        val svc = MessageService()
        val all = svc.all()
        return all
            .filter { x -> x.text.contains(text) }
            .toList()
    }
}