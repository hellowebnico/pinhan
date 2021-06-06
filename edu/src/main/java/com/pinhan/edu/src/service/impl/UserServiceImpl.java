package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.UserMapper;
import com.pinhan.edu.src.pojo.User;
import com.pinhan.edu.src.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public int login(String workId, String passWord) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("work_id",workId);
        wrapper.eq("password",passWord);
        User user = baseMapper.selectOne(wrapper);
        if(user != null && user.getPassword().equals(passWord) && user.getWorkId().equals(workId)){
            return user.getLevel();
        }else{
            return -1;
        }
    }

    @Override
    /**
     * 查询所有用户
     */
    public IPage<User> getPage(Integer currentPage) {
        System.out.println("页码：" + currentPage);
        QueryWrapper wrapper = new QueryWrapper();
        Page<User> page = new Page(currentPage,10,true);
        IPage<User> ipage = baseMapper.selectPage(page,wrapper);
        return ipage;
    }

    @Override
    /**
     * 修改密码
     */
    public int resetPassWord(String userName,String newPassWord) {
     UpdateWrapper wrapper = new UpdateWrapper();
     wrapper.eq("work_id",userName);
      User user = new User();
      user.setPassword(newPassWord);
      int rows = baseMapper.update(user,wrapper);
      return rows;
    }

}
