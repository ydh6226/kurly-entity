package com.kurlyentity.domain.member;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Member {

    @Id
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    private String name;

    @Column(unique = true)
    private String email;

    private String phoneNumber;

    @Enumerated(STRING)
    private Gender gender;

    private LocalDateTime birthDay;

    private boolean receiveAdsBySms;

    private boolean receiveAdsByEmail;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;

    @OneToOne(fetch = LAZY, cascade = ALL)
    private Point point;

    @OneToOne(fetch = LAZY)
    private MemberGrade grade;

    @OneToMany(mappedBy = "member", cascade = ALL, orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();
}
