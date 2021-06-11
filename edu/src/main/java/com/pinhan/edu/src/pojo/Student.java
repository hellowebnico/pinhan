package com.pinhan.edu.src.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    @TableField("studentId")
    private String studentid;

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


}
