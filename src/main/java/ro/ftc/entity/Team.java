package ro.ftc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, unique = true)
  private String name;

  @Column(nullable = false, unique = true)
  private String nationalId;

  @Column(nullable = false, unique = true)
  private Short internationalId;

  @Column(nullable = false)
  private float opr;


  @Transient
  private Country country;

  @ManyToMany
  @JoinTable(
          name = "person_team",
          joinColumns = @JoinColumn(name = "team_id"),
          inverseJoinColumns = @JoinColumn(name = "person_id"))
  private List<Person> personList = new ArrayList<>();

  @OneToMany(mappedBy = "team", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Robot> robotList = new ArrayList<>();
}
