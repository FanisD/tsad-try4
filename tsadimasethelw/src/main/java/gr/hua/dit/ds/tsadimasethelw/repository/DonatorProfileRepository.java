package gr.hua.dit.ds.tsadimasethelw.repository;

import gr.hua.dit.ds.tsadimasethelw.entity.DonatorProfile;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path= "donatorprofile")
@Hidden
public interface DonatorProfileRepository extends JpaRepository<DonatorProfile, Integer> {
}
