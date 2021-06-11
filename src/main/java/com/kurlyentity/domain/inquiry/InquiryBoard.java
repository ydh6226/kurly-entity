package com.kurlyentity.domain.inquiry;

import com.kurlyentity.domain.member.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class InquiryBoard {

    @Id
    private Long id;

    @OneToOne(fetch = LAZY)
    private Member member;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
