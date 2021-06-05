package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.TeacherMapper;
import com.pinhan.edu.src.pojo.Teacher;
import com.pinhan.edu.src.service.ITeacherService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Override
    public IPage<Teacher> getPage(Integer currentPage) {
        QueryWrapper wrapper = new QueryWrapper();
        Page<Teacher> page = new Page(currentPage,10,true);
        IPage<Teacher> ipage = baseMapper.selectPage(page,wrapper);
        return ipage;
    }
}