package org.acme

import javax.ws.rs.*
import javax.ws.rs.core.HttpHeaders
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    suspend fun hello() = "Hello from RESTEasy Reactive"


    @POST
    suspend fun streamUrl(
        @HeaderParam(HttpHeaders.USER_AGENT)
        userAgent: String,
        @HeaderParam(HttpHeaders.AUTHORIZATION)
        authorization: String,
        @HeaderParam("X-Device-Token")
        deviceToken: String?,
        @HeaderParam("X-Forwarded-For")
        forwardedFor: String?,
        @HeaderParam("X-Correlation-Id")
        correlationId: String?,
        request: StreamUrlRequest): Response
    {
        return Response.ok().build()
    }

    data class StreamUrlRequest(
        val name: String?
    )
}
