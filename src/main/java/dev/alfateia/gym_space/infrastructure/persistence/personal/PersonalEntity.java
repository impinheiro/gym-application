package dev.alfateia.gym_space.infrastructure.persistence.personal;

import dev.alfateia.gym_space.core.enums.Gender;
import dev.alfateia.gym_space.core.enums.Role;
import dev.alfateia.gym_space.infrastructure.persistence.user.UserEntity;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "personal")
public class PersonalEntity extends UserEntity {

    @ElementCollection
    private List<Long> clientsId;

    @ElementCollection
    private List<Long> groupsId;
    private String description;
    private float score;

    @ElementCollection
    private List<Long> trainingPlanId;
    private List<Long> exercisesId;

    public PersonalEntity(Long id, String name, String email, String password, Gender gender, Role role) {
        super(id, name, email, password, gender, role);
    }

    public PersonalEntity(Long id, String name, String email, String password, Gender gender, Role role, List<Long> clientsId, List<Long> groupsId, String description, float score, List<Long> trainingPlanId, List<Long> exercisesId) {
        super(id, name, email, password, gender, role);
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
