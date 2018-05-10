![](https://img.shields.io/badge/cost-logger-lightgrey.svg?colorA=d9d0c7&colorB=9fe0f6)
## 前言
- 在平常项目中，偶尔会对某些方法的耗时进行打印观察
- 观察到很多开发者的做法是，在方法中加入代码来进行耗时打印，例如:
	```java
	public void function() {
        long start = System.currentTimeMillis();

        // do something...

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
		
	```
- 以上这种做法嵌入到了业务逻辑中,看上去不够优雅。在测试结束后需要删除，如果一不小心忘记删除，那将会比较尴尬。
- 但如果我们想在开发中打印(通常日志为debug级别)，而生产环境中不打印(通常日志为info或更高级)，可能就会如下:
 	```java
	public void function() {
        long start = System.currentTimeMillis();

        // do something...

        long end = System.currentTimeMillis();
        Logger.debug(end - start);
    }
		
	```
- 但终究还是嵌入到业务逻辑了
- 到此，我们想到了AOP思想，就有了cost-logger。

## 项目介绍
- 用于打印方法耗时日志
- 可配置打印日志级别
- 可配置打印语言(目前有EN、CN)
- 可配置超时打印(方法耗时超过预设值才打印)
- 打印内容可加备注信息
- 日志格式依赖于使用者在springboot项目中配置的日志输出格式

## 快速入门
1. 加入maven依赖
	```xml
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-aop</artifactId>
	</dependency>
	```
2. 引入CostLogger、CostLoggerInterceptor这两个类
3. 在需要打印日志的方法上加上@CostLogger
	```java
	@CostLogger
    public void function() {
		//do something...
    }
	```
4. 正常运行项目即可

## 示例
- 在本项目中的com.yeauty.service.impl.ShowServiceImpl有注解展示
![](https://i.imgur.com/crph7vG.png)
- 在com.yeauty.CostLoggerApplicationTests进行单元测试
![](https://i.imgur.com/wqDvz62.png)
- 结果如下
![](https://i.imgur.com/io0zurE.png)