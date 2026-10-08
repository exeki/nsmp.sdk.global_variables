package ru.kazantsev.nsmp.sdk.global_variables;

import ru.naumen.mailreader.server.processor.IMailProcessingResult;
import ru.naumen.mailreader.server.queue.IInboundMailMessage;

public class MailVariablesPlaceholder {
    /**
     * код подключения к серверу входящей почты, с которым связан обработчик почты.
     */
    public static String incomingServer;
    /**
     * позволяет получить или назначить результат обработки входящего сообщения.
     * Получение результата может быть полезно, например если письмо было отклонено еще до запуска скрипта.
     */
    public static IMailProcessingResult result;
    /**
     * содержит обрабатываемое почтовое сообщение.
     */
    public static IInboundMailMessage message;

}
