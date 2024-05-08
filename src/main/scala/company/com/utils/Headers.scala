package company.com.utils

object Headers {

  val acceptKey: String = "Accept"
  val contentTypeKey: String = "Content-Type"
  val acceptEncondingKey: String = "Accept-Encoding"
  val acceptValue: String = "*/*"
  val acceptEncodingValue: String = "gzip, deflate, br"
  val contentTypeValue: String = "application/json"

  val headers = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Connection" -> "Keep-alive"
  )

}
