package ro.ftc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.ftc.entity.Team;
import ro.ftc.service.ITeamService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class TeamController {
  private final ITeamService teamService;

  @GetMapping("/teams/all")
  public String getAllTeams(
          @RequestParam(required = false) String direction,
          @RequestParam(required = false) String property,
          final Model model) {
    List<Team> teams = teamService.findAll(direction, property);
    model.addAttribute("teams", teams);
    return "all-teams";
  }

  @GetMapping("/team")
  public String showTeamForm(Model model) {
    Team team = new Team();
    model.addAttribute("team", team);
    return "add-team";
  }

  @PostMapping("/team")
  public String addTeam(@ModelAttribute Team team) {
    teamService.save(team);
    return "redirect:/all-teams";
  }

  @PostMapping("/delete-team/{id}")
  public String deleteTeam(@PathVariable("id") Integer id) {
    teamService.delete(id);
    return "redirect:/teams/all";
  }
}
