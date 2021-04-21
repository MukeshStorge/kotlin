package com.kotlin.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("/api")
class Controller(var service: Service) {

	@PostMapping("/save")
	fun save(@RequestBody model: Model): Model = service.save(model)

	@GetMapping("/getAll")
	fun getAll(): MutableIterable<Model> = service.getAll()

	@GetMapping("/getById/id/{id}")
	fun getById(@PathVariable id: Long): Optional<Model> = service.getById(id)
	
	@DeleteMapping("/deleteById/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long)=service.deleteById(id)

}