package dev.alfateia.gym_space.infrastructure.persistence.exercises;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesRepository extends JpaRepository<ExercisesEntity, Long> {
}
