package com.websocket.study.dto.req;

import java.util.Date;

import com.websocket.study.entity.Member;

public class JoinMemberReq {

    private String userId;

    private String userPw;

    private String userName;

    private String userNickname;

    private Date birth;

    public Member toEntity(){

        return Member.builder()
            .userId(userId)
            .userPw(userPw)
            .userName(userName)
            .userNickname(userNickname)
            .birth(birth)
            .build();
    }
    
}
