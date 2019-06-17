# 服务间调用例子对比
## spring cloud feign client + json   http://localhost:9091/testProto2
## spring cloud feign client + protobuf http://localhost:9091/testProto
## spring cloud + grpc http://localhost:9094/testGrpc
## spring boot + dubbo http://localhost:8080/testDubbo
经过10W请求调用，测试发现

### 速度对比
dubbo > feigin cleint + protobuf > grpc > feigin client + json

### CPU 使用率对比
dubbo < grpc < feigin cleint + protobuf < feigin client + json