package ro.ftc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.ftc.entity.Robot;
import ro.ftc.entity.Team;
import ro.ftc.service.IRobotService;
import ro.ftc.service.ITeamService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class RobotController {
    private final IRobotService robotService;
    private final ITeamService teamService;

    @GetMapping("/robots/all")
    public String getAllRobots(final Model model) {
        List<Robot> robots = robotService.findAll();
        model.addAttribute("robots", robots);
        return "all-robots";
    }

    @PostMapping("/delete-robot/{id}")
    public String deleteRobot(@PathVariable Integer id) {
            robotService.deleteRobot(id);
            return "redirect:/robots/all";
    }

    @GetMapping("/robots/add")
    public String showAddRobotForm(Model model) {
        List<Team> teams = teamService.findAll(null, null);
        model.addAttribute("teams", teams);
        model.addAttribute("robot", new Robot());
        return "add-robot";
    }

    @PostMapping("/robots/add")
    public String addRobot(@ModelAttribute Robot robot) {
        robotService.save(robot);
        return "redirect:/robots/all";
    }

    @GetMapping("/robots/update/{id}")
    public String showUpdateRobotForm(@PathVariable Integer id, Model model) {
        Robot robot = robotService.findById(id);
        List<Team> teams = teamService.findAll(null, null);
        model.addAttribute("robot", robot);
        model.addAttribute("teams", teams);
        return "update-robot";
    }

    @PostMapping("/robots/update")
    public String updateRobot(@ModelAttribute Robot robot) {
        robotService.save(robot);
        return "redirect:/robots/all";
    }
}
