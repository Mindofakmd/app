package com.zyf.app.repository;

import com.zyf.app.model.NodeZ;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NodeRepository extends CrudRepository<NodeZ, String> {

    List<NodeZ> findByTaskId(String taskId);

}
