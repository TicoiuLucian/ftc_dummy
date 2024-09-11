package ro.ftc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Robot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Byte enginesNumber;

    @Column(nullable = false)
    private Float length;

    @Column(nullable = false)
    private Float width;

    @Column(nullable = false)
    private Float weight;

    @Column(nullable = false)
    private Boolean expansionHub;

    @Transient
    private Boolean isEligible;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonBackReference
    private Team team;

}