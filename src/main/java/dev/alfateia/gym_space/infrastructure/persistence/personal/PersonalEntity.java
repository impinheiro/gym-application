package dev.alfateia.gym_space.infrastructure.persistence.personal;

import jakarta.persistence.Entity;

import java.util.List;

@Entity(name= "personal")
public class PersonalEntity {

    private List<Long> clientsId;
    private List<Long> groupsId;
    private String description;
    private float score;
    private List<Long> trainingPlanId;
    private List<Long> exercisesId;

    public PersonalEntity(List<Long> clientsId, List<Long> groupsId, String description, float score, List<Long> trainingPlanId, List<Long> exercisesId) {
        this.clientsId = clientsId;
        this.groupsId = groupsId;
        this.description = description;
        this.score = score;
        this.trainingPlanId = trainingPlanId;
        this.exercisesId = exercisesId;
    }

    public List<Long> getClientsId() {
        return clientsId;
    }

    public void setClientsId(List<Long> clientsId) {
        this.clientsId = clientsId;
    }

    public List<Long> getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(List<Long> groupsId) {
        this.groupsId = groupsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public List<Long> getTrainingPlanId() {
        return trainingPlanId;
    }

    public void setTrainingPlanId(List<Long> trainingPlanId) {
        this.trainingPlanId = trainingPlanId;
    }

    public List<Long> getExercisesId() {
        return exercisesId;
    }

    public void setExercisesId(List<Long> exercisesId) {
        this.exercisesId = exercisesId;
    }
}
