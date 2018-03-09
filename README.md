# 第三发Jar静态方法aop

使用AspectJ运行时织入，从而对第三方Jar中的静态方法进行切面编程。

JVM启动参数需要加上  
`-javaagent:$yourpath/aspectjweaver-1.8.13.jar`