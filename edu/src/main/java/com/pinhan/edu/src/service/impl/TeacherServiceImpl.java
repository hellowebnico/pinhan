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
 * 服务实现类
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
        Page<Teacher> page = new Page(currentPage, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public IPage<Teacher> getPageByName(String teacherName) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("name", teacherName);
        Page<Teacher> page = new Page(1, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public int delTeacher(String workId) {
        return baseMapper.deleteById(workId);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return baseMapper.updateById(teacher);
    }

    @Override
    public int addTeacher(Teacher teacher) {
        Teacher t = new Teacher();
        t.setAddress(teacher.getAddress());
        t.setCourse(teacher.getCourse());
        t.setEducation(teacher.getEducation());
        t.setExp(teacher.getExp());
        t.setName(teacher.getName());
        t.setSex(teacher.getSex());
        t.setTel(teacher.getTel());
        t.setWorkId(teacher.getWorkId());
        return baseMapper.insert(t);
    }
}
