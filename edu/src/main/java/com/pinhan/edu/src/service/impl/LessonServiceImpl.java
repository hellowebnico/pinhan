package com.pinhan.edu.src.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.LessonMapper;
import com.pinhan.edu.src.pojo.Lesson;
import com.pinhan.edu.src.service.ILessonService;
import com.pinhan.edu.src.util.DateFormat;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        l.setCourseName(lesson.getCourseName());
        l.setCourseType(lesson.getCourseType());
        l.setStart(lesson.getStart());
        l.setEnd(lesson.getEnd());
        l.setGrade(lesson.getGrade());
        l.setClassTeacher(lesson.getClassTeacher());
        l.setProjectid(lesson.getProjectid());
        l.setDuration(lesson.getDuration());
        l.setStudentName(lesson.getStudentName());
        l.setTeacherName(lesson.getTeacherName());
        l.setWorkId(lesson.getWorkId());
        l.setStudentCheck(0);
        l.setTeacherCheck(0);
        return baseMapper.insert(l);
    }


    @Override
    public List<Lesson> getLession(String time, String teacherName, String grade, String course, String subject,String studentName) {
        QueryWrapper wrapper = new QueryWrapper();
        if(teacherName != null && !teacherName.equals("")){
            wrapper.eq("teacherName",teacherName);
        }
        if(grade != null && !grade.equals("")){
            wrapper.eq("grade",grade);
        }
        if(course != null && !course.equals("")){
            wrapper.eq("course",course);
        }
        if(subject != null && !subject.equals("")){
            wrapper.eq("subject",subject);
        }
        if(studentName != null && !studentName.equals("")){
            wrapper.eq("studentName",studentName);
        }
        List list = DateFormat.getBetween(time);
        wrapper.between("date",list.get(0),list.get(1));

        return baseMapper.selectList(wrapper);
    }

    @Override
    public int updateLesson(Lesson lesson) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("studentName",lesson.getStudentName());
        wrapper.eq("teacherName",lesson.getTeacherName());
        wrapper.eq("classTeacher",lesson.getClassTeacher());
        return baseMapper.update(lesson,wrapper);
    }

    @Override
    public IPage<Lesson> getPage(Integer currentPage, Lesson lesson, Date startTime, Date endTime) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.between("date",startTime,endTime);
        if(lesson.getStudentName()!= null && !lesson.getStudentName().equals("")){
            wrapper.eq("studentName",lesson.getStudentName());
        }
        if(lesson.getTeacherName()!= null && !lesson.getTeacherName().equals("")){
            wrapper.eq("teacherName",lesson.getTeacherName());
        }
        if(lesson.getGrade()!= null && !lesson.getGrade().equals("")){
            wrapper.eq("grade",lesson.getGrade());
        }
        if(lesson.getCourseType()!= null && !lesson.getCourseType().equals("")){
            wrapper.eq("courseType",lesson.getCourseType());
        }
        if(lesson.getCourseName()!= null && !lesson.getCourseName().equals("")){
            wrapper.eq("courseName",lesson.getCourseName());
        }
        Page<Lesson> page = new Page(currentPage, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public int lessonCheck(Lesson lesson) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("studentName",lesson.getCourseName());
        wrapper.eq("teacherName",lesson.getCourseName());
        wrapper.eq("date",lesson.getDate());
        return baseMapper.update(lesson,wrapper);
    }
}
