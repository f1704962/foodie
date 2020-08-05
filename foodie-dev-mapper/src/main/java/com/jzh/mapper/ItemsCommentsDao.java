package com.jzh.mapper;

import com.jzh.pojo.ItemsComments;

public interface ItemsCommentsDao {
    int deleteByPrimaryKey(String id);

    int insert(ItemsComments record);

    int insertSelective(ItemsComments record);

    ItemsComments selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsComments record);

    int updateByPrimaryKey(ItemsComments record);
}