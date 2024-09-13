package com.rabbiter.hotel.dto;

import com.rabbiter.hotel.domain.Type;

import java.util.Map;

/**
 * @author：rabbiter
 * @date：2022/01/01 13:52
 * Description：
 */
public class ReturnRoomDTO {

    private Integer id;
    private String number;
    private Integer maxPeople;
    private Map<String, String> introduces;
    private Type type;

    public ReturnRoomDTO() {
    }

    public ReturnRoomDTO(Integer id, String number, Integer maxPeople, Map<String, String> introduces, Type type) {
        this.id = id;
        this.number = number;
        this.maxPeople = maxPeople;
        this.introduces = introduces;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Map<String, String> getIntroduces() {
        return introduces;
    }

    public void setIntroduces(Map<String, String> introduces) {
        this.introduces = introduces;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ReturnRoomDTO{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", maxPeople=" + maxPeople +
                ", introduces=" + introduces +
                ", type=" + type +
                '}';
    }
}
