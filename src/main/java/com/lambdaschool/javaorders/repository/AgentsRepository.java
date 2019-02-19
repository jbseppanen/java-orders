package com.lambdaschool.javaorders.repository;

import com.lambdaschool.javaorders.models.Agents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentsRepository extends JpaRepository<Agents, Long> {
}