package com.pinhan.edu.src.domain;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class UserForPassWord implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotBlank(message = "工号不能为空")
    private String workId;
    @NotBlank(message = "密码不能为空")
    private String password;
    private int level;
    @NotBlank(message = "新密码不能为空")
    private String newPassWord;
}
