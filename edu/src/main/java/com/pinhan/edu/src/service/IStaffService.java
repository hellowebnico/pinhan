package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Staff;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
public interface IStaffService extends IService<Staff> {
    IPage<Staff> getPage(Integer currentPage);
}
