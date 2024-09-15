package ro.ftc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.ftc.entity.Country;
import ro.ftc.entity.Robot;
import ro.ftc.entity.Team;
import ro.ftc.repository.RobotRepository;
import ro.ftc.repository.TeamRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RobotService implements IRobotService{
    private final RobotRepository robotRepository;

    @Override
    public List<Robot> findAll() {
        List<Robot> all = robotRepository.findAll();
        return all;
    }

    @Override
    public void save(final Robot robot) {
        robotRepository.save(robot);
    }

    @Override
    public void deleteRobot(Integer robotId) {
        Robot robot = robotRepository.findById(robotId).orElseThrow(() -> new RuntimeException("Robot not found!"));
        robotRepository.deleteById(robotId);
    }

}
