package com.headlines.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.headlines.ms.model.HeadLineEntity;
import com.headlines.ms.repository.IHeadLineRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeadLineServiceImpl implements IHeadLineService {

	@Autowired
	IHeadLineRepository repository;
	
	@Override
	public Flux<HeadLineEntity> allHeadLines() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mono<HeadLineEntity> saveHeadLine(HeadLineEntity headLine) {
		// TODO Auto-generated method stub
		return repository.save(headLine);
	}

	@Override
	public Mono<HeadLineEntity> updHeadLine(HeadLineEntity headLine) {
		// TODO Auto-generated method stub
		return repository.save(headLine);
	}

	@Override
	public Mono<Void> dltHeadLine(String id) {
		// TODO Auto-generated method stub
		return repository.deleteById(id);
	}

}
