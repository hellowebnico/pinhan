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
        IPage<Student> ipage = baseMapper.selectPage(page, wrapper);
        return ipage;
    }

    @Override
    public int addStudent(Student student) {
        return baseMapper.insert(Student.builder().
                address(student.getAddress())
                .classRank(student.getClassRank())
                .grade(student.getGrade())
                .gradeRank(student.getGradeRank())
                .school(student.getSchool())
                .name(student.getName())
                .parentTel(student.getParentTel())
                .source(student.getSource())
                .sex(student.getSex())
                .studentid(null)
                .build());
    }
}
