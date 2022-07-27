package com.dust.hello.http;

import java.util.List;

public interface MemberRepository {

    Member findById(Long id);

    List<Member> findAll();

    void save(Member member);

    Member updateById(Long id, Member member);

    void deleteById(Long id);

}
