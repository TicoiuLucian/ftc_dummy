package ro.ftc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, unique = true, updatable = false)
  private Long personalNumber;

  @Column(nullable = false)
  private String name;

  @Column(unique = true, nullable = false)
  private String email;

  @Enumerated(EnumType.STRING)
  @Column(name = "role", nullable = false)
  @ElementCollection(targetClass = Role.class)
  @CollectionTable(name = "person_roles", joinColumns = @JoinColumn(name = "person_id"))
  private List<Role> roles;

  @JsonBackReference
  @ManyToMany(mappedBy = "personList")
  private List<Team> teamList;

}
//T man was here
