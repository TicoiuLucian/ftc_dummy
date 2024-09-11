package ro.ftc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.ftc.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
