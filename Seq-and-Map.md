## Seq

シーケンスという一種類の型から構成される要素のコレクション。  
配列と同じように添字も利用することができる。

```sh
# 内部実装は List 型
scala> Seq(1, 2, 3)
res0: Seq[Int] = List(1, 2, 3)

# 添字でアクセス
scala> res0(0)
res1: Int = 1

# :+ 演算子で要素を追加
# :+ は算術演算子でなく、Seq が持つメソッド
scala> res0 :+ 4
res2: Seq[Int] = List(1, 2, 3, 4)
```

## Map

連想配列

```sh
#キーの型が String 型で、値の型が Int 型の Map 基本的には不変
scala> Map("key1" -> 1, "key2" -> 2)
res3: scala.collection.immutable.Map[String,Int] = Map(key1 -> 1, key2 -> 2)

# 添字でアクセス
scala> res3("key2")
res4: Int = 2

# キーと値の組み合わせを追加
scala> res3 + ("key3" -> 3)
res5: scala.collection.immutable.Map[String,Int] = Map(key1 -> 1, key2 -> 2, key3 -> 3)
```
