package ro.ftc.service;

import ro.ftc.entity.Team;

import java.util.List;

public interface ITeamService {

  List<Team> findAll(final String direction, final String property);

  Team findById(Integer id);

  void save(Team team);

  void deleteTeam(Integer id);
}
