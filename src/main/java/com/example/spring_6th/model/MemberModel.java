package com.example.spring_6th.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberModel {

    private int pharm_id;
    private String pharm_pw;
    private String opentime;
    private String closetime;
    private String pharm_adr;
}
