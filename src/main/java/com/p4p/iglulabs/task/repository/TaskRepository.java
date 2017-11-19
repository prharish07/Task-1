package com.p4p.iglulabs.task.repository;
 
import com.p4p.iglulabs.task.model.Task;

import java.util.List;
import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
public interface TaskRepository extends CrudRepository<Task, Long>  {

	List<Task> findBySubject(String Subject);
    
    List<Task> findAll();
    
     
    

}
