package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.pinhan.edu.src.pojo.Stream;
import com.pinhan.edu.src.service.IStreamService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
@RestController
@RequestMapping("/stream")
public class IStreamController {
    @Resource
    private IStreamService streamService;
    @Resource
    private com.pinhan.edu.src.util.DateFormat dateFormat;

    @PostMapping("/add")
    @ResponseBody
    public int addStream(@RequestBody @Validated Stream stream) {
        return streamService.addStream(stream);
    }

    @RequestMapping("/page")
    public IPage<Stream> getPage(@RequestParam("page") Integer currentPage) {
        return streamService.getPage(currentPage);
    }

    @RequestMapping("/namePage")
    @ResponseBody
    public IPage<Stream> selectPage(@RequestParam("adviser") String adviser, @RequestParam("course") String course, @RequestParam("name") String name
            , @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime) {
        Date start = dateFormat.format(startTime);
        Date end = dateFormat.format(endTime);
        return streamService.selectPage(adviser, course, name, start, end);
    }


}


