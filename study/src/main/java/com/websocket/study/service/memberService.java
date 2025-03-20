package com.websocket.study.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.websocket.study.dto.req.JoinMemberReq;
import com.websocket.study.entity.Member;
import com.websocket.study.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberService {

    MemberRepository memberRepository;

    public Member joinMember ( JoinMemberReq joinMemberReq) {

        return memberRepository.save(joinMemberReq.toEntity());

    }

    /* jwt로 빼야함 
    public ResponseEntity<?> login(){

        return ResponseEntity.ok().body(null);
    }

    public ResponseEntity<?> logout(){

        return ResponseEntity.ok().body(null);
    }
    */

    // 예외처리 필요 ( 잘못된 번호일 경우 )
    public Optional<Member> memberInfo(@PathVariable long memberNo){

        return memberRepository.findById(memberNo);
    }
    
    public ResponseEntity<?> updateMemberInfo(){

        return ResponseEntity.ok().body(null);
    }

    public ResponseEntity<?> resignMember(){

        return ResponseEntity.ok().body(null);
    }
    
}   
