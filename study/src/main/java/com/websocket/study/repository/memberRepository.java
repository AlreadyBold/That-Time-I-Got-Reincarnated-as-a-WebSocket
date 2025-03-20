package com.websocket.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websocket.study.entity.Member;

public interface MemberRepository extends JpaRepository <Member,Long> {
    
}
