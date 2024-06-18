package hello.hello_spring;

import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired  // 생성자가 하나인 경우 생략 가능
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean       // memberService을 스프링 빈에 등록
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }


    /*
    @Bean       // memberRepository를 스프링 빈에 등록
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
     */
}
