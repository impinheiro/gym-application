package dev.alfateia.gym_space.infrastructure.persistence.exercises;

import dev.alfateia.gym_space.core.enums.ExerciseType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity(name = "exercises")
public class ExercisesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private ExerciseType type;
    private int sets;
    private int repetitions;
    private float weight;
    private int duration;
    private int rest;
    private List<String> equipment;
    private String notes;

    public ExercisesEntity(Long id, String name, String description, ExerciseType type, int sets, int repetitions, float weight, int duration, int rest, List<String> equipment, String notes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.sets = sets;
        this.repetitions = repetitions;
        this.weight = weight;
        this.duration = duration;
        this.rest = rest;
        this.equipment = equipment;
        this.notes = notes;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExerciseType getType() {
        return type;
    }

    public void setType(ExerciseType type) {
        this.type = type;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
