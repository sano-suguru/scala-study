object PrintFactorization extends App {
  // 関数を引数として渡せる
  Seq(32, 25, 90, 510510).map(Factorization.factorization).map(println)
}
