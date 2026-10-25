package com.javatechie;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.javatechie.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.javatechie.Employee,
      com.javatechie.Employee> getGetEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployee",
      requestType = com.javatechie.Employee.class,
      responseType = com.javatechie.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.javatechie.Employee,
      com.javatechie.Employee> getGetEmployeeMethod() {
    io.grpc.MethodDescriptor<com.javatechie.Employee, com.javatechie.Employee> getGetEmployeeMethod;
    if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeMethod = getGetEmployeeMethod =
              io.grpc.MethodDescriptor.<com.javatechie.Employee, com.javatechie.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javatechie.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javatechie.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployee"))
              .build();
        }
      }
    }
    return getGetEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.javatechie.Employee,
      com.javatechie.Employee> getAddEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployee",
      requestType = com.javatechie.Employee.class,
      responseType = com.javatechie.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.javatechie.Employee,
      com.javatechie.Employee> getAddEmployeeMethod() {
    io.grpc.MethodDescriptor<com.javatechie.Employee, com.javatechie.Employee> getAddEmployeeMethod;
    if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
          EmployeeServiceGrpc.getAddEmployeeMethod = getAddEmployeeMethod =
              io.grpc.MethodDescriptor.<com.javatechie.Employee, com.javatechie.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javatechie.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javatechie.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("addEmployee"))
              .build();
        }
      }
    }
    return getAddEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.javatechie.Empty,
      com.javatechie.EmployeeList> getGetAllEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllEmployees",
      requestType = com.javatechie.Empty.class,
      responseType = com.javatechie.EmployeeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.javatechie.Empty,
      com.javatechie.EmployeeList> getGetAllEmployeesMethod() {
    io.grpc.MethodDescriptor<com.javatechie.Empty, com.javatechie.EmployeeList> getGetAllEmployeesMethod;
    if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
          EmployeeServiceGrpc.getGetAllEmployeesMethod = getGetAllEmployeesMethod =
              io.grpc.MethodDescriptor.<com.javatechie.Empty, com.javatechie.EmployeeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javatechie.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.javatechie.EmployeeList.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getAllEmployees"))
              .build();
        }
      }
    }
    return getGetAllEmployeesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static EmployeeServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingV2Stub>() {
        @java.lang.Override
        public EmployeeServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * get employee by id, can't pass id directly
     * </pre>
     */
    default void getEmployee(com.javatechie.Employee request,
        io.grpc.stub.StreamObserver<com.javatechie.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void addEmployee(com.javatechie.Employee request,
        io.grpc.stub.StreamObserver<com.javatechie.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void getAllEmployees(com.javatechie.Empty request,
        io.grpc.stub.StreamObserver<com.javatechie.EmployeeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllEmployeesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeService.
   */
  public static abstract class EmployeeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmployeeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * get employee by id, can't pass id directly
     * </pre>
     */
    public void getEmployee(com.javatechie.Employee request,
        io.grpc.stub.StreamObserver<com.javatechie.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addEmployee(com.javatechie.Employee request,
        io.grpc.stub.StreamObserver<com.javatechie.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllEmployees(com.javatechie.Empty request,
        io.grpc.stub.StreamObserver<com.javatechie.EmployeeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingV2Stub> {
    private EmployeeServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * get employee by id, can't pass id directly
     * </pre>
     */
    public com.javatechie.Employee getEmployee(com.javatechie.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.javatechie.Employee addEmployee(com.javatechie.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.javatechie.EmployeeList getAllEmployees(com.javatechie.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllEmployeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * get employee by id, can't pass id directly
     * </pre>
     */
    public com.javatechie.Employee getEmployee(com.javatechie.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.javatechie.Employee addEmployee(com.javatechie.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.javatechie.EmployeeList getAllEmployees(com.javatechie.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllEmployeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * get employee by id, can't pass id directly
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.javatechie.Employee> getEmployee(
        com.javatechie.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.javatechie.Employee> addEmployee(
        com.javatechie.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.javatechie.EmployeeList> getAllEmployees(
        com.javatechie.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE = 0;
  private static final int METHODID_ADD_EMPLOYEE = 1;
  private static final int METHODID_GET_ALL_EMPLOYEES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE:
          serviceImpl.getEmployee((com.javatechie.Employee) request,
              (io.grpc.stub.StreamObserver<com.javatechie.Employee>) responseObserver);
          break;
        case METHODID_ADD_EMPLOYEE:
          serviceImpl.addEmployee((com.javatechie.Employee) request,
              (io.grpc.stub.StreamObserver<com.javatechie.Employee>) responseObserver);
          break;
        case METHODID_GET_ALL_EMPLOYEES:
          serviceImpl.getAllEmployees((com.javatechie.Empty) request,
              (io.grpc.stub.StreamObserver<com.javatechie.EmployeeList>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.javatechie.Employee,
              com.javatechie.Employee>(
                service, METHODID_GET_EMPLOYEE)))
        .addMethod(
          getAddEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.javatechie.Employee,
              com.javatechie.Employee>(
                service, METHODID_ADD_EMPLOYEE)))
        .addMethod(
          getGetAllEmployeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.javatechie.Empty,
              com.javatechie.EmployeeList>(
                service, METHODID_GET_ALL_EMPLOYEES)))
        .build();
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.javatechie.EmployeeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmployeeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeMethod())
              .addMethod(getAddEmployeeMethod())
              .addMethod(getGetAllEmployeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
