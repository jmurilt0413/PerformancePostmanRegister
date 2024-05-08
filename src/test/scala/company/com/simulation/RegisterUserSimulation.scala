package company.com.simulation

import company.com.requests.GetName.getNameUser
import company.com.requests.RegisterUser.PostRegisterUser
import company.com.requests.UnRegisterUser.unRegisterUser
import company.com.utils.SimulationBase
import io.gatling.core.Predef.*
import io.gatling.core.structure.{PopulationBuilder, ScenarioBuilder}

class RegisterUserSimulation extends SimulationBase {

  val registerUser: ScenarioBuilder =
    scenario("User Register with API Postman")
      .exec(PostRegisterUser)
      .exec(getNameUser)
      .exec(unRegisterUser)

  val setUpRegisterUserSimulation: PopulationBuilder = registerUser.inject(atOnceUsers(1))

  setUp(setUpRegisterUserSimulation)
    .protocols(httpProtocol)
    .assertions(
      global.responseTime.mean.lte(3500),
      global.successfulRequests.percent.is(100)
    )

}
