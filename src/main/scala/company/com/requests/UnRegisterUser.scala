package company.com.requests


import company.com.utils.EndPoints.unRegisterUserPath
import company.com.utils.Headers.{contentTypeKey, contentTypeValue, headers}
import io.gatling.core.Predef.*
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.*

object UnRegisterUser {

  val unRegisterUser: ChainBuilder =
    exec(
      http("Post - Unregister user")
        .post(unRegisterUserPath)
        .headers(headers.updated(contentTypeKey, contentTypeValue) )
        .body(ElFileBody("company/com/bodies/unregister.txt"))
        .check(status is 200)
    )

}
