package com.s4m01litek.adapter.output.persistence.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class FraseEntity(

    val name: String,
    val content: String,
    val createdAt: LocalDateTime,
    val origin: String? = null,
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = -1,
){
    private constructor() : this(name = "", content = "", createdAt = LocalDateTime.now())
}