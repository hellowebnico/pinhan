package com.pinhan.edu.src.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p>
 * <p>
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

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private static final long serialVersionUID = 1L;
    @NotBlank(message = "工号不能为空")
    @JsonProperty(value = "work_id")
    private String workId;
    @NotBlank(message = "密码不能为空")
    private String password;
    private int level;


}
