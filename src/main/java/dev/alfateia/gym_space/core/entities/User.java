package dev.alfateia.gym_space.core.entities;

import dev.alfateia.gym_space.core.enums.Gender;
import dev.alfateia.gym_space.core.enums.Role;

public record User(Long id,
                   String name,
                   String email,
                   String password,
                   Gender gender,
                   Role role) {
}
