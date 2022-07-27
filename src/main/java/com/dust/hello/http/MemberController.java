package com.dust.hello.http;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public List<Member> list() {
        return memberService.viewAllMembers();
    }

    @GetMapping("/new")
    public void registerForm() {
    }

    @PostMapping("/new")
    public void register(@RequestBody Member member) {
        memberService.createMember(member);
    }

    @GetMapping("/{id}")
    public Member read(@PathVariable Long id) {
        memberService.getMemberById(id);
        return memberService.getMemberById(id);
    }

    @GetMapping("/{id}/edit")
    public void editForm(@PathVariable Long id, @RequestBody Member member) {
        memberService.updateMember(id, member);
    }

    @PostMapping("/{id}/edit")
    public void edit(@PathVariable Long id, @RequestBody Member member) {
        memberService.updateMember(id, member);
    }

    @PostMapping("/members/{id}/delete")
    public void delete(@PathVariable Long id) {
        memberService.deleteById(id);
    }
}
