package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Staff;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
public interface IStaffService extends IService<Staff> {
    /**
     * 分页查询员工信息
     *
     * @param currentPage
     * @return
     */
    IPage<Staff> getPage(Integer currentPage);

    /**
     * 添加员工信息
     */
    int addStaff(Staff staff);

    /**
     * 修改员工信息
     */
    int updateStaff(Staff staff);

    /**
     * 删除员工信息
     */
    int delStaff(String workId);

    /**
     * 根据姓名模糊查询员工信息
     */
    IPage<Staff> getPageByName(String name);
}
