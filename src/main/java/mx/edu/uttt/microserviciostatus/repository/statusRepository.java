package mx.edu.uttt.microserviciostatus.repository;

import mx.edu.uttt.microserviciostatus.model.status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface statusRepository extends JpaRepository<status, String> {
}
