#####测试:
访问 zuul
http://localhost:8769/api-b/hi?name=bb
http://localhost:8769/api-a/hi?name=aa

测试过滤器
http://localhost:8769/api-b/hi?name=bb
http://localhost:8769/api-b/hi?name=bb&token=aaa