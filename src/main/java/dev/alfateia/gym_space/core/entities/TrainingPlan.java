package dev.alfateia.gym_space.core.entities;

import java.util.List;

public record TrainingPlan(
        Long id,
        String name,
        List<Exercises> plan
) {
}
