package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class HttpServerFileUpload implements ReadStream<Buffer> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServerFileUpload.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerFileUpload, HttpServerFileUpload> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerFileUpload, HttpServerFileUpload>() {
    public HttpServerFileUpload convert(io.vertx.core.http.HttpServerFileUpload src) {
      return new HttpServerFileUpload(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<HttpServerFileUpload, io.vertx.core.http.HttpServerFileUpload> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerFileUpload, io.vertx.core.http.HttpServerFileUpload>() {
    public io.vertx.core.http.HttpServerFileUpload convert(HttpServerFileUpload src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.http.HttpServerFileUpload delegate;

  public HttpServerFileUpload(io.vertx.core.http.HttpServerFileUpload delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(event)); } };
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.convert(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.convert(delegate.endHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload pause() {
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.convert(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload resume() {
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.convert(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload streamToFileSystem(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String filename) {
    java.lang.String arg_0 = filename.toString();
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.convert(delegate.streamToFileSystem(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String filename() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.filename());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.name());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String contentType() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.contentType());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String contentTransferEncoding() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.contentTransferEncoding());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String charset() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.charset());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isSizeAvailable() {
    boolean ret = delegate.isSizeAvailable();
    return ret;
  }

}
