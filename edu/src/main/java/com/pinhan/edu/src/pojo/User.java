package com.pinhan.edu.src.pojo;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author liuyh
 * @since 2021-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotBlank(message = "工号不能为空")
    private String workId;
    @NotBlank(message = "密码不能为空")
    private String password;
    private int level;


}
