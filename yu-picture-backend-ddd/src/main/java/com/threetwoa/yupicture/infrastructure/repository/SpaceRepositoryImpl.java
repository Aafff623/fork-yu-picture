package com.threetwoa.yupicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.threetwoa.yupicture.domain.space.entity.Space;
import com.threetwoa.yupicture.domain.space.repository.SpaceRepository;
import com.threetwoa.yupicture.infrastructure.mapper.SpaceMapper;
import org.springframework.stereotype.Service;

/**
 * 空间仓储实现
 */
@Service
public class SpaceRepositoryImpl extends ServiceImpl<SpaceMapper, Space> implements SpaceRepository {
}