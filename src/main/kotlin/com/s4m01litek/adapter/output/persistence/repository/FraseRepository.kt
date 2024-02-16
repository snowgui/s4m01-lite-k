package com.s4m01litek.adapter.output.persistence.repository

import com.s4m01litek.adapter.output.persistence.entity.FraseEntity
import org.springframework.stereotype.Repository

@Repository
class FraseRepository(
    private val fraseJpaRepository: FraseJpaRepository
) {

    fun save(frase: FraseEntity) : Unit{
        fraseJpaRepository.save(frase)
    }

    fun list(): MutableIterable<FraseEntity>{
        val result = fraseJpaRepository.findAll()
        return result
    }
}
