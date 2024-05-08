package company.com.utils

import company.com.utils.Config.urlBase
import io.gatling.core.Predef.*
import io.gatling.http.Predef.*
import io.gatling.http.protocol.HttpProtocolBuilder

trait SimulationBase extends Simulation {
  
  val httpProtocol: HttpProtocolBuilder =  http
    .baseUrl(urlBase)

}
