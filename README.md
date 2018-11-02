# springcloud-hystrix

### 运行示例１，　在Ribbon中使用Hystrix

运行步骤：
  * 启动Eureka server服务
  * 启动Server-1 服务
  * 启动Ribbon client服务
  * 在浏览器中执行http://localhost:8084/ribbon/get, 返回"Server is availabe, port=8086"
  * 关闭Server-1服务，在浏览器中执行http://localhost:8084/ribbon/get, 返回"the service is unavailable for now..."

### 运行实例２，　在Feign中使用Hystrix

运行步骤：
  * 启动Eureka server服务
  * 启动Server-1 服务
  * 启动Feign client服务
  * 在浏览器中执行http://localhost:8084/feign/get, 返回"Server is availabe, port=8086"
  * 关闭Server-1服务，在浏览器中执行http://localhost:8084/feign/get, 返回"the service is unavailable for now..."

备注：在Feign的示例中，由于Feign默认包含了Hystrix,因此在ｐｏｍ中不用显式包含hystrix的依赖；但是需要在配置中包含：
    feign.hystrix.enabled=true
