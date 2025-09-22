package dev.alfateia.gym_space.infrastructure.persistence.statistics;

import dev.alfateia.gym_space.core.entities.Exercises;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "statistics")
public class StatisticsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany
    private List<Exercises> exercises;

    // TODO: Adicionar mais campos

    public StatisticsEntity() {
    }

    public StatisticsEntity(Long id, String name, List<Exercises> exercises) {
        this.id = id;
        this.name = name;
        this.exercises = exercises;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exercises> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercises> exercises) {
        this.exercises = exercises;
    }
}
