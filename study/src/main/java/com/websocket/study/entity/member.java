package com.websocket.study.entity;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@EntityListeners(AuditingEntityListener.class)
public class member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name ="user_name")
    @NotNull
    private String userName;

    @Column(name ="user_nickname")
    @NotNull
    private String userNickname;

    @Column(name ="birth")
    @NotNull
    private Date birth;

    @Column(name ="user_pw")
    @NotNull
    private String userPw;

    @CreatedDate
    @Column(insertable = true, updatable = false, name="create_date")
    private LocalDateTime joinDate;


}
