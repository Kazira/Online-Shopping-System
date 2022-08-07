package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Login;

import java.util.Set;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

    Set<Login> getAll();
}