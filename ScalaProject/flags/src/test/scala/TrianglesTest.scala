import org.scalatest.flatspec.AnyFlatSpec

class TrianglesTest extends AnyFlatSpec {

  val obj = new Triangles

  /**
   *Testcases for correct outputs
   * */

  "-t" should "should return String Triangle and print a Triangle" in {
    assert(obj.get_flag("-t") === "Triangle")
  }
  "-dt" should "should return String Reverse Triangle and print a Reverse Triangle" in {
    assert(obj.get_flag("-dt") === "Reverse Triangle")
  }
  "-lt" should "should return String Left Triangle and print a Left Triangle" in {
    assert(obj.get_flag("-lt") === "Left Triangle")
  }
  "-rt" should "should return character Right Triangle and print a Right Triangle" in {
    assert(obj.get_flag("-rt")==="Right Triangle")
  }


  /**
   *Testcases for incorrect outputs
   * */

  "-t" should "should not return any other String than Triangle" in {
    assert(obj.get_flag("-t") !== "Square")
  }
  "-dt" should "should not return any other string than Reverse Triangle" in {
    assert(obj.get_flag("-dt") !== "Square")
  }
  "-lt" should "should not return any other String than Left Triangle" in {
    assert(obj.get_flag("-lt") !== "Triangle")
  }
  "-rt" should "should not return any other character than 'RightTriangle'" in {
    assert(obj.get_flag("-rt") !== "Triangle")
  }

}

