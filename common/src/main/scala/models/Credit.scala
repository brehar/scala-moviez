package models

case class Credit(
    credit_type: String,
    department: String,
    job: String,
    media: Media,
    media_type: String,
    id: String,
    person: Person)

case class Media(
    id: Int,
    name: String,
    original_name: String,
    character: String,
    episodes: Array[Any],
    seasons: Array[Season])

case class Season(air_date: String, poster_path: String, season_number: Int)
