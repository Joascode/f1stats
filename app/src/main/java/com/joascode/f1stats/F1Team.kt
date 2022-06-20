package com.joascode.f1stats

data class F1Team(
    val name: String,
    val drivers: HashMap<String, Driver>,
    val color: String
)

data class Driver(
    val firstName: String,
    val lastName: String,
    val number: Short
)
