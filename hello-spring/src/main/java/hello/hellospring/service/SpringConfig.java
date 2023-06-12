package hello.hellospring.service;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//    private EntityManager em;
//
//    private DataSource dataSource;

//    public SpringConfig(EntityManager em, DataSource dataSource) {
//        this.em = em;
//        this.dataSource = dataSource;
//    }
    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    // 직접 빈 등록하는 방식
    // 컴포넌트 스캔과 비교했을 때 장단점이 존재
    // 장점 : 해당 클래스의 용도를 바꿔야 할 때 다른 코드의 전체 수정 없이 변경하고자 할 때 유용함
    @Bean
    public MemberService memberService(){
//        return new MemberService(memberRepository());
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
////        return new MemoryMemberRepository();
////        return new JdbcMemberRepository(dataSource);
////        return new JdbcTemplateMemberRepository(dataSource);
////        return new JpaMemberRepository(em);
//    }

    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }
}
