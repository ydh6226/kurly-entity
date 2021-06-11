package com.kurlyentity.domain.cart;


import com.kurlyentity.domain.member.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Cart {

    @Id
    private Long id;

    @OneToMany(mappedBy = "cart", cascade = ALL, orphanRemoval = true)
    private List<CartProduct> includedProducts = new ArrayList<>();

    @OneToOne(fetch = EAGER)
    private Member member;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
