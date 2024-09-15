package ro.ftc.service;

import lombok.RequiredArgsConstructor;
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
    public List<Team> findAll() {
        List<Team> all = teamRepository.findAll();
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
    public void deleteTeam(Integer teamId) {
        Team team = teamRepository.findById(teamId).orElseThrow(() -> new RuntimeException("Team not found!"));
        teamRepository.deleteById(teamId);
    }

    @Override
    public void addTeam(Team team) {
        teamRepository.save(team);
    }
}
