package com.foobar.foo.repo1;

import com.foobar.foo.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Foo1Repository extends JpaRepository<Foo, Long> {

    Optional<Foo> findById(Long id);

    Foo save(Foo foo);

}
