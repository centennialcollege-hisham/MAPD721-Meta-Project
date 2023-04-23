package com.example.data.repoistory.openai

import com.example.data.model.gpt.chat.ChatRequest
import com.example.data.model.gpt.chat.ChatResponse
import com.example.data.model.gpt.completion.CompletionsRequest
import com.example.data.model.gpt.image.ImagesGenerationsRequest
import com.example.data.model.gpt.image.ImagesGenerationsResponse
import com.example.data.gpt.GptDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OpenaiRepository @Inject constructor(private val openaiService: GptDataSource) {

    suspend fun chatCompletions(request: ChatRequest): ChatResponse {
        return openaiService.chatCompletions(request)
    }

    suspend fun completions(request: CompletionsRequest): ChatResponse {
        return openaiService.completions(request)
    }

    suspend fun imagesGenerations(request: ImagesGenerationsRequest): ImagesGenerationsResponse {
        return openaiService.imagesGenerations(request)
    }

}


