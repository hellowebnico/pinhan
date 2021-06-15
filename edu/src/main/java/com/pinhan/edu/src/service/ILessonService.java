package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Lesson;

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
    List<Lesson> getLession(Lesson lesson);
    /**
     * 修改课表时间
     */
    int updateLesson(Lesson lesson);
}
