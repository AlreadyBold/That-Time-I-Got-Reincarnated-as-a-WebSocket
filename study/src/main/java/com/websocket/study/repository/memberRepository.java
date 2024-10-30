package com.websocket.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websocket.study.entity.member;

public interface memberRepository extends JpaRepository <member,Long> {
    
}
