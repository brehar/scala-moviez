package models

case class Company(
    description: String,
    headquarters: String,
    homepage: String,
    id: Int,
    logo_path: String,
    name: String,
    origin_country: String,
    parent_company: Option[Company])
