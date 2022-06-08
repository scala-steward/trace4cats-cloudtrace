package trace4cats.stackdriver.project

import cats.Applicative

object StaticProjectIdProvider {
  def apply[F[_]: Applicative](pid: String): ProjectIdProvider[F] =
    new ProjectIdProvider[F] {
      override val projectId: F[String] = Applicative[F].pure(pid)
    }
}
