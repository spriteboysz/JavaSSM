package com.deean.dao;

import com.deean.pojo.Detail;
import com.deean.utils.MyBatisUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DetailDAOTest {

    @Test
    void queryDetail() {
        DetailDAO detailDAO = MyBatisUtil.getMapper(DetailDAO.class);
        Detail detail = detailDAO.queryDetail("20230001");
        System.out.println(detail);
        assertNotNull(detail);
    }
}