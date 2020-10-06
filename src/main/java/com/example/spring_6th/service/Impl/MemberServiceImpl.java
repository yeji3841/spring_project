package com.example.spring_6th.service.Impl;

import com.example.spring_6th.dao.MemberDao;
import com.example.spring_6th.model.MemberModel;
import com.example.spring_6th.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao dao;

    @Override
    public List<MemberModel> printMember(){
        List<MemberModel> member = dao.getMember();
        return member;
    }

    @Override
    public void insertMember(MemberModel member){
        dao.setMember(member);
    }
}
