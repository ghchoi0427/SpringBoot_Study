package com.dust.hello.member;

import com.dust.hello.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "A", Grade.VIP);
        //when
        memberService.joinMember(member);

        Member findMember = memberService.findMember(1L);

        //then

        Assertions.assertThat(member).isEqualTo(findMember);

    }

}