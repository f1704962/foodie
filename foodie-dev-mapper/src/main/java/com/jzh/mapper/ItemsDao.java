package com.jzh.mapper;

import com.jzh.pojo.Items;

public interface ItemsDao {
    int deleteByPrimaryKey(String id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}