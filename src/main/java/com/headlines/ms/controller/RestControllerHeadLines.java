package com.headlines.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.headlines.ms.model.HeadLineEntity;
import com.headlines.ms.service.HeadLineServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
public class RestControllerHeadLines {

	@Autowired
	HeadLineServiceImpl headLineImple;
	
	@GetMapping("/getHeadLines")
	public Flux<HeadLineEntity> getHeadLines() {		
		return headLineImple.allHeadLines();
	}
	
	@PostMapping("/postHeadLine")
	public Mono<HeadLineEntity> postHeadLine(@RequestBody HeadLineEntity headLine){
		
		
		return headLineImple.saveHeadLine(headLine);
	}
	
	@PutMapping("/updHeadLine")
	public Mono<HeadLineEntity> updHeadLine(@RequestBody HeadLineEntity headLine){
		
		return headLineImple.updHeadLine(headLine);
	}
	
	@DeleteMapping("/dltHeadLine/{id}")
	public Mono<Void> dltHeadLine(@PathVariable  String id){
		
		return headLineImple.dltHeadLine(id);
	}
	
}
