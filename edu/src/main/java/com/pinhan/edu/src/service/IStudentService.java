package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Student;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
public interface IStudentService extends IService<Student> {
    /**
     * 分页查询用户
     *
     * @param currentPage
     * @return
     */
    IPage<Student> getPage(Integer currentPage);

    /**
     * 添加用户
     */
    int addStudent(Student student);
    /**
     * 删除用户
     */
}
