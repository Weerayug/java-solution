package com.darknamer.apidemo.services

import com.darknamer.apidemo.core.models.Message

class MessageService {
    fun all(): List<Message> {
        return listOf(
            Message("1", "Hello!"),
            Message("2", "Bonjour!"),
            Message("3", "Privet!"),
            Message("4", "Welcome!"),
            Message("5", "Halo!"),
            Message("6", "Bello!"),
        )
    }
}