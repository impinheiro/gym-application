package dev.alfateia.gym_space.infrastructure.persistence.trainingPlan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingPlanRepository extends JpaRepository<TrainingPlanEntity, Long> {
}
