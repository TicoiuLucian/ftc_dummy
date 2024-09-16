package ro.ftc.service;

import ro.ftc.entity.Team;

import java.util.List;

public interface ITeamService {

  List<Team> findAll(final String direction, final String property);

  void save(final Team team);

  void delete(final Integer id);

}
