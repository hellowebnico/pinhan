package com.pinhan.edu.src.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pinhan.edu.src.pojo.Staff;
import com.pinhan.edu.src.pojo.Stream;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author liuyh
 * @since 2021-06-06
 */
public interface IStreamService extends IService<Stream> {
    /**
     * 添加流水
     *
     * @param stream
     * @return
     */
    int addStream(Stream stream);
    IPage<Stream> getPage(Integer currentPage);
}
