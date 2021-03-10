val values = List(1,2,3,4,5)
val len=values.length
val last =len-1

for (v <- 0 to last){
  if(v == last){
    print(s"The indexed value is $v , The value is ${values(v)}")
  }
}

