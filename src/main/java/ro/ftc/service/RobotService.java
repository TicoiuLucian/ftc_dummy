package ro.ftc.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.ftc.entity.Robot;
import ro.ftc.entity.Team;
import ro.ftc.repository.RobotRepository;
import ro.ftc.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RobotService implements IRobotService {
  private final RobotRepository robotRepository;
  private final TeamRepository teamRepository;

    @PersistenceContext
    private EntityManager entityManager;

  @Override
  public List<Robot> findAll() {
    return robotRepository.findAll();
  }

    @Override
    public void save(Robot robot) {
        Optional<Team> optionalTeam = teamRepository.findById(robot.getTeam().getId());
        if (optionalTeam.isPresent()) {
            Team team = optionalTeam.get();
            robot.setTeam(team);
            robotRepository.save(robot);
        } else {
            throw new EntityNotFoundException("Team not found");
        }
    }

  @Override
  public Robot findById(Integer id) {
    return robotRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Robot not found"));
  }

  @Override
  @Transactional
  public void deleteRobot(Integer id) {
      if (robotRepository.existsById(id)) {
          robotRepository.deleteById(id);
      } else {
          throw new EntityNotFoundException("Robot not found");
      }
  }
}
