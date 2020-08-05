package com.jzh.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * pdman_db_version
 * @author 
 */
@Data
public class PdmanDbVersion implements Serializable {
    private String dbVersion;

    private String versionDesc;

    private String createdTime;

    private static final long serialVersionUID = 1L;
}