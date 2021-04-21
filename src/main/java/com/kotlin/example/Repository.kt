package com.kotlin.example

import org.springframework.data.repository.CrudRepository

interface Repository : CrudRepository<Model, Long>