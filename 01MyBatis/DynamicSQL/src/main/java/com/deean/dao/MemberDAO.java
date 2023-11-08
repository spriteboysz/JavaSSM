package com.deean.dao;

import com.deean.pojo.Member;
import com.deean.pojo.MemberSearchCondition;

import java.util.List;

public interface MemberDAO {
    List<Member> searchMember(MemberSearchCondition params);
}
