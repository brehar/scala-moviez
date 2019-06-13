package models

case class Person(
    birthday: Option[String],
    known_for_department: String,
    deathday: Option[String],
    id: Int,
    name: String,
    also_known_as: Array[String],
    gender: Int,
    biography: String,
    popularity: Number,
    place_of_birth: Option[String],
    profile_path: Option[String],
    adult: Boolean,
    imdb_id: String,
    homepage: Option[String])
