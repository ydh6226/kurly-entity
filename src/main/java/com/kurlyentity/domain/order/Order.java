package com.kurlyentity.domain.order;

import com.kurlyentity.domain.cart.Cart;
import com.kurlyentity.domain.member.Address;
import com.kurlyentity.domain.member.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;

@Entity(name = "orders")
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Order {

    @Id
    private Long id;

    @Enumerated(STRING)
    private OrderType Type;

    @Enumerated(STRING)
    private OrderStatus status;

    @ManyToOne(fetch = LAZY)
    private Cart cart;

    @OneToOne(fetch = LAZY)
    private Address address;

    //비회원 주문인경우 null
    @ManyToOne(fetch = LAZY)
    private Member member;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
