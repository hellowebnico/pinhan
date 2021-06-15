package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.Query;
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
 * 服务实现类
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
        Page<Staff> page = new Page(currentPage, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public int addStaff(Staff staff) {
        Staff s = new Staff();
        s.setAddress(staff.getAddress());
        s.setDepartment(staff.getDepartment());
        s.setLevel(staff.getLevel());
        s.setName(staff.getName());
        s.setSex(staff.getSex());
        s.setTel(staff.getTel());
        s.setWorkId(staff.getWorkId());
        s.setIdNumber(staff.getIdNumber());
        s.setBank(staff.getBank());
        s.setBankNumber(staff.getBankNumber());
        return baseMapper.insert(s);
    }

    @Override
    public int updateStaff(Staff staff) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("work_id",staff.getWorkId());
        return baseMapper.update(staff,wrapper);
    }

    @Override
    public int delStaff(String workId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("work_id",workId);
        return baseMapper.delete(wrapper);
    }

    @Override
    public IPage<Staff> getPageByName(String Staffname) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("name",Staffname);
        Page<Staff> page = new Page(1, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }
}
