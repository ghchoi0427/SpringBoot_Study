package com.dust.hello.http;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public List<Member> viewAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public void createMember(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member updateMember(Long id, Member member) {
        memberRepository.updateById(id, member);
        return memberRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        memberRepository.deleteById(id);
    }
}
