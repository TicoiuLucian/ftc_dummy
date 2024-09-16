package ro.ftc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ftc.entity.Robot;

public interface RobotRepository extends JpaRepository<Robot, Integer> {
}
