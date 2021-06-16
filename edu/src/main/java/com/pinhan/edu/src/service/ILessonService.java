package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Lesson;
import com.pinhan.edu.src.pojo.Staff;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-15
 */
public interface ILessonService extends IService<Lesson> {
    /**
     * 添加课程
     */
    int addLesson(Lesson lesson);
    /**
     * 查询课程
     */
    List<Lesson> getLession(String time,String teacherName,String grade,String course,String subject,String studentName);
    /**
     * 修改课表时间
     */
    int updateLesson(Lesson lesson);
    /**
     * 分页查询员工信息
     *
     * @param currentPage
     * @return
     */
    IPage<Lesson> getPage(Integer currentPage, Lesson lesson, Date startTime,Date endTime);
    /**
     * 考勤功能
     */
    int lessonCheck(Lesson lesson);
}
