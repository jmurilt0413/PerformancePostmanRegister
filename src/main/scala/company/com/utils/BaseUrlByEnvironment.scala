package company.com.utils

object BaseUrlByEnvironment {

  def getBaseUrl(env: String): String = env match {
    case "pre_prod" => "https://postman-integration-testing.glitch.me/"
    case "qa" => "empty"
  }
  
}
