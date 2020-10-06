package com.example.spring_6th.dao;

import com.example.spring_6th.model.MemberModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MemberDao {
    List<MemberModel> getMember();
    void setMember(MemberModel member);
}
