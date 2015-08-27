package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

public class WebSocketStream implements ReadStream<WebSocket> {

  private final io.vertx.core.http.WebSocketStream delegate;

  public WebSocketStream(io.vertx.core.http.WebSocketStream delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { handler.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream pause() {
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream resume() {
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.endHandler(arg_0));
    return ret;
  }

}