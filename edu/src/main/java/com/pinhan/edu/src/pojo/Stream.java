package com.pinhan.edu.src.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Stream implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;

    private String time;

    private String moneyType;

    private String name;

    private String grade;

    private String course;

    private Integer total;

    private String adviser;

    private String remark;


}
