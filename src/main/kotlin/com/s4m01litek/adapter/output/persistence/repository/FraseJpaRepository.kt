package com.s4m01litek.adapter.output.persistence.repository

import com.s4m01litek.adapter.output.persistence.entity.FraseEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FraseJpaRepository : JpaRepository<FraseEntity, Int> {
}