package com.example.uygulama12

import javax.inject.Inject

class GetFlagsUseCase @Inject constructor(private val flagsRepository: FlagsRepostory) {
    suspend operator fun invoke(): List<FlagsModel>
    = flagsRepository.getAllFlags()

    }

