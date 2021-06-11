package com.pinhan.edu.src.pojo;

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
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
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
