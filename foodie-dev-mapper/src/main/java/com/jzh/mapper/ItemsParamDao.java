package com.jzh.mapper;

import com.jzh.pojo.ItemsParam;

public interface ItemsParamDao {
    int deleteByPrimaryKey(String id);

    int insert(ItemsParam record);

    int insertSelective(ItemsParam record);

    ItemsParam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsParam record);

    int updateByPrimaryKey(ItemsParam record);
}