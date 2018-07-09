package scalaz.build

import sbt._
import Keys._
import de.heikoseeberger.sbtheader.HeaderPlugin
import org.scalafmt.sbt.ScalafmtPlugin

object ScalazPlugin extends AutoPlugin {

  override def trigger = allRequirements

  override def requires = HeaderPlugin && ScalafmtPlugin

  override def buildSettings =
    Compilation.buildSettings ++
      Publication.buildSettings ++
      Seq(
        organization := "org.scalaz",
        organizationName := "Scalaz",
        startYear := Some(2018),
        licenses += ("Apache-2.0", new URL(
          "https://www.apache.org/licenses/LICENSE-2.0.txt"
        ))
      )

  override def projectSettings =
    Compilation.projectSettings
}
