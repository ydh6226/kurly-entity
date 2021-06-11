package com.kurlyentity.domain.product;


import com.kurlyentity.domain.member.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class ProductBoard {

    @Id
    private Long id;

    private String title;

    private int helpCount = 0;

    private int views = 0;

    @Lob
    @Basic(fetch = LAZY)
    private String description;

    @Enumerated(STRING)
    private ProductBoardType type;

    @ManyToOne(fetch = LAZY)
    private Member member;

    @ManyToOne(fetch = LAZY)
    private Product product;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
