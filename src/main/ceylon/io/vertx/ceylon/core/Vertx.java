package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.datagram.DatagramSocket;
import io.vertx.ceylon.core.http.HttpServer;
import io.vertx.ceylon.core.shareddata.SharedData;
import io.vertx.ceylon.core.eventbus.EventBus;
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.core.net.NetClient;
import java.util.Set;
import io.vertx.ceylon.core.dns.DnsClient;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.ceylon.core.net.NetServer;
import io.vertx.ceylon.core.file.FileSystem;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.http.HttpClient;

public class Vertx implements Measured {

  private final io.vertx.core.Vertx delegate;

  public Vertx(io.vertx.core.Vertx delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public static Vertx vertx() {
    Vertx ret = new io.vertx.ceylon.core.Vertx(io.vertx.core.Vertx.vertx());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Vertx")
  public static Vertx vertx(
    final @TypeInfo("ceylon.language::Object") Object options) {
    io.vertx.core.VertxOptions arg_0 = null;
    Vertx ret = new io.vertx.ceylon.core.Vertx(io.vertx.core.Vertx.vertx(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public static void clusteredVertx(
    final @TypeInfo("ceylon.language::Object") Object options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core::Vertx)") Callable<?> resultHandler) {
    io.vertx.core.VertxOptions arg_0 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.Vertx>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.Vertx>(resultHandler) { public Object toCeylon(io.vertx.core.Vertx event) { return new io.vertx.ceylon.core.Vertx(event); } };
    io.vertx.core.Vertx.clusteredVertx(arg_0, arg_1);
  }

  @TypeInfo("io.vertx.ceylon.core::Context")
  public static Context currentContext() {
    Context ret = new io.vertx.ceylon.core.Context(io.vertx.core.Vertx.currentContext());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Context")
  public Context getOrCreateContext() {
    Context ret = new io.vertx.ceylon.core.Context(delegate.getOrCreateContext());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer createNetServer(
    final @TypeInfo("ceylon.language::Object") Object options) {
    io.vertx.core.net.NetServerOptions arg_0 = null;
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.createNetServer(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer createNetServer() {
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.createNetServer());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient createNetClient(
    final @TypeInfo("ceylon.language::Object") Object options) {
    io.vertx.core.net.NetClientOptions arg_0 = null;
    NetClient ret = new io.vertx.ceylon.core.net.NetClient(delegate.createNetClient(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient createNetClient() {
    NetClient ret = new io.vertx.ceylon.core.net.NetClient(delegate.createNetClient());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer createHttpServer(
    final @TypeInfo("ceylon.language::Object") Object options) {
    io.vertx.core.http.HttpServerOptions arg_0 = null;
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.createHttpServer(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer createHttpServer() {
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.createHttpServer());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient createHttpClient(
    final @TypeInfo("ceylon.language::Object") Object options) {
    io.vertx.core.http.HttpClientOptions arg_0 = null;
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.createHttpClient(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient createHttpClient() {
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.createHttpClient());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket createDatagramSocket(
    final @TypeInfo("ceylon.language::Object") Object options) {
    io.vertx.core.datagram.DatagramSocketOptions arg_0 = null;
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.createDatagramSocket(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket createDatagramSocket() {
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.createDatagramSocket());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.file::FileSystem")
  public FileSystem fileSystem() {
    FileSystem ret = new io.vertx.ceylon.core.file.FileSystem(delegate.fileSystem());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus eventBus() {
    EventBus ret = new io.vertx.ceylon.core.eventbus.EventBus(delegate.eventBus());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient createDnsClient(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    DnsClient ret = new io.vertx.ceylon.core.dns.DnsClient(delegate.createDnsClient(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.shareddata::SharedData")
  public SharedData sharedData() {
    SharedData ret = new io.vertx.ceylon.core.shareddata.SharedData(delegate.sharedData());
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long setTimer(
    final @TypeInfo("ceylon.language::Integer") long delay, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") Callable<?> handler) {
    long arg_0 = delay;
    io.vertx.core.Handler<java.lang.Long> arg_1 = new io.vertx.core.Handler<java.lang.Long>() { public void handle(java.lang.Long event) { handler.$call$((Object)ceylon.language.Integer.instance(event)); } };
    long ret = delegate.setTimer(arg_0, arg_1);
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream timerStream(
    final @TypeInfo("ceylon.language::Integer") long delay) {
    long arg_0 = delay;
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.timerStream(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long setPeriodic(
    final @TypeInfo("ceylon.language::Integer") long delay, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") Callable<?> handler) {
    long arg_0 = delay;
    io.vertx.core.Handler<java.lang.Long> arg_1 = new io.vertx.core.Handler<java.lang.Long>() { public void handle(java.lang.Long event) { handler.$call$((Object)ceylon.language.Integer.instance(event)); } };
    long ret = delegate.setPeriodic(arg_0, arg_1);
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream periodicStream(
    final @TypeInfo("ceylon.language::Integer") long delay) {
    long arg_0 = delay;
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.periodicStream(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean cancelTimer(
    final @TypeInfo("ceylon.language::Integer") long id) {
    long arg_0 = id;
    boolean ret = delegate.cancelTimer(arg_0);
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void runOnContext(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> action) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { action.$call$((Object)null); } };
    delegate.runOnContext(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    delegate.deployVerticle(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") Callable<?> completionHandler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(completionHandler) { public Object toCeylon(java.lang.String event) { return new ceylon.language.String(event); } };
    delegate.deployVerticle(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Object") Object options) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.DeploymentOptions arg_1 = null;
    delegate.deployVerticle(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void deployVerticle(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Object") Object options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") Callable<?> completionHandler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.DeploymentOptions arg_1 = null;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(completionHandler) { public Object toCeylon(java.lang.String event) { return new ceylon.language.String(event); } };
    delegate.deployVerticle(arg_0, arg_1, arg_2);
  }

  @TypeInfo("ceylon.language::Anything")
  public void undeploy(
    final @TypeInfo("ceylon.language::String") ceylon.language.String deploymentID) {
    java.lang.String arg_0 = deploymentID.toString();
    delegate.undeploy(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void undeploy(
    final @TypeInfo("ceylon.language::String") ceylon.language.String deploymentID, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> completionHandler) {
    java.lang.String arg_0 = deploymentID.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.undeploy(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public Set<ceylon.language.String> deploymentIDs() {
    Set<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isClustered() {
    boolean ret = delegate.isClustered();
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Boolean") boolean ordered, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() { public void handle(io.vertx.core.Future<java.lang.Object> event) { blockingCodeHandler.$call$((Object)new io.vertx.ceylon.core.Future(event)); } };
    boolean arg_1 = ordered;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.executeBlocking(arg_0, arg_1, arg_2);
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("ceylon.language::Anything")
  public <T> void executeBlocking(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T>)") Callable<?> blockingCodeHandler, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() { public void handle(io.vertx.core.Future<java.lang.Object> event) { blockingCodeHandler.$call$((Object)new io.vertx.ceylon.core.Future(event)); } };
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(resultHandler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.executeBlocking(arg_0, arg_1);
  }

}
