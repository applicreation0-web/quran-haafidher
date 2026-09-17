package com.quran.haafidher.core.progression

/** Etat d'un passage dans le parcours de progression. */
enum class PassageState {
    NEW,
    LEARNING,
    REINFORCING,
    STABLE,
    REVIEW_NEEDED
}
