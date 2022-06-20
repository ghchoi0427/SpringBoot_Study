package com.dust.hello.discount;

import com.dust.hello.member.Grade;
import com.dust.hello.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountAmount;
        }
        return 0;
    }
}
