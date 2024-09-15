package ro.ftc.service;

import ro.ftc.entity.Robot;
import ro.ftc.entity.Team;

import java.util.List;

public interface IRobotService {

    List<Robot> findAll();

    void save(Robot robot);

    void deleteRobot(Integer robotId);

}
