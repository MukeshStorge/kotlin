package com.kotlin.example

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(schema = "postgres", name = "sample")
data class Model(
	
    @Id var id: Long? = 0,
    
	var title: String? = null,
    
	var name: String? = null,
    
	var pan: String? = null,
    
	var remarks: String? = null

)