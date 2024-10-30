package com.websocket.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.websocket.study.service.memberService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Tag(name = "Member", description = "회원 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
@Slf4j
public class memberController {

    private final memberService memberservice;

    @PostMapping("/")
    @Operation(summary = "회원 가입", description = " 회원 가입 API ")
    public ResponseEntity<?> joinMember(){

        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/login")
    @Operation(summary = "로그인", description = " 로그인 API ")
    public ResponseEntity<?> login(){

        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/logout")
    @Operation(summary = "로그아웃", description = " 로그아웃 API ")
    public ResponseEntity<?> logout(){

        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/{memberId}")
    @Operation(summary = "회원 정보", description = " 회원 정보 API ")
    public ResponseEntity<?> memberInfo(@PathVariable long memberId){

        return ResponseEntity.ok().body(null);
    }

    @PatchMapping("/")
    @Operation(summary = "회원 정보 변경", description = " 회원 정보 변경 API ")
    public ResponseEntity<?> updateMemberInfo(){

        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping("/")
    @Operation(summary = "회원 탈퇴", description = " 회원 탈퇴 API ")
    public ResponseEntity<?> resignMember(){

        return ResponseEntity.ok().body(null);
    }


}
