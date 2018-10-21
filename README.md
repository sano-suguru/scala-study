# scala-study

## Javaバージョン

```sh
java -version

java version "1.8.0_191"
Java(TM) SE Runtime Environment (build 1.8.0_191-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.191-b12, mixed mode)
```

## sbt REPL起動

```sh
sbt console

[info] Loading project definition from /Users/sano/Desktop/workspace/scala-study/project
[info] Set current project to scala-study (in build file:/Users/sano/Desktop/workspace/scala-study/)
[info] Starting scala interpreter...
Welcome to Scala 2.12.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_191).
Type in expressions for evaluation. Or try :help.
```

## sbt を立ち上げたままでの実行

```sh
sbt
[info] Loading project definition from /Users/sano/Desktop/workspace/scala-study/project
[info] Set current project to scala-study (in build file:/Users/sano/Desktop/workspace/scala-study/)
[info] sbt server started at local:///Users/sano/.sbt/1.0/server/853f737999cc0b4862db/sock
sbt:scala-study>
```

```sh
run
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list

Multiple main classes detected, select one to run:

 [1] Distance
 [2] FizzBuzz
 [3] Main

Enter number: 1

[info] Running Distance
走った距離は18キロメートルです
[success] Total time: 7 s, completed 2018/10/21 16:39:08
```

`sbt run` という風に sbt を立ち上げずに実行しても同じ結果
sbt を立ち上げたままの方が早い

終了は `exit`
