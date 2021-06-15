package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.StreamMapper;
import com.pinhan.edu.src.pojo.Stream;
import com.pinhan.edu.src.service.IStreamService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@Service
public class StreamServiceImpl extends ServiceImpl<StreamMapper, Stream> implements IStreamService {

    @Override
    public int addStream(Stream stream) {
        Stream s = new Stream();
        s.setAdviser(stream.getAdviser());
        s.setCourse(stream.getCourse());
        s.setGrade(stream.getGrade());
        s.setMoneyType(stream.getMoneyType());
        s.setName(stream.getName());
        s.setRemark(stream.getRemark());
        s.setTime(stream.getTime());
        s.setTotal(stream.getTotal());
        s.setType(stream.getType());
        s.setStreamId(stream.getStreamId());
        return baseMapper.insert(s);
    }

    @Override
    /**
     * 查询流水
     */
    public IPage<Stream> getPage(Integer currentPage) {
        QueryWrapper wrapper = new QueryWrapper();
        Page<Stream> page = new Page(currentPage, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }

    @Override
    public IPage<Stream> selectPage(String adviser,String course,String name, Date startTime,Date endTime){
        QueryWrapper wrapper = new QueryWrapper();
        if(adviser!= null && !adviser.equals("")){
            wrapper.eq("adviser",adviser);
        }
        wrapper.between("time",startTime,endTime);
        if(course!= null && !course.equals("")){
            wrapper.eq("course",course);
        }
        if(name!= null && !name.equals("")){
            wrapper.eq("name",name);
        }
        Page<Stream> page = new Page(1, 10, true);
        return baseMapper.selectPage(page, wrapper);
    }
}
