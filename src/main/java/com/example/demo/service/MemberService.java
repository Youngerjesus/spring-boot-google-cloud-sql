package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.dto.MemberDTO;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void addMember(MemberDTO memberDTO){
        User member = new User();
        member.setName(memberDTO.getName());
        member.setEmail(memberDTO.getEmail());
        memberRepository.save(member);
    }
}
