# cmdmybatis
mybatis compiled by java cmd.

我们现在一般都会使用eclipse工具来开发java应用

本项目我直接在命令行进行编译 达到真正熟悉的目的

# 1.dir   *.java/s/b   >   srclist.txt

# 2. javac -classpath "F:\code\java\jichu\ch7\main\java\cglib-nodep-2.1_3.jar;F:\code\java\jichu\ch7\main\java\javassist-3.18.0-GA.jar;F:\code\java\jichu\ch7\main\java\log4j-core-2.2.jar;F:\code\java\jichu\ch7\main\java\log4j-api-2.2.jar;F:\code\java\jichu\ch7\main\java\log4j-1.2.17.jar;F:\code\java\jichu\ch7\main\java\ognl-3.2.7.jar;F:\code\java\jichu\ch7\main\java\slf4j-api-1.7.21.jar;F:\code\java\jichu\ch7\main\java\commons-logging-1.2.jar;F:\code\java\jichu\ch7\main\java\slf4j-nop-1.7.21.jar;F:\code\java\jichu\ch7\main\java\mysql-connector-java-5.1.39-bin.jar"  @srclist.txt

# 3. java -classpath ".;F:\code\java\jichu\ch7\main\java\cglib-nodep-2.1_3.jar;F:\code\java\jichu\ch7\main\java\javassist-3.18.0-GA.jar;F:\code\java\jichu\ch7\main\java\log4j-core-2.2.jar;F:\code\java\jichu\ch7\main\java\log4j-api-2.2.jar;F:\code\java\jichu\ch7\main\java\log4j-1.2.17.jar;F:\code\java\jichu\ch7\main\java\ognl-3.2.7.jar;F:\code\java\jichu\ch7\main\java\slf4j-api-1.7.21.jar;F:\code\java\jichu\ch7\main\java\commons-logging-1.2.jar;F:\code\java\jichu\ch7\main\java\slf4j-nop-1.7.21.jar;F:\code\java\jichu\ch7\main\java\mysql-connector-java-5.1.39-bin.jar"  MybatisTest