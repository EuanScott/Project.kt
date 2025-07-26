package com.example.projectkt.screen.main.usecase

import com.example.projectkt.screen.main.repository.CounterRepository

class CounterUseCase(private val repository: CounterRepository) {
    suspend fun getCounter(): Int {
        return repository.getCounter()
    }

    suspend fun incrementCounter() {
        repository.incrementCounter()
    }
}