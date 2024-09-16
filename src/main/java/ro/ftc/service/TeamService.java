package ro.ftc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ro.ftc.entity.Country;
import ro.ftc.entity.Team;
import ro.ftc.repository.TeamRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService implements ITeamService {
  private final TeamRepository teamRepository;

  @Override
  public List<Team> findAll(
          final String direction,
          final String property) {
    List<Team> all;
    if (direction == null || property == null) {
      all = teamRepository.findAll();
    } else {
      all = teamRepository.findAll(Sort.by(Sort.Direction.valueOf(direction), property));
    }
    populateCountry(all);
    return all;
  }

  @Override
  public void save(final Team team) {
    teamRepository.save(team);
  }

  private void populateCountry(List<Team> teams) {
    for (Team team : teams) {
      team.setCountry(Country.valueOf(team.getNationalId().substring(0, 2)));
    }
  }

  @Override
  public void delete(Integer id) {
    teamRepository.deleteById(id);
  }

}
