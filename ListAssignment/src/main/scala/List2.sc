var values = List(1,2,3,4,5,6,7,8,9)
for(v <- values){
  println(s"Table of $v")
  for (i <- 1 to 10){
    println(s"$v x $i = ${v*i}")
  }
}