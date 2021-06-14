package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.StudentMapper;
import com.pinhan.edu.src.pojo.Student;
import com.pinhan.edu.src.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Override
    public IPage<Student> getPage(Integer currentPage) {
        QueryWrapper wrapper = new QueryWrapper();
        Page<Student> page = new Page(currentPage, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public int addStudent(Student student) {
        Student stu = new Student();
        stu.setAddress(student.getAddress());
        stu.setClassRank(student.getClassRank());
        stu.setGrade(student.getGrade());
        stu.setGradeRank(student.getGradeRank());
        stu.setName(student.getName());
        stu.setParentTel(student.getParentTel());
        stu.setSchool(student.getSchool());
        stu.setSex(student.getSex());
        stu.setSource(student.getSource());
        stu.setStudentId(student.getStudentId());
        return baseMapper.insert(stu);
    }

    @Override
    public int delStudent(String studentId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("studentId", studentId);
        return baseMapper.delete(queryWrapper);
    }

    @Override
    public int updateStudent(Student student) {
        return baseMapper.updateById(student);
    }

    @Override
    public IPage<Student> getByNameLike(String studentName) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("name", studentName);
        Page<Student> page = new Page(1, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }
}
