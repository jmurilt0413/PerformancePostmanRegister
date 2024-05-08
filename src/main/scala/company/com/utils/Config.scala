package company.com.utils

import company.com.utils.BaseUrlByEnvironment.getBaseUrl

object Config {
  
 val environmentDefault: String = "pre_prod"
 val environmentExecuion: String = sys.props.getOrElse("env", environmentDefault)
 val urlBase: String = getBaseUrl(environmentExecuion)

}
