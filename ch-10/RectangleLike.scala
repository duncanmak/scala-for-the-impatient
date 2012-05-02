 trait RectangleLike[T] {
  var x: T
  var y: T
  var width: T
  var height: T

  def translate (dx: T, dy: T) (implicit numeric: Numeric[T]) { 
    x = numeric.plus (x, dx)
    y = numeric.plus (y, dy)
  }

  def grow (h: T, v: T) (implicit numeric: Numeric[T]){ 
    x = numeric.minus (x, h)
    y = numeric.minus (y, v)
    width = numeric.plus (width, numeric.times (numeric.fromInt (2), h))
    height = numeric.plus (height, numeric.times (numeric.fromInt (2), v))
  }
}


