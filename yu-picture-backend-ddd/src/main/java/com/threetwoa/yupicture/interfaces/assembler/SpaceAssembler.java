package com.threetwoa.yupicture.interfaces.assembler;

import com.threetwoa.yupicture.domain.space.entity.Space;
import com.threetwoa.yupicture.interfaces.dto.space.SpaceAddRequest;
import com.threetwoa.yupicture.interfaces.dto.space.SpaceEditRequest;
import com.threetwoa.yupicture.interfaces.dto.space.SpaceUpdateRequest;
import org.springframework.beans.BeanUtils;

/**
 * 空间对象转换
 */
public class SpaceAssembler {

    public static Space toSpaceEntity(SpaceAddRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }

    public static Space toSpaceEntity(SpaceUpdateRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }

    public static Space toSpaceEntity(SpaceEditRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }
}