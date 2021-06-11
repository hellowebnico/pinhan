package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.StandardMapper;
import com.pinhan.edu.src.pojo.Standard;
import com.pinhan.edu.src.pojo.Student;
import com.pinhan.edu.src.service.IStandardService;
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
public class StandardServiceImpl extends ServiceImpl<StandardMapper, Standard> implements IStandardService {

    @Override
    public IPage<Standard> getPage(Integer currentPage) {
        QueryWrapper wrapper = new QueryWrapper();
        Page<Standard> page = new Page(currentPage, 10, true);
        IPage<Standard> ipage = baseMapper.selectPage(page, wrapper);
        return ipage;
    }
}
