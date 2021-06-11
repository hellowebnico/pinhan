package com.pinhan.edu.src.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pinhan.edu.src.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
