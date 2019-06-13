package util

object SharedMessages {
  private final val API_KEY: Option[String] = sys.env.get("MOVIEDB_API_KEY")
  private final val BASE_URL: String = "https://api.themoviedb.org/3"

  def generateRequestUrl(searchType: SearchTypes.Value, id: String): String =
    s"$BASE_URL/$searchType/$id?api_key=${API_KEY.get}"
}
