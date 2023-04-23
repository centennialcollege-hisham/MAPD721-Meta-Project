package com.example.data.gpt

import com.example.data.model.gpt.chat.ChatRequest
import com.example.data.model.gpt.chat.ChatResponse
import com.example.data.model.gpt.completion.CompletionsRequest
import com.example.data.model.gpt.image.ImagesGenerationsRequest
import com.example.data.model.gpt.image.ImagesGenerationsResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import javax.inject.Singleton

@Singleton
interface GptDataSource  {

    @Headers(
        "Content-Type:application/json",
        "Authorization:Bearer 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",
        "OpenAI-Organization: org-1Y3N6w7OMxstG1alf870iZPo"
    )
    @POST("chat/completions")
    suspend fun chatCompletions(@Body body: ChatRequest): ChatResponse


    @Headers(
        "Content-Type:application/json",
        "Authorization:Bearer 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",
        "OpenAI-Organization: org-1Y3N6w7OMxstG1alf870iZPo"
    )
    @POST("completions")
    suspend fun completions(@Body body: CompletionsRequest): ChatResponse


    @Headers(
        "Content-Type:application/json",
        "Authorization:Bearer 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",
        "OpenAI-Organization: org-1Y3N6w7OMxstG1alf870iZPo"
    )
    @POST("images/generations")
    suspend fun imagesGenerations(@Body body: ImagesGenerationsRequest): ImagesGenerationsResponse




}