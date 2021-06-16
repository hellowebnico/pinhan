package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.GradeMapper;
import com.pinhan.edu.src.pojo.Grade;
import com.pinhan.edu.src.service.IGradeService;
import org.springframework.stereotype.Service;


@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements IGradeService {
    @Override
    public int addGrade(Grade grade) {
        Grade g = new Grade();
        g.setBiological(grade.getBiological());
        g.setChemistry(grade.getChemistry());
        g.setChinese(grade.getChinese());
        g.setComputer(grade.getComputer());
        g.setDaofa(grade.getDaofa());
        g.setEnglish(grade.getEnglish());
        g.setGeography(grade.getGeography());
        g.setHistory(grade.getHistory());
        g.setMath(grade.getMath());
        g.setName(grade.getName());
        g.setPhysical(grade.getPhysical());
        g.setStudentId(grade.getStudentId());
        return baseMapper.insert(g);
    }

    @Override
    public int updateGrade(Grade grade) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("studentId",grade.getStudentId());
        return baseMapper.update(grade,wrapper);
    }

    @Override
    public Grade selectGrade(String studentId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("studentId",studentId);
        return baseMapper.selectOne(wrapper);
    }
}
