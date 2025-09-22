package dev.alfateia.gym_space.core.entities;

import java.util.List;

public record Statistics(
        Long id,
        String name,
        List<Exercises> exercises
) {
}
