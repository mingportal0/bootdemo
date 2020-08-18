package com.mjp.demo.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mjp.demo.member.dto.MemberDto;
import com.mjp.demo.member.service.MemberService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/member") 
public class MemberController {
    private MemberService memberService;

    // 회원가입 페이지
    @RequestMapping("/signup")
    public String dispSignup() {
        return "member/signup.html";
    }

    // 회원가입 처리
    @PostMapping("/signupAction")
    public String execSignup(MemberDto memberDto) {
    	System.out.println("### MemberController - signupAction");
        memberService.joinUser(memberDto);

        return "member/login.html";
    }

    // 로그인 페이지
    @RequestMapping("/login")
    public String dispLogin() {
        return "member/login.html";
    }

    // 로그인 결과 페이지
    @RequestMapping("/login/result")
    public String dispLoginResult() {
        return "member/loginSuccess.html";
    }

    // 로그아웃 결과 페이지
    @RequestMapping("/logout/result")
    public String dispLogout() {
        return "member/logout.html";
    }

    // 접근 거부 페이지
    @RequestMapping("/denied")
    public String dispDenied() {
        return "member/denied.html";
    }

    // 내 정보 페이지
    @RequestMapping("/myinfo")
    public String dispMyInfo() {
        return "member/myinfo.html";
    }

    // 어드민 페이지
    @RequestMapping("/admin")
    public String dispAdmin() {
        return "member/admin/admin.html";
    }

}
