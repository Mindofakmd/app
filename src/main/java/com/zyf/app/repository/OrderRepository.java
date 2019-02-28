package com.zyf.app.repository;

import com.zyf.app.model.OrderZ;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<OrderZ, String> {

    List<OrderZ> findByNodeId(String nodeId);

    List<OrderZ> findByTaskId(String taskId);

}
