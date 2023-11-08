package com.deean.dao;

import com.deean.pojo.Member;
import com.deean.pojo.MemberSearchCondition;
import com.deean.utils.MyBatisUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

class MemberDAOTest {

    @Test
    void searchMember() {
        MemberSearchCondition params = new MemberSearchCondition();
        params.setGender("F");
        MemberDAO memberDAO = MyBatisUtil.getMapper(MemberDAO.class);
        List<Member> members = memberDAO.searchMember(params);
        for (Member member : members) {
            System.out.println(member);
        }
    }
}