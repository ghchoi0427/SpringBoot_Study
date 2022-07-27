package com.dust.hello.http;

import java.util.List;

public interface MemberService {

    List<Member> viewAllMembers();

    Member getMemberById(Long id);

    void createMember(Member member);

    Member updateMember(Long id, Member member);

    void deleteById(Long id);

}
