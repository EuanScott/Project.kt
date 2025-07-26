package com.example.projectkt.screen.main.repository

interface CounterRepository {
    suspend fun getCounter(): Int
    suspend fun incrementCounter()
}

class CounterRepositoryImpl : CounterRepository {
    private var counter: Int = 0

    override suspend fun getCounter(): Int {
        return counter
    }

    override suspend fun incrementCounter() {
        counter++
    }
}