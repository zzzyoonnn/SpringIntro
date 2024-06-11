package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;
    /*
    // 필드 주입. 코드가 간결해지지만 외부 접근이 불가능
    private MemberService memberService;

    // Setter 주입. public으로 노출됨
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

     */

    // 생성자 주입
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
