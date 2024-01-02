package gr.hua.dit.ds.tsadimasethelw.repository;

import gr.hua.dit.ds.tsadimasethelw.entity.Request;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path= "request")
@Hidden
public interface RequestRepository extends JpaRepository<Request, Integer>{

}
