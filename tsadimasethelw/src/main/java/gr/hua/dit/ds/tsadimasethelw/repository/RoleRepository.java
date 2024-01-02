package gr.hua.dit.ds.tsadimasethelw.repository;

import gr.hua.dit.ds.tsadimasethelw.entity.Role;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Hidden
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String roleName);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
