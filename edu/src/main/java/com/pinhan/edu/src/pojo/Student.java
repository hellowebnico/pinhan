package com.pinhan.edu.src.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    @TableField("studentId")
    private String studentId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年级
     */
    private String grade;

    /**
     * 学校
     */
    private String school;

    /**
     * 父母手机号
     */
    private String parentTel;

    /**
     * 家庭地址
     */
    private String address;

    /**
     * 来源
     */
    private String source;

    /**
     * 班级排名
     */
    private Integer classRank;

    /**
     * 级部排名
     */
    private Integer gradeRank;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentid) {
        this.studentId = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getParentTel() {
        return parentTel;
    }

    public void setParentTel(String parentTel) {
        this.parentTel = parentTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getClassRank() {
        return classRank;
    }

    public void setClassRank(Integer classRank) {
        this.classRank = classRank;
    }

    public Integer getGradeRank() {
        return gradeRank;
    }

    public void setGradeRank(Integer gradeRank) {
        this.gradeRank = gradeRank;
    }
}
