应用名                 端口          请求地址                                作用
config-client          8881
config-server          8888         
eureka-client          8762         http://localhost:8762/hi?name=forezp     服务提供者。提供一个服务到8761的注册中心
eureka-client-copy     8763         http://localhost:8763/hi?name=forezp     服务提供者。提供一个服务到8762的注册中心
eureka-server          8889
eureka-service         8761         http://localhost:8761/                   服务注册中心。service注册中心  接收eureka-client服务的注册
service-feign          8765         http://localhost:8765/hi?name=zhangsan   服务消费者。注册到8762的注册中心，负载请求8762，8763接口
                                    http://localhost:8765/hystrix            断路器仪表盘
service-ribbon         8764         http://localhost:8764/hi?name=zhangsan   服务消费者。注册到8762的注册中心，负载请求8762，8763接口
                                    http://localhost:8764/hystrix            断路器仪表盘
service-zuul           8769