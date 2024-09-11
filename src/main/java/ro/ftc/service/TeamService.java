package ro.ftc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.ftc.repository.TeamRepository;

@Service
@RequiredArgsConstructor
public class TeamService implements ITeamService {
  private final TeamRepository teamRepository;
}
