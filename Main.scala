import processing.core
import processing.core.*
import processing.core.PApplet

@main def example(): Unit = PApplet.main("Main")

class Main extends PApplet:

  override def settings(): Unit =
    size(400, 400)

  override def draw(): Unit =
    line(150, 25, mouseX.toFloat, mouseY.toFloat)
