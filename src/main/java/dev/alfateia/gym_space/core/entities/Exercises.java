package dev.alfateia.gym_space.core.entities;

import dev.alfateia.gym_space.core.enums.ExerciseType;

import java.util.List;

public record Exercises(
        Long id,
        String name,
        String description,
        ExerciseType type,
        int sets,
        int repetitions,
        float weight,
        int duration,
        int rest,
        List<String> equipment,
        String notes
) {
}
