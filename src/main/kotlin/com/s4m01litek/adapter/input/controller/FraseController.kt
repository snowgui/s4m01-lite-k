package com.s4m01litek.adapter.input.controller

import com.s4m01litek.adapter.output.persistence.entity.FraseEntity
import com.s4m01litek.adapter.output.persistence.repository.FraseRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("frase")
class FraseController(
    private val fraseRepository: FraseRepository
) {

    @GetMapping("")
    fun list() : MutableIterable<FraseEntity> {
        val result = fraseRepository.list()
        return result
    }

    @GetMapping("save")
    fun post() : Unit {
        val frase = FraseEntity(
            name = "Name01",
            content = "conteúdo da frase",
            createdAt = LocalDateTime.now()
        )

        fraseRepository.save(frase)
    }

    @GetMapping("test")
    fun test(): String = "Testando!"
}
