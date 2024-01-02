package gr.hua.dit.ds.tsadimasethelw.repository;


import gr.hua.dit.ds.tsadimasethelw.entity.Donator;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path= "donator")
@Hidden
public interface DonatorRepository extends JpaRepository<Donator, Integer>{
}
