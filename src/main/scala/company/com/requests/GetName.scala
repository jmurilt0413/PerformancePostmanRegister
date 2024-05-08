package company.com.requests

import company.com.utils.EndPoints.getNamePath
import company.com.utils.Headers.headers
import io.gatling.core.Predef.*
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.*

object GetName {

  val getNameUser: ChainBuilder =
    exec(
      http("GET - Name user")
        .get(getNamePath)
        .headers(headers)
        .check(status is 200)
        .check(jsonPath("$.name").ofType[String])

    )

}
