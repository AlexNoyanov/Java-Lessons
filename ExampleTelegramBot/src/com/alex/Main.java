package com.alex;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("==== Telegram Bot App ==== ");





        ApiContextInitializer.init();                       // Инициализируем API
        TelegramBotsApi botapi = new TelegramBotsApi();

        /*
        TBot myBot = new TBot();
        myBot.init();                                        // Initialize the message menu

        try {
            //TBot myBot = new TBot();
            //myBot.init();
            botapi.registerBot(myBot);
            //botapi.registerBot(new TBot());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


         */
    }
}
