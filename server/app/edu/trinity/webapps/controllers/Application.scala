package edu.trinity.webapps.controllers

import javax.inject._

import edu.trinity.webapps.shared.SharedMessages
import play.api.mvc._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("What happens?"))//SharedMessages.itWorks))
  }
  
  def multTable = Action {
    Ok(views.html.multTable(12))
  }

}
