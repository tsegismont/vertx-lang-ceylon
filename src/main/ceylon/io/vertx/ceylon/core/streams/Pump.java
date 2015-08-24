package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public class Pump {

  private final io.vertx.core.streams.Pump delegate;

  public Pump(io.vertx.core.streams.Pump delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public static <T> Pump pump(
    final @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>") ReadStream<T> rs, 
    final @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>") WriteStream<T> ws) {
    io.vertx.core.streams.ReadStream<java.lang.Object> arg_0 = (io.vertx.core.streams.ReadStream<java.lang.Object>)rs.getDelegate();
    io.vertx.core.streams.WriteStream<java.lang.Object> arg_1 = (io.vertx.core.streams.WriteStream<java.lang.Object>)ws.getDelegate();
    Pump ret = new io.vertx.ceylon.core.streams.Pump(io.vertx.core.streams.Pump.pump(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public static <T> Pump pump(
    final @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>") ReadStream<T> rs, 
    final @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>") WriteStream<T> ws, 
    final @TypeInfo("ceylon.language::Integer") long writeQueueMaxSize) {
    io.vertx.core.streams.ReadStream<java.lang.Object> arg_0 = (io.vertx.core.streams.ReadStream<java.lang.Object>)rs.getDelegate();
    io.vertx.core.streams.WriteStream<java.lang.Object> arg_1 = (io.vertx.core.streams.WriteStream<java.lang.Object>)ws.getDelegate();
    int arg_2 = (int)writeQueueMaxSize;
    Pump ret = new io.vertx.ceylon.core.streams.Pump(io.vertx.core.streams.Pump.pump(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize) {
    int arg_0 = (int)maxSize;
    Pump ret = new io.vertx.ceylon.core.streams.Pump(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump start() {
    Pump ret = new io.vertx.ceylon.core.streams.Pump(delegate.start());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.streams::Pump")
  public Pump stop() {
    Pump ret = new io.vertx.ceylon.core.streams.Pump(delegate.stop());
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long numberPumped() {
    long ret = delegate.numberPumped();
    return ret;
  }

}
