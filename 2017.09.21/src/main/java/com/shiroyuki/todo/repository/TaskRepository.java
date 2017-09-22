package com.shiroyuki.todo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shiroyuki.todo.model.Task;

@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
    List<Task> findBySummary(@Param("summary") String summary);
}
