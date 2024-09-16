package ro.ftc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.ftc.entity.Robot;

@Repository
public interface RobotRepository extends JpaRepository<Robot, Integer> {
}
