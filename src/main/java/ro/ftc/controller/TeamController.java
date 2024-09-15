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
  public String getAllTeams(final Model model) {
    List<Team> teams = teamService.findAll();
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


  @GetMapping("/delete-team/{teamId}")
  public String deleteTeam(@PathVariable Long teamId, RedirectAttributes redirectAttributes) {
    try {
      teamService.deleteTeam(Math.toIntExact(teamId));
      return "redirect:/teams/all";
    } catch (Exception e) {
      e.printStackTrace();
      redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while deleting the team.");
      return "redirect:/error";
    }
  }

}
