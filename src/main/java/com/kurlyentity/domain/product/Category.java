package com.kurlyentity.domain.product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Category {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    private Category parent;

    @OneToMany(mappedBy = "parent", cascade = ALL, orphanRemoval = true)
    private List<Category> children = new ArrayList<>();

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
