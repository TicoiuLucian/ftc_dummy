package ro.ftc.service;

import ro.ftc.entity.Team;

import java.util.List;

public interface ITeamService {

  List<Team> findAll();

  void save(Team team);

  void delete(Integer id);

  void sortByOpr(Float opr);
}
