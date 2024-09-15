package ro.ftc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.ftc.entity.Robot;
import ro.ftc.service.IRobotService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class RobotController {
    private final IRobotService robotService;

    @GetMapping("/robots/all")
    public String getAllRobots(final Model model) {
        List<Robot> robots = robotService.findAll();
        model.addAttribute("robots", robots);
        return "all-robots";
    }

    @GetMapping("/robot")
    public String showRobotForm(Model model) {
        Robot robot = new Robot();
        model.addAttribute("robot", robot);
        return "add-robot";
    }

    @PostMapping("/robot")
    public String addRobot(@ModelAttribute Robot robot) {
        robotService.save(robot);
        return "redirect:/all-robots";
    }

}
