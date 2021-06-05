package com.pinhan.edu.src.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

      private String workId;

    private String name;

    private String sex;

    private String department;

    private String level;

    private String tel;

    private String address;


}
