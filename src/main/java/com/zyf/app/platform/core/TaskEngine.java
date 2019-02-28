package com.zyf.app.platform.core;

import com.zyf.app.model.NodeZ;
import com.zyf.app.model.OrderZ;
import com.zyf.app.model.TaskZ;
import com.zyf.app.repository.NodeRepository;
import com.zyf.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Comparator;
import java.util.List;

public class TaskEngine {
    @Autowired
    private NodeRepository nodeRepository;
    @Autowired
    private OrderRepository orderRepository;


    private TaskZ task;

    TaskEngine(TaskZ task){
        this.task = task;
    }

    public void loadTask(){
        String uuid = task.getUuid();
        List<NodeZ> nodes = nodeRepository.findByTaskId(uuid);
        List<OrderZ> orders = orderRepository.findByTaskId(uuid);
        task.setNodes(nodes);
        for(NodeZ node: nodes){
            for(OrderZ order:orders){
                if(order.getNodeId().equals(node.getUuid())){
                    node.getOrders().add(order);
                }
            }
        }

    }

    public void excuteTask(){

    }

    public void starting(){
        if(this.task == null) {

        }

        loadTask();
        excuteTask();
    }

    public TaskZ getTask() {
        return task;
    }

    public void setTask(TaskZ task) {
        this.task = task;
    }
}
