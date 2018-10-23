object PrintBits extends App {
  def printBits(num: Int) = {
    for (i <- 31 to 0 by -1) {
      if ((num & (1 << i)) != 0) print("1") else print("0")
    }
  }

  printBits(10)
  printBits(1)
  printBits(-1)
  printBits(256)
}