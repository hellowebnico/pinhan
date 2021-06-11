package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Staff;
import com.pinhan.edu.src.pojo.Standard;
import com.pinhan.edu.src.service.IStaffService;
import com.pinhan.edu.src.service.IStandardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@RestController
@RequestMapping("/standard")
public class IStandardController {

    @Resource
    private IStandardService iStandardService;

    @RequestMapping("/page")
    public IPage<Standard> getPage(@RequestParam("page") Integer currentPage) {
        return iStandardService.getPage(currentPage);
    }
}

