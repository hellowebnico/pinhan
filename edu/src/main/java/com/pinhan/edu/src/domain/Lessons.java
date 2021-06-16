package com.pinhan.edu.src.domain;

import com.pinhan.edu.src.pojo.Lesson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author ARK
 * @create 2021-06-16 15:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lessons implements Serializable {
    private static final long serialVersionUID = 1L;
    private String week;
    private String date;
    List<Lesson> courses;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Lesson> getCourses() {
        return courses;
    }

    public void setCourses(List<Lesson> courses) {
        this.courses = courses;
    }
}
