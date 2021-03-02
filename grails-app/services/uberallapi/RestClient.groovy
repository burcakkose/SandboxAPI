package uberallapi

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.client.annotation.Client

@Header(name="privateKey",value="aGQZ9qMJmh2QOWGmuNw0RhZvPcN4Lmt4FUFdIc4ltf6d0Bopeq2IuhyGB3ihr1P9")
@Client("https://sandbox.uberall.com/")
interface RestClient {
    @Get("api/locations?max=100")
    ResponseSearch getData()
}