# dbutils-demo
dbutils:是apache组织的一个工具类，jdbc框架，更方便使用，封装了对jdbc的操作  
## 使用步骤：
1.导入jar包（commons-dbutils-1.4.jar）  
2.创建一个 queryrunner类：操作sql语句  
** 方法：new QueryRunner(Datasource ds)  
3.编写sql  
4.执行sql  
** query(...):执行操作  
** update（...）:执行cud操作
