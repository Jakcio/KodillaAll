package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public interface Repository {
    boolean create(Item item, User user, LocalDateTime orderTime);
}
