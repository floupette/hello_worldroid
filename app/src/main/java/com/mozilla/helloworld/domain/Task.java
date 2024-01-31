package com.mozilla.helloworld.domain;

import java.util.Date;

public class Task {
    public Task(
            Category category,
            Priority priority,
            String title
    ) {
        if ( category == null ) { this.category = Category.PERSONAL; } else { this.category = category; }
        this.date = new Date();
        if ( priority == null ) { this.priority = Priority.LOW; } else { this.priority = priority; }
        this.title = title;
    }
    private Category category;
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    private Date date;
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    private Date dateEnd;
    public Date getDateEnd() {
        return dateEnd;
    }
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
    private Date dateStart;
    public Date getDateStart() {
        return dateStart;
    }
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }
    private Boolean done = false;
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }
    private Priority priority;
    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
