// Copyright (C) 2017 Anduin Transactions, Inc.

package anduin.scalajs.react.apollo.internal

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// scalastyle:off underscore.import
import japgolly.scalajs.react.raw._
// scalastyle:on underscore.import

@JSImport("react-apollo", JSImport.Namespace, "ReactApollo")
@js.native
object ReactApollo extends js.Object {

  def graphql(query: Query): js.Function1[js.Any, js.Any] = js.native

  def getDataFromTree(component: ReactElement): js.Promise[Undefined] = js.native
  def renderToStringWithData(component: ReactElement): js.Promise[String] = js.native
}
