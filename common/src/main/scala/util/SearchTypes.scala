package util

object SearchTypes extends Enumeration {
  val Companies: SearchTypes.Value = Value("company")
  val Credits: SearchTypes.Value = Value("credit")
  val Genres: SearchTypes.Value = Value("genre")
  val Movies: SearchTypes.Value = Value("movie")
  val People: SearchTypes.Value = Value("person")
  val Reviews: SearchTypes.Value = Value("review")
}
