package edu.devvildaz.chatdevvil

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatdevvilApplication{
	companion object {
		fun main(args: Array<String>) {
			runApplication<ChatdevvilApplication>(*args)
		}
	}
}
