package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

public interface WebSocketBase extends ReadStream<Buffer>, WriteStream<Buffer> {

  Object getDelegate();

  @TypeInfo("ceylon.language::Boolean")
  boolean writeQueueFull();

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> handler);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase pause();

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase resume();

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase drainHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler);

  @TypeInfo("ceylon.language::String")
  ceylon.language.String binaryHandlerID();

  @TypeInfo("ceylon.language::String")
  ceylon.language.String textHandlerID();

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") WebSocketFrame frame);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") ceylon.language.String text);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase closeHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  WebSocketBase frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)") Callable<?> handler);

  @TypeInfo("ceylon.language::Anything")
  void close();

  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  SocketAddress remoteAddress();

  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  SocketAddress localAddress();

  public class Impl implements WebSocketBase {
    private final io.vertx.core.http.WebSocketBase delegate;

    public Impl(io.vertx.core.http.WebSocketBase delegate) {
      this.delegate = delegate;
    }

    public Object getDelegate() {
      return delegate;
    }

    @Override
    public boolean writeQueueFull() {
      boolean ret = delegate.writeQueueFull();
      return ret;
    }

    @Override
    public WebSocketBase exceptionHandler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.exceptionHandler(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase handler(final Callable<?> handler) {
      io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.handler(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase pause() {
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.pause());
      return ret;
    }

    @Override
    public WebSocketBase resume() {
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.resume());
      return ret;
    }

    @Override
    public WebSocketBase endHandler(final Callable<?> endHandler) {
      io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.endHandler(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase write(final Buffer data) {
      io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.write(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase setWriteQueueMaxSize(final long maxSize) {
      int arg_0 = (int)maxSize;
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.setWriteQueueMaxSize(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase drainHandler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.drainHandler(arg_0));
      return ret;
    }

    @Override
    public ceylon.language.String binaryHandlerID() {
      ceylon.language.String ret = new ceylon.language.String(delegate.binaryHandlerID());
      return ret;
    }

    @Override
    public ceylon.language.String textHandlerID() {
      ceylon.language.String ret = new ceylon.language.String(delegate.textHandlerID());
      return ret;
    }

    @Override
    public WebSocketBase writeFrame(final WebSocketFrame frame) {
      io.vertx.core.http.WebSocketFrame arg_0 = (io.vertx.core.http.WebSocketFrame)frame.getDelegate();
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.writeFrame(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase writeFinalTextFrame(final ceylon.language.String text) {
      java.lang.String arg_0 = text.toString();
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.writeFinalTextFrame(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase writeFinalBinaryFrame(final Buffer data) {
      io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.writeFinalBinaryFrame(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase writeBinaryMessage(final Buffer data) {
      io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.writeBinaryMessage(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase closeHandler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.closeHandler(arg_0));
      return ret;
    }

    @Override
    public WebSocketBase frameHandler(final Callable<?> handler) {
      io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() { public void handle(io.vertx.core.http.WebSocketFrame event) { handler.$call$((Object)new io.vertx.ceylon.core.http.WebSocketFrame(event)); } };
      WebSocketBase ret = new io.vertx.ceylon.core.http.WebSocketBase.Impl(delegate.frameHandler(arg_0));
      return ret;
    }

    @Override
    public void close() {
      delegate.close();
    }

    @Override
    public SocketAddress remoteAddress() {
      SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.remoteAddress());
      return ret;
    }

    @Override
    public SocketAddress localAddress() {
      SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.localAddress());
      return ret;
    }
  }

}
