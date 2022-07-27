package com.dust.hello.http;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemoryMemberRepository implements MemberRepository {
    Map<Long, Member> map;

    public MemoryMemberRepository() {
        map = new HashMap<>();
    }

    @Override
    public Member findById(Long id) {
        return map.get(id);
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void save(Member member) {
        map.put(member.getId(), member);
    }

    @Override
    public Member updateById(Long id, Member member) {
        map.replace(id, member);
        return map.get(id);
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }
}
