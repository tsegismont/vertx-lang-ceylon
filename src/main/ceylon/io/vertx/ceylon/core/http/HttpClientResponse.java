package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import java.util.List;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.NetSocket;

public class HttpClientResponse implements ReadStream<Buffer> {

  private final io.vertx.core.http.HttpClientResponse delegate;

  public HttpClientResponse(io.vertx.core.http.HttpClientResponse delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse resume() {
    HttpClientResponse ret = new io.vertx.ceylon.core.http.HttpClientResponse(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpClientResponse ret = new io.vertx.ceylon.core.http.HttpClientResponse(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    HttpClientResponse ret = new io.vertx.ceylon.core.http.HttpClientResponse(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse pause() {
    HttpClientResponse ret = new io.vertx.ceylon.core.http.HttpClientResponse(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    HttpClientResponse ret = new io.vertx.ceylon.core.http.HttpClientResponse(delegate.endHandler(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long statusCode() {
    long ret = delegate.statusCode();
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String statusMessage() {
    ceylon.language.String ret = new ceylon.language.String(delegate.statusMessage());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.headers());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getHeader(
    final @TypeInfo("ceylon.language::String") ceylon.language.String headerName) {
    java.lang.String arg_0 = headerName.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.getHeader(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getTrailer(
    final @TypeInfo("ceylon.language::String") ceylon.language.String trailerName) {
    java.lang.String arg_0 = trailerName.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.getTrailer(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap trailers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.trailers());
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public List<ceylon.language.String> cookies() {
    List<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse bodyHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> bodyHandler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { bodyHandler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    HttpClientResponse ret = new io.vertx.ceylon.core.http.HttpClientResponse(delegate.bodyHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket netSocket() {
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.netSocket());
    return ret;
  }

}
