package com.pinhan.edu.src.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.context.support.MessageSourceSupport;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author liuyh
 * @since 2021-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Lesson implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("projectId")
    private String projectId;

    @TableField("teacherName")
    private String teacherName;

    @TableField("workId")
    private String workId;

    @TableField("courseType")
    private String courseType;

    @TableField("courseName")
    private String courseName;
    @NotNull(message = "日期不能为空")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;

    @TableField("studentName")
    private String studentName;

    private String start;

    private String end;

    private String week;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProjectid() {
        return projectId;
    }

    public void setProjectid(String projectid) {
        this.projectId = projectid;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String grade;
    private String classTeacher;

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public String getTeacherEdu() {
        return teacherEdu;
    }

    public void setTeacherEdu(String teacherEdu) {
        this.teacherEdu = teacherEdu;
    }

    public int getStudentCheck() {
        return studentCheck;
    }

    public void setStudentCheck(int studentCheck) {
        this.studentCheck = studentCheck;
    }

    public int getTeacherCheck() {
        return teacherCheck;
    }

    public void setTeacherCheck(int teacherCheck) {
        this.teacherCheck = teacherCheck;
    }

    private String teacherEdu;
    private int studentCheck;
    private int teacherCheck;
    private int duration;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
