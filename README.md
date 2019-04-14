# dbutils-demo
dbutils:是apache组织的一个工具类，jdbc框架，更方便使用，封装了对jdbc的操作  
## 使用步骤：
1.导入jar包（commons-dbutils-1.4.jar）  
2.创建一个 queryrunner类：操作sql语句  
  * 方法：new QueryRunner(Datasource ds)  
3.编写sql  
4.执行sql  
  * query(...):执行操作  
  * update（...）:执行cud操作
## 核心类或接口
* QueryRunner:类名  
  * 作用：操作sql语句  
  * 构造器：new QueryRunner(Datasource ds);  
  * 注意：底层会帮我们创建连接，创建语句执行者，释放资源；  
  * 常用方法：  
    * query(..);
    * update(..);  
* DbUtils:释放资源，控制事务
  * closeQuietly(conn):内部处理了异常的释放资源  
  * commitAndClose(Connection conn):提交事务并释放连接  
  。。。
* ResultSetHandler:封装结果集 （接口）查询的时候要用到结果集
    子类：9个实现类
    ArrayHandler:将查询结果的第一条记录封装成数组，返回  
    ArrayListHandler：将查询结果的每一条记录封装成数组，将每一个数组放入List中返回  
    ***BeanHandler：将查询结果的第一条记录封装成指定的bean对象，返回  
    ***BeanListHandler：将查询结果的每一条记录封装成指定的bean对象，放入List中，返回
    ColunmListHandler:将查询结果的制定一列放入list中，返回
    MapHandler：将查询结果的第一条记录封装成map,字段名作为key,值为value，返回
    *MapListHandler：将查询结果的每一条记录封装成map集合，将每一个map集合放入list返回
    *ScalarHandler：针对聚合函数，例如count(计数)返回的是一个long值
