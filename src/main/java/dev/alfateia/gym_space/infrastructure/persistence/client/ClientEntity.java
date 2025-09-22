package dev.alfateia.gym_space.infrastructure.persistence.client;

import dev.alfateia.gym_space.core.entities.Statistics;
import dev.alfateia.gym_space.core.entities.TrainingPlan;
import dev.alfateia.gym_space.core.enums.Gender;
import dev.alfateia.gym_space.core.enums.Role;
import dev.alfateia.gym_space.infrastructure.persistence.user.UserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="client")
public class ClientEntity extends UserEntity {

    private Statistics statistics;
    private TrainingPlan trainingPlan;

    public ClientEntity(Long id, String name, String email, String password, Gender gender, Role role) {
        super(id, name, email, password, gender, role);
    }

    public ClientEntity(Long id, String name, String email, String password, Gender gender, Role role, Statistics statistics, TrainingPlan trainingPlan) {
        super(id, name, email, password, gender, role);
        this.statistics = statistics;
        this.trainingPlan = trainingPlan;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }
}
