package com.pinhan.edu.src.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author liuyh
 * @since 2021-06-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

<<<<<<< Updated upstream
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getPhysical() {
        return physical;
    }

    public void setPhysical(Integer physical) {
        this.physical = physical;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getGeography() {
        return geography;
    }

    public void setGeography(Integer geography) {
        this.geography = geography;
    }

    public Integer getBiological() {
        return biological;
    }

    public void setBiological(Integer biological) {
        this.biological = biological;
    }

    public Integer getDaofa() {
        return daofa;
    }

    public void setDaofa(Integer daofa) {
        this.daofa = daofa;
    }

    public Integer getComputer() {
        return computer;
    }

    public void setComputer(Integer computer) {
        this.computer = computer;
    }

    @TableId("studentId")
      @NotBlank(message = "学号不能为空")
=======
    @TableId("studentId")
    @NotBlank(message = "学号不能为空")
>>>>>>> Stashed changes
    private String studentId;
    @NotBlank(message = "姓名不能为空")
    private String name;

    private Integer chinese;

    private Integer math;

    private Integer english;

    private Integer physical;

    private Integer chemistry;

    private Integer history;

    private Integer geography;

    private Integer biological;

    private Integer daofa;

    private Integer computer;


}
