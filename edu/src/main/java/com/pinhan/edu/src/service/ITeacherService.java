package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Teacher;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
public interface ITeacherService extends IService<Teacher> {
    /**
     * 分页查询教师信息
     *
     * @param currentPage
     * @return
     */
    IPage<Teacher> getPage(Integer currentPage);

    /**
     * 根据姓名查找教师
     */
    IPage<Teacher> getPageByName(String teacherName);

    /**
     * 删除教师
     */
    int delTeacher(String workId);

    /**
     * 修改教师信息
     */
    int updateTeacher(Teacher teacher);

    /**
     * 添加教师信息
     */
    int addTeacher(Teacher teacher);
}
