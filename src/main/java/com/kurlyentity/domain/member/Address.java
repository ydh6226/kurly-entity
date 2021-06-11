package com.kurlyentity.domain.member;


import com.kurlyentity.domain.member.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

// TODO: 2021-06-11[양동혁] 비회원이 생성한 배송정보는 7일보관후 삭제
@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Address {

    @Id
    private Long id;

    private String zipCode;

    private String streetNameAddress;

    private String lotNumberAddress;

    private String detailedAddress;

    private boolean isBasicAddress;

    @ManyToOne(fetch = LAZY)
    private Member member;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
