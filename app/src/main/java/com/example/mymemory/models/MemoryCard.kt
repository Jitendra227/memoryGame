package com.example.mymemory.models

import androidx.constraintlayout.solver.SolverVariableValues

data class MemoryCard (
    val identifier: Int,
    var isFaceUp: Boolean = false,
    var isMatched:Boolean = false

)