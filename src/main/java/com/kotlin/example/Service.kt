package com.kotlin.example

import org.springframework.stereotype.Component
import java.util.Optional
import org.springframework.http.ResponseEntity

@Component
class Service(var repository: Repository) {

	fun save(model: Model): Model = repository.save(model)

	fun getAll(): MutableIterable<Model> = repository.findAll()
	
	fun getById(id:Long): Optional<Model> = repository.findById(id)
	
	fun deleteById(id:Long)= repository.deleteById(id)
}