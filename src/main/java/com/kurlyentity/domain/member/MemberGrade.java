package com.kurlyentity.domain.member;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class MemberGrade {

    @Id
    private Long id;

    private String name;

    //단위: %
    private double accrualRate;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
