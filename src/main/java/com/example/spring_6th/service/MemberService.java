package com.example.spring_6th.service;

import com.example.spring_6th.model.MemberModel;
import java.util.List;

public interface MemberService {
    List<MemberModel> printMember();
    void insertMember(MemberModel member);
}
