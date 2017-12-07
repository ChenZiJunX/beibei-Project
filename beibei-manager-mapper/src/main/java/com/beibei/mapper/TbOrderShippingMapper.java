package com.beibei.mapper;

import com.beibei.pojo.TbOrderShipping;

public interface TbOrderShippingMapper {
    int countByPrimaryKey();
    
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShipping tbOrderShipping);

    TbOrderShipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKey(TbOrderShipping tbOrderShipping);
}