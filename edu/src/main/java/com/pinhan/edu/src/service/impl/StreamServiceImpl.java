package com.pinhan.edu.src.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pinhan.edu.src.mapper.StreamMapper;
import com.pinhan.edu.src.pojo.Stream;
import com.pinhan.edu.src.service.IStreamService;
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
public class StreamServiceImpl extends ServiceImpl<StreamMapper, Stream> implements IStreamService {

    @Override
    public int addStream(Stream stream) {
        return baseMapper.insert(Stream.builder()
                .adviser(stream.getAdviser())
                .course(stream.getCourse()
                ).grade(stream.getGrade())
                .moneyType(stream.getMoneyType())
                .name(stream.getName())
                .remark(stream.getRemark())
                .time(stream.getTime())
                .total(stream.getTotal())
                .type(stream.getType())
                .build()

        );
    }
}
