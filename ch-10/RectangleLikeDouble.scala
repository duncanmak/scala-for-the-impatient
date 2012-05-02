trait RectangleLikeDouble {
  this: {
    var x: Double
    var y: Double
    var width: Double
    var height: Double
  } =>
          
  //
  // public void translate(int dx, int dy) 
  //
  // Translates this Rectangle the indicated distance, to the right
  // along the X coordinate axis, and downward along the Y coordinate
  // axis.
  //
  def translate (dx: Double, dy: Double) { 
    x = x + dx
    y = y + dy
  }

  // 
  // public void grow(int h, int v)
  // 
  // Resizes the Rectangle both horizontally and vertically.
  // This method modifies the Rectangle so that it is h units larger on both the left and right side, and v units larger at both the top and bottom.
  //
  // The new Rectangle has (x - h, y - v) as its upper-left corner, width of (width + 2h), and a height of (height + 2v).
  //
  // If negative values are supplied for h and v, the size of the
  // Rectangle decreases accordingly. The grow method will check for
  // integer overflow and underflow, but does not check whether the
  // resulting values of width and height grow from negative to
  // non-negative or shrink from non-negative to negative.
  // 
  def grow (h: Double, v: Double) {
    x      = x - h
    y      = y - v
    width  = width + 2 * h
    height = height + 2 * v
  }
}


