package models

case class Review(
    id: String,
    author: String,
    content: String,
    iso_639_1: String,
    media_id: Int,
    media_title: String,
    media_type: String,
    url: String)
