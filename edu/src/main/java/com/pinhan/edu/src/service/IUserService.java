package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
public interface IUserService extends IService<User> {
 int login(String userName,String passWord);
 IPage<User> getPage(Integer currentPage);
 int resetPassWord(String userName,String passWord,String newPassWord);
}

