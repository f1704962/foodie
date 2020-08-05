package com.jzh.mapper;

import com.jzh.pojo.PdmanDbVersion;

public interface PdmanDbVersionDao {
    int insert(PdmanDbVersion record);

    int insertSelective(PdmanDbVersion record);
}