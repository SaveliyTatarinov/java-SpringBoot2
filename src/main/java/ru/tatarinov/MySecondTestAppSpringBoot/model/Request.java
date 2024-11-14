package ru.tatarinov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    /**
     * Уникальный идентификатор сообщения.
     * Обязательный. Максимум 32 символа.
     */
    @NotBlank(message = "Поле uid не заполнено")
    @Size(max = 32, message = "Максимальная длина uid не должна превышать 32 символа")
    private String uid;

    /**
     * Уникальный идентификатор операции.
     * Обязательный. Максимум 32 символа.
     */
    @NotBlank(message = "Поле operationUid не заполнено")
    @Size(max = 32, message = "максимальная длина operationUid не должна превышать 32 символа")
    private String operationUid;

    /**
     * Имя системы отправителя.
     * Необязательный параметр.
     */
    private String systemName;

    /**
     * Время создания сообщения.
     * Обязательный параметр.
     */
    @NotBlank(message = "Поле systemTime не заполнено")
    private String systemTime;

    /**
     * Наименование ресурса.
     * Необязательный параметр.
     */
    private String source;


    private Positions position;
    private Double salary;
    private Double bonus;
    private Integer workDays;

    /**
     * Уникальный идентификатор коммуникации.
     * Обязательный. Минимум 1, максимум 100000.
     */
    @Min(value = 1, message = "communicationId должно быть больше либо равно 1")
    @Max(value = 100000, message = "communicationId может быть меньше либо равно 100000")
    private int communicationId;

    /**
     * Уникальный идентификатор шаблона.
     * Необязательный параметр.
     */
    private int templateId;

    /**
     * Код продукта.
     * Необязательный параметр.
     */
    private int productCode;

    /**
     * Смс-код.
     * Необязательный параметр.
     */
    private int smsCode;

    /**
     * Время получения сообщения.
     * Параметр добавляется при обработке сообщения.
     */
    private Instant receivedTime;

    @Override
    public String toString(){
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", bonus='" + bonus + '\'' +
                ", workDays='" + workDays + '\'' +
                ", communicationId='" + communicationId +
                ", templateId='" + templateId +
                ", productCode='" + productCode +
                ", smsCode='" + smsCode +
                ", receivedTime='" + receivedTime +
                '}';
    }
}