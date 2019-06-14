# Spring cloud 服务间调用例子对比
## spring cloud feign client + json   http://localhost:9091/testProto2
## spring cloud feign client + protobuf http://localhost:9091/testProto
## spring cloud + grpc http://localhost:9094/testGrpc

经过10W请求调用，测试发现
### feign client + protobuf 速度最快，cpu使用率比grpc要高
### cloud + grpc 次之，但是cpu使用率最低
### client + json 速度最慢，cpu使用率比两者都高，但是编程简单，不用关心proto语法