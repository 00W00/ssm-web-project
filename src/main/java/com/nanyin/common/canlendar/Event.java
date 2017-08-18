package com.nanyin.common.canlendar;

/**
 * Created by NanYin on 2017-08-15 下午3:27.
 * 包名： com.nanyin.common.canlendar
 * 类描述：
 */
public class Event {
    private java.lang.String id;
    private java.lang.String title;
    private java.lang.String start;
    private java.lang.String end;
    private java.lang.String color;
    private java.lang.String allDay;
    private java.lang.String className;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllDay() {
        return allDay;
    }

    public void setAllDay(String allDay) {
        this.allDay = allDay;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}