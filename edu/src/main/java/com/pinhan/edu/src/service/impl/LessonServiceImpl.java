package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.LessonMapper;
import com.pinhan.edu.src.pojo.Lesson;
import com.pinhan.edu.src.service.ILessonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-15
 */
@Service
public class LessonServiceImpl extends ServiceImpl<LessonMapper, Lesson> implements ILessonService {

    @Override
    public int addLesson(Lesson lesson) {
        Lesson l = new Lesson();
        l.setDate(lesson.getDate());
        l.setWeek(lesson.getWeek());
        l.setCoursename(lesson.getCoursename());
        l.setCoursetype(lesson.getCoursetype());
        l.setStart(lesson.getStart());
        l.setEnd(lesson.getEnd());
        l.setProjectid(lesson.getProjectid());
        l.setLesson(lesson.getLesson());
        l.setStudentname(lesson.getStudentname());
        l.setTeachername(lesson.getTeachername());
        l.setWorkid(lesson.getWorkid());
        return baseMapper.insert(l);
    }

    @Override
    public List<Lesson> getLession(Lesson lesson) {
        QueryWrapper wrapper = new QueryWrapper();
        if(lesson.getStudentname() != null && !lesson.getStudentname().equals("")){
            wrapper.eq("studentName",lesson.getStudentname());
        }
        if(lesson.getTeachername() != null && !lesson.getTeachername().equals("")){
            wrapper.eq("teacherName",lesson.getTeachername());
        }
        if(lesson.getGrade() != null && !lesson.getGrade().equals("")){
            wrapper.eq("grade",lesson.getGrade());
        }
        if(lesson.getCoursename() != null && !lesson.getCoursename().equals("")){
            wrapper.eq("courseName",lesson.getCoursename());
        }if(lesson.getCoursetype() != null && !lesson.getCoursetype().equals("")){
            wrapper.eq("courseType",lesson.getCoursetype());
        }if(lesson.getWeek() != null && !lesson.getWeek().equals("")){
            wrapper.eq("week",lesson.getWeek());
        }
        return baseMapper.selectList(wrapper);
    }

    @Override
    public int updateLesson(Lesson lesson) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("studentName",lesson.getStudentname());
        wrapper.eq("teacherName",lesson.getTeachername());
        wrapper.eq("classTeacher",lesson.getClassTeacher());
        return baseMapper.update(lesson,wrapper);
    }
}
