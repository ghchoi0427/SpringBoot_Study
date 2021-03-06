package com.dust.hello.discount;

import com.dust.hello.annotation.MainDiscountPolicy;
import com.dust.hello.member.Grade;
import com.dust.hello.member.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    int discountRate = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountRate / 100;
        }
        return 0;
    }
}
