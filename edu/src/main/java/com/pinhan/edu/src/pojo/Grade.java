package com.pinhan.edu.src.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

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

      @TableId("studentId")
      @NotBlank(message = "学号不能为空")
    private String studentId;

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
