package dev.alfateia.gym_space.core.entities;

import java.util.List;

public record Personal(String cpf,
                       List<Long> clientsId,
                       List<Long> groupsId,
                       String description,
                       float score,
                       List<Long> trainingPlanId,
                       List<Long> exercisesId) {

}
