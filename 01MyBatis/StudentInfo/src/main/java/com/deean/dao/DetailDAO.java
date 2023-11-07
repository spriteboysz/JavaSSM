package com.deean.dao;

import com.deean.pojo.Detail;

/**
 * Author: Deean
 * Date: 2023-11-07 22:51
 * FileName: src/main/java/com/deean/dao
 * Description:
 */

public interface DetailDAO {
    int insertDetail(Detail detail);

    Detail queryDetail(String stuNum);
}
