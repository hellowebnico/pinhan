package com.pinhan.edu.src.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Standard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;

    private String moneyType;

    private Integer total;

    private Integer classes;

    private Integer dayCost;


}
