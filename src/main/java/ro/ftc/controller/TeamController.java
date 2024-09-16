package ro.ftc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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

  @PostMapping("/delete-team/{id}")
  public String deleteTeam(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
    try {
      teamService.deleteTeam(id);
      return "redirect:/teams/all";
    } catch (Exception e) {
      redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while deleting the team.");
      return "redirect:/teams/all";
    }
  }

  @GetMapping("/teams/add")
  public String showTeamForm(Model model) {
    Team team = new Team();
    model.addAttribute("team", team);
    return "add-team";
  }

  @PostMapping("/teams/add")
  public String addTeam(@ModelAttribute Team team) {
    teamService.save(team);
    return "redirect:/teams/all";
  }

  @GetMapping("/teams/update/{id}")
  public String showUpdateTeamForm(@PathVariable Integer id, Model model) {
    Team team = teamService.findById(id);
    model.addAttribute("team", team);
    return "update-team";
  }

  @PostMapping("/teams/update")
  public String updateTeam(@ModelAttribute Team team) {
    teamService.save(team);
    return "redirect:/teams/all";
  }

}
