object Distance extends App {
  val kmPerHour = 11
  val minutes = 100
  val distance = kmPerHour * minutes / 60
  println(s"走った距離は${distance}キロメートルです")
}