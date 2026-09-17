package com.quran.haafidher.core.progression

import java.time.LocalDate

data class Passage(
    val id: String,
    val startReference: String,
    val endReference: String,
    val createdAt: LocalDate,
    val state: PassageState = PassageState.NEW,
    val repetitionCount: Int = 0,
    val successRate: Float = 0f
)
