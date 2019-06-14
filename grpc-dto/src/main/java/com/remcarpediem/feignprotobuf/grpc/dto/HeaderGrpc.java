package com.remcarpediem.feignprotobuf.grpc.dto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: header.proto")
public final class HeaderGrpc {

  private HeaderGrpc() {}

  public static final String SERVICE_NAME = "com.remcarpediem.feignprotobuf.grpc.dto.Header";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest,
      com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply> getRequestMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "requestMessage",
      requestType = com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest.class,
      responseType = com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest,
      com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply> getRequestMessageMethod() {
    io.grpc.MethodDescriptor<com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest, com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply> getRequestMessageMethod;
    if ((getRequestMessageMethod = HeaderGrpc.getRequestMessageMethod) == null) {
      synchronized (HeaderGrpc.class) {
        if ((getRequestMessageMethod = HeaderGrpc.getRequestMessageMethod) == null) {
          HeaderGrpc.getRequestMessageMethod = getRequestMessageMethod = 
              io.grpc.MethodDescriptor.<com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest, com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.remcarpediem.feignprotobuf.grpc.dto.Header", "requestMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaderMethodDescriptorSupplier("requestMessage"))
                  .build();
          }
        }
     }
     return getRequestMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeaderStub newStub(io.grpc.Channel channel) {
    return new HeaderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeaderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeaderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeaderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeaderFutureStub(channel);
  }

  /**
   */
  public static abstract class HeaderImplBase implements io.grpc.BindableService {

    /**
     */
    public void requestMessage(com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest request,
        io.grpc.stub.StreamObserver<com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest,
                com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply>(
                  this, METHODID_REQUEST_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class HeaderStub extends io.grpc.stub.AbstractStub<HeaderStub> {
    private HeaderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaderStub(channel, callOptions);
    }

    /**
     */
    public void requestMessage(com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest request,
        io.grpc.stub.StreamObserver<com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeaderBlockingStub extends io.grpc.stub.AbstractStub<HeaderBlockingStub> {
    private HeaderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply requestMessage(com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeaderFutureStub extends io.grpc.stub.AbstractStub<HeaderFutureStub> {
    private HeaderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply> requestMessage(
        com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeaderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeaderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_MESSAGE:
          serviceImpl.requestMessage((com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest) request,
              (io.grpc.stub.StreamObserver<com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HeaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeaderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.remcarpediem.feignprotobuf.grpc.dto.HeaderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Header");
    }
  }

  private static final class HeaderFileDescriptorSupplier
      extends HeaderBaseDescriptorSupplier {
    HeaderFileDescriptorSupplier() {}
  }

  private static final class HeaderMethodDescriptorSupplier
      extends HeaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeaderMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HeaderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeaderFileDescriptorSupplier())
              .addMethod(getRequestMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
