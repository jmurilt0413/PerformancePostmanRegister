package company.com.requests

import company.com.utils.EndPoints.registerUserPath
import company.com.utils.Headers.headers
import io.gatling.core.Predef.*
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.*

object RegisterUser {

  val PostRegisterUser: ChainBuilder =
    exec(
      http("Post - Register user")
        .post(registerUserPath)
        .headers(headers)
        .check(status is 200)
        .check(jsonPath("$.token").saveAs("accessToken"))
    )

}
