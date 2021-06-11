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
public class Point {

    @Id
    private Long id;

    private int accumulatedPoint;

    private int currentPoint;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
