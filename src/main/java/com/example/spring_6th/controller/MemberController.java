package com.example.spring_6th.controller;

import com.example.spring_6th.model.MemberModel;
import com.example.spring_6th.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/list")
    public String list(Model model){
        List<MemberModel> member = memberService.printMember();

        model.addAttribute("memberList", member);

        return "list";
    }

    @RequestMapping("/addMember")
    public String addMember(Model model){
        return "addMember";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ModelAndView insert(HttpServletRequest request) throws UnsupportedEncodingException{
        request.setCharacterEncoding("UTF-8");
        MemberModel member = new MemberModel();
        member.setPharm_id(Integer.parseInt(request.getParameter("pharm_id")));
        member.setPharm_pw((String)request.getParameter("pharm_pw"));
        member.setOpentime((String)request.getParameter("opentime"));
        member.setClosetime((String)request.getParameter("closetime"));
        member.setPharm_adr((String)request.getParameter("pharm_adr"));

        memberService.insertMember(member);
        ModelAndView result=new ModelAndView("redirect:/list");

        return result;
    }
}
