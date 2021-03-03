package com.foobar.bar.domain;

import javax.persistence.*;

@Entity
@Table(name = "foo")
public class Foo1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="foo_id_seq")
    @SequenceGenerator(name="foo_id_seq", sequenceName="foo_id_seq", allocationSize=1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FOO")
    private String foo;

    Foo1(String foo) {
        this.foo = foo;
    }

    public Foo1(Long id, String foo) {
        this.id = id;
        this.foo = foo;
    }

    Foo1() {
        // Default constructor needed by JPA
    }

    public String getFoo() {
        return foo;
    }

}
