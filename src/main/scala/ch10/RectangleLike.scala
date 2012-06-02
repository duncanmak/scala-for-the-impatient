 trait RectangleLike {
  this: java.awt.geom.RectangularShape =>

  def translate (dx: Double, dy: Double) { 
    setFrame (getX + dy,
              getY + dy,
              getX + getWidth,
              getY + getHeight)
  }

  def grow (h: Double, v: Double) { 
    setFrame (getX + h,
              getY + v,
              getWidth  + 2 * h,
              getHeight + 2 * v)
  }
}


