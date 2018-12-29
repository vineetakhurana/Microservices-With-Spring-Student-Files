package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import demo.domain.Team;

@RestResource(path="teams", rel="teams")
public interface TeamRepository extends CrudRepository<Team,Long>{
    //custom method
    Team findByName(String name);
}
