package ru.kazantsev.nsmp.sdk.global_variables;

import ru.naumen.core.shared.dto.ISDtObject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Плейсхолдер переменных, внедряемых в методы REST API, вызываемых через модуль
 */
public class ControllerVariablesPlaceholder {

    /**
     * контекстная переменная user, облегченный объект
     * класса "Сотрудник" (employee) или null, в зависимости от того, как был вызван метод:
     */
    public static ISDtObject user;

    /**
     * Сырой объект запроса
     */
    public static HttpServletRequest request;

    /**
     * Сырой объект ответа
     */
    public static HttpServletResponse response;

}
