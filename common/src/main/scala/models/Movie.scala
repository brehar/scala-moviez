package models

import java.util.Date

case class Movie(
    adult: Boolean,
    backdrop_path: Option[String],
    belongs_to_collection: Option[Object],
    budget: Int,
    genres: Array[Genre],
    homepage: Option[String],
    id: Int,
    imdb_id: Option[String],
    original_language: String,
    original_title: String,
    overview: Option[String],
    popularity: Number,
    poster_path: Option[String],
    production_companies: Array[Company],
    production_countries: Array[Country],
    release_date: Date,
    revenue: Int,
    runtime: Option[Int],
    spoken_languages: Array[Language],
    status: Status,
    tagline: Option[String],
    video: Boolean,
    vote_average: Number,
    vote_count: Int)

case class Country(iso_3166_1: String, name: String)

case class Language(iso_639_1: String, name: String)

class Status extends Enumeration {
  val Rumored, Planned, In_Production, Post_Production, Released, Canceled = Value
}
