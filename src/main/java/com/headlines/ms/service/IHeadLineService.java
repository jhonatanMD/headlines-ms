package com.headlines.ms.service;

import com.headlines.ms.model.HeadLineEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IHeadLineService  {

	Flux<HeadLineEntity> allHeadLines();
	Mono<HeadLineEntity> saveHeadLine(HeadLineEntity headLine);
	Mono<HeadLineEntity> updHeadLine(HeadLineEntity headLine);
	Mono<Void> dltHeadLine(String id);
	
}
