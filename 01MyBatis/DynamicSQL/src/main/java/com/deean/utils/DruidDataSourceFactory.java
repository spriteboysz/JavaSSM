package com.deean.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * Author: Deean
 * Date: 2023-11-08 23:46
 * FileName: src/main/java/com/deean/utils
 * Description:
 */

public class DruidDataSourceFactory extends PooledDataSourceFactory {
    public DruidDataSourceFactory() {
        this.dataSource = new DruidDataSource();
    }
}
