# common-componet

这个工程打算构建日常使用的一些组件，这些组件可能初期会很简单，加以完善后会逐渐趋于生产化，计划使用Java语言来完成整个工程。

## 1、简易分流器实现

### 1.1、哈希取模法

​		通过对用户Id进行hash值，然后对hash值按100取模，接着用配置好的分流比例来与取模后的值比大小，小于的分到URL1处理request请求，大于的分到URL2处理request请求。

### 1.2、随机数法

