package com.example.springboot.ToDoApp;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class ToDo {
    private long id;
    private String text;
    private boolean completed;

    public ToDo(long id, String text, boolean completed){
        this.id = id;
        this.text = text;
        this.completed = completed;
    }

}
