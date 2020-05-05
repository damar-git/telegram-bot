package com.damar.telegram;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.damar.telegram.constants.BotConstants.BOT_API_TOKEN;
import static com.damar.telegram.constants.BotConstants.BOT_USERNAME;


@Component
public class TicketMasterBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_API_TOKEN;
    }
}
