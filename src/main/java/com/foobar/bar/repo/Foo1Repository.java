package com.foobar.bar.repo;


import com.foobar.bar.domain.Foo1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Foo1Repository extends JpaRepository<Foo1, Long> {

    Optional<Foo1> findById(Long id);

    Foo1 save(Foo1 foo1);

}
