package com.pinhan.edu.src.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pinhan.edu.src.pojo.Stream;
import com.pinhan.edu.src.pojo.User;
import com.pinhan.edu.src.service.IStreamService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/stream")
public class IStreamController {
    @Resource
    private IStreamService streamService;

    @PostMapping("/add")
    @ResponseBody
    public int addStream(@RequestBody @Validated Stream stream) {
        return streamService.addStream(stream);
    }

    @RequestMapping("/page")
    public IPage<Stream> getPage(@RequestParam("page") Integer currentPage) {
        return streamService.getPage(currentPage);
    }
}

