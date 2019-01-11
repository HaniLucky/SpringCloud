ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。
ribbon 已经默认实现了这些配置bean：

    IClientConfig ribbonClientConfig: DefaultClientConfigImpl
    IRule ribbonRule: ZoneAvoidanceRule
    IPing ribbonPing: NoOpPing
    ServerList ribbonServerList: ConfigurationBasedServerList
    ServerListFilter ribbonServerListFilter: ZonePreferenceServerListFilter
    ILoadBalancer ribbonLoadBalancer: ZoneAwareLoadBalancer
    
访问地址: