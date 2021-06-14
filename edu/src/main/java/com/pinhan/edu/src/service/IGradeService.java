package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Grade;

import java.util.Date;

public interface IGradeService extends IService<Grade> {
    /**
     * 添加成绩信息
     * @param grade
     * @return
     */
    int addGrade(Grade grade);
    /**
     * 修改成绩信息
     */
    int updateGrade(Grade grade);
    /**
     * 查询成绩
     */
    Grade selectGrade(String studentId);

}
