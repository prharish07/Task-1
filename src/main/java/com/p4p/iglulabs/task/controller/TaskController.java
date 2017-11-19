package com.p4p.iglulabs.task.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController;

import com.p4p.iglulabs.task.dto.*; 
import com.p4p.iglulabs.task.model.Task;
import com.p4p.iglulabs.task.repository.TaskRepository;

 

import com.p4p.iglulabs.task.common.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class TaskController { 
	@Autowired
	TaskRepository taskRepository;
	 
	
	@Produces(MediaType.APPLICATION_JSON)
	@RequestMapping(value = { "/getTask" }, method = {RequestMethod.POST})
	public  ResponseEntity<List<Task>> getTaskBySubject(
			ModelMap model,HttpServletRequest request,@RequestBody TaskDTO dto) { 
        List<Task> tasksList = taskRepository.findBySubject(dto.getTaskDesc());	 
        return new ResponseEntity<List<Task>>(tasksList, HttpStatus.OK); 
	}
	
	@RequestMapping("/getAllTasks")
	public ResponseEntity<List<Task>> getAllTasks(Map<String, Object> model ,ModelMap modelMap) { 
		String result = ""; 
		List<Task> resultList=new ArrayList<>();
        for(Task task : taskRepository.findAll()){
            //result += task.toString() + "</br>";
            resultList.add(task); 
        } 
        return new ResponseEntity<List<Task>>(resultList, HttpStatus.OK); 
	}
	 
	@RequestMapping(value = { "/saveTasks" }, method = {RequestMethod.POST})
	public ResponseEntity<List<Task>> saveTasks(@RequestBody TaskDTO dto) {
		 
		
		Date currentDate=CommonMethods.getCurrentDate();
		String currentTime=CommonMethods.getCurrentTime();
		
		
		Task t1=new Task();
		t1.setSubject(dto.getTaskDesc());
		t1.setObjective(dto.getObjective());
		t1.setChDate(currentDate);
		t1.setCrDate(currentDate);
		t1.setChTime(currentTime);
		t1.setCrTime(currentTime);
		 
		
		//taskRepository.save(new Task("DemoTask","Demo Objective",currentTime,currentDate,currentTime,currentDate,"Demo comments",currentDate,currentTime,currentDate,currentTime));
		taskRepository.save(t1);
		
		List<Task> resultList=new ArrayList<>();
        for(Task task : taskRepository.findAll()){
            //result += task.toString() + "</br>";
            resultList.add(task); 
        } 
        return new ResponseEntity<List<Task>>(resultList, HttpStatus.OK); 
         
         
	}
	
	@RequestMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable String id) {
		 System.out.println("inside The Delete By ID : "+id);
		 
		Optional<Task> tasksList=taskRepository.findById(Long.parseLong(id));
		
		System.out.println("tasksList :"+tasksList.toString());
		
		try{
			if(tasksList !=null)
			{
				System.out.println("Deleting it");
				taskRepository.deleteById(Long.parseLong(id));
				 
				System.out.println("Deleted Sucessfully");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return new ResponseEntity<String>("Unable to Delete", HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<String>("Successfully Deleted", HttpStatus.OK);
         
	} 
	 
}
