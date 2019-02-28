package com.zyf.app.repository;

import com.zyf.app.model.TaskZ;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskZ, String> {

}
