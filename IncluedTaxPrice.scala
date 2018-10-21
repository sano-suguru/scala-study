object IncluedTaxPrice extends App {
  def incluedTaxPrice(n: Int): Int = (n * 1.08).toInt
  val price = 129512
  println(s"税込価格は${incluedTaxPrice(price)}円です。")
}