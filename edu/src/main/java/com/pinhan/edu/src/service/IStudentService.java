package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Student;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
public interface IStudentService extends IService<Student> {
    IPage<Student> getPage(Integer currentPage);
}
