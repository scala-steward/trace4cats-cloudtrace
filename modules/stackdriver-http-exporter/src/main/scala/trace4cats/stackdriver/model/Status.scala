package trace4cats.stackdriver.model

import io.circe.{Encoder, JsonObject}
import io.circe.generic.semiauto._

case class Status(code: Int, message: String = "", details: List[JsonObject] = List.empty)

object Status {
  implicit val encoder: Encoder[Status] = deriveEncoder
}
