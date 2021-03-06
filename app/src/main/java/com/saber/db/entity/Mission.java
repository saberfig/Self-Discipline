package com.saber.db.entity;

public class Mission {
    String id;
    String description;
    String type;
    String startTime;
    String endTime;
    String father;
    String score;
    String strikethrough;

    public Mission(String id,String description,String type,String startTime,String endTime,String father,String score,String strikethrough){
        this.id = id;
        this.description = description;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.father = father;
        this.score = score;
        this.strikethrough = strikethrough;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStrikethrough(){
        return strikethrough;
    }

    public void setStrikethrough(String strikethrough){
        this.strikethrough = strikethrough;
    }
}
