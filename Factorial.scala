import scala.math.BigInt

object FactorialTailRec extends App {
  def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else factorial(i - 1, i * acc)
  println(factorial(10000, 1))
}

// 再帰関数の戻り値が必ず再帰関数の呼び出し、または、値となるように再帰関数を実装すると、内部的にループの表現に変換される末尾再帰最適化が行われる