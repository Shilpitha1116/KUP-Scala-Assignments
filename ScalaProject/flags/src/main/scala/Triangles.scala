import jdk.internal.joptsimple.internal.Rows

class Triangles {


  def driverFunction(flags: List[String]): Unit = {
    for (i <- flags.indices) {
      val flag = flags(i)
      if (flag(0) == '-') {
        get_flag(flag)
      }
    }
  }
  def get_flag(flag: String): String= {
    val actualFlag = Map("-t" -> "Triangle", "-dt"-> "Reverse Triangle","-lt" -> "Left Triangle", "-rt" -> "Right Triangle")
    val rows = 5
    var test = ""
    try {
      test = actualFlag(flag)
    } catch {
      case _: NoSuchElementException => println("No such flag exists"); test = "~"
    }

    test match {
      case "Triangle" => Triangle()
      case "Reverse Triangle" => ReverseTriangle()
      case "Left Triangle" => LeftTriangle()
      case "Right Triangle" => RightTriangle()
    }
   test
  }


    def Triangle(rows: Int = 5): Unit = {
      var k = 0
      var i = 1
      while (i <= rows) {
        for (space <- 1 to rows - i) {
          print("  ")
        }
        while (k != 2 * i - 1) {
          print("# ")
          k += 1
        }
        println()

        i += 1
        k = 0
      }
    }

  def ReverseTriangle(rows: Int=5):Unit={
    var i = 0
    var padding = 0
    while (i < rows) {
      var j = padding
      while (j > 0) {
        print(" ")
        j -= 1
      }

      var k = rows - i
      while (k > 0) {
        print("# ")
        k -= 1
      }

      println()
      i += 1
      padding += 1
    }
  }

    def LeftTriangle(rows: Int = 5): Unit = {
      var i = 1
      var j = 0
      for (i <- 1 to rows) {
        for (j <- 0 to i) {
          print("# ")
        }
        println("")
      }
    }

    def RightTriangle(rows: Int = 5): Unit = {
      var j: Int = 1
      while (j <= rows) {
        var i: Int = 1
        while (i <= rows - j) {
          print("  ")
          i += 1
        }
        var k: Int = 1
        while (k <= j) {
          print("# ")
          k += 1
        }
        println()
        j += 1
        k = 0
      }
    }








}
