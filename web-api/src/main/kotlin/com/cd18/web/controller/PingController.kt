package com.cd18.web.controller

import com.cd18.common.http.response.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {
    @GetMapping("/ping")
    fun ping(): ApiResponse<String> {
        return ApiResponse(result = "pong")
    }
}
