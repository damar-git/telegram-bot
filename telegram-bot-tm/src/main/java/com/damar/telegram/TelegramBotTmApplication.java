package com.damar.telegram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class TelegramBotTmApplication {

	public static void main(String[] args) {

		ApiContextInitializer.init();

		SpringApplication.run(TelegramBotTmApplication.class, args);
	}

}
