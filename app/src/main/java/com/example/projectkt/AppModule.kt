package com.example.projectkt

import com.example.projectkt.screen.main.repository.CounterRepository
import com.example.projectkt.screen.main.repository.CounterRepositoryImpl
import com.example.projectkt.screen.main.usecase.CounterUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideCounterRepository(): CounterRepository {
        return CounterRepositoryImpl()
    }

    @Provides
    fun provideCounterUseCase(repository: CounterRepository): CounterUseCase {
        return CounterUseCase(repository)
    }
}