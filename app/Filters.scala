import javax.inject.Inject

import play.api.http.HttpFilters
import play.filters.cors.CORSFilter
//allow for cors
class Filters @Inject() (corsFilter: CORSFilter) extends HttpFilters {
  def filters = Seq(corsFilter)
}