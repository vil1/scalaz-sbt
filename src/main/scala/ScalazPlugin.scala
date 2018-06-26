package scalaz.build

import sbt._, Keys._

object ScalazPlugin extends AutoPlugin {

  override def buildSettings = 
    Compilation.buildSettings ++ 
    Seq(
      organization := "org.scalaz"
    )

  override def projectSettings = 
    Compilation.projectSettings
}
