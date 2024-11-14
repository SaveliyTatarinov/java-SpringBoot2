package ru.tatarinov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    /**
     * Уникальный идентификатор сообщения.
     * Обязательный параметр.
     */
    @NotNull
    private String uid;

    /**
     * Уникальный идентификатор операции.
     * Обязательный параметр.
     */
    @NotNull
    private String operationUid;

    /**
     * Имя системы отправителя.
     * Обязательный параметр, всегда "ERP".
     */
    @NotNull
    private String systemTime;

    /**
     * Код статуса обработки.
     * Возможные значения: "success", "failed".
     */
    @NotNull
    private Codes code;

    @NotNull
    private Double annualBonus;

    /**
     * Код ошибки, если обработка завершилась неуспешно.
     * Возможные значения: "UnsupportedCodeException", "ValidationException", "UnknownException".
     */
    @NotNull
    private ErrorCodes errorCode;

    /**
     * Сообщение об ошибке, если обработка завершилась неуспешно.
     * Возможные значения: "Не поддерживаемая ошибка", "Ошибка валидации", "Произошла непредвиденная ошибка".
     */
    @NotNull
    private ErrorMessages errorMessage;
}
