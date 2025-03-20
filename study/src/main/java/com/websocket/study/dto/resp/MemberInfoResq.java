package com.websocket.study.dto.resp;

import java.time.LocalDateTime;
import java.util.Date;

import com.websocket.study.entity.Member;

import lombok.Getter;

@Getter
public class MemberInfoResq {

    private String userId;

    private String userName;

    private String userNickname;

    private Date birth;

    private LocalDateTime joinDate;

    public  MemberInfoResq (Member member,String type) {

        if (type.equals("Strager")){
            this.userName = member.getUserName();
            this.userNickname = member.getUserNickname();
            this.birth = member.getBirth();
        } else {
            this.userId = member.getUserId();
            this.userName = member.getUserName();
            this.userNickname = member.getUserNickname();
            this.birth = member.getBirth();
            this.joinDate = member.getJoinDate();
        }
    }
    
}
