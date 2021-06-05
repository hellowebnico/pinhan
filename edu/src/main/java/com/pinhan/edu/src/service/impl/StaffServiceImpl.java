package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.StaffMapper;
import com.pinhan.edu.src.pojo.Staff;
import com.pinhan.edu.src.service.IStaffService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

    @Override
    public IPage<Staff> getPage(Integer currentPage) {
        QueryWrapper wrapper = new QueryWrapper();
        Page<Staff> page = new Page(currentPage,10,true);
        IPage<Staff> ipage = baseMapper.selectPage(page,wrapper);
        return ipage;
    }
}
