package ro.ftc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.ftc.entity.Country;
import ro.ftc.entity.Robot;
import ro.ftc.entity.Team;
import ro.ftc.repository.PersonRepository;
import ro.ftc.repository.RobotRepository;
import ro.ftc.service.ITeamService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class TeamController {
  private final ITeamService teamService;
  private final PersonRepository personRepository;
  private final RobotRepository robotRepository;

  @GetMapping("/teams/all")
  public String getAllTeams(final Model model) {
    List<Team> teams = teamService.findAll();
    model.addAttribute("teams", teams);
    return "all-teams";
  }

  @GetMapping("/add-team")
  public String showTeamForm(Model model) {
    Team team = new Team();
    model.addAttribute("team", team);
    model.addAttribute("participants", personRepository.findAll());
    model.addAttribute("robots", robotRepository.findAll());
    model.addAttribute("countries", Country.values());
    return "add-team";
  }

  @PostMapping("/add-team")
  public String addTeam(@ModelAttribute Team team) {
    teamService.save(team);
    return "redirect:/teams/all";
  }

}
