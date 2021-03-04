package com.foobar;

import com.foobar.foo.repo1.Foo1Repository;
import com.foobar.foo.domain.Foo;
import com.foobar.foo.repo.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FooBarController {

  @Autowired
  FooRepository fooRepository;

  @Autowired
  Foo1Repository foo1Repository;

  private final FooRepository fooRepo;
  private final Foo1Repository foo1Repo;

  @Autowired
  FooBarController(FooRepository fooRepo, Foo1Repository foo1Repo) {
    this.fooRepo = fooRepo;
    this.foo1Repo = foo1Repo;
  }



  @RequestMapping("/foobar/{id}")
  public String fooBar(@PathVariable("id") Long id) {
    Optional<Foo> foo = fooRepo.findById(id);
    Optional<Foo> bar = foo1Repo.findById(id);

    return "test foobar id";
  }

  @GetMapping("/foobar")
  public String getFooBar() {
    return "test foobar id";
  }

  @PostMapping("/foobar/{id}")
  public String makeFooBar(@PathVariable("id") Long id) {
    Foo foo = new Foo(id,"Foo");
    Foo foo1 = new Foo(id,"Foo");
    fooRepo.save(foo);
    foo1Repo.save(foo1);

    return "done";
  }

}
