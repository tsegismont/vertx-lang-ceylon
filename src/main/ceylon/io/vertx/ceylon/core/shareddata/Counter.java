package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class Counter {

  private final io.vertx.core.shareddata.Counter delegate;

  public Counter(io.vertx.core.shareddata.Counter delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.get(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void incrementAndGet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.incrementAndGet(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void getAndIncrement(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.getAndIncrement(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void decrementAndGet(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.decrementAndGet(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void addAndGet(
    final @TypeInfo("ceylon.language::Integer") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> resultHandler) {
    long arg_0 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.addAndGet(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void getAndAdd(
    final @TypeInfo("ceylon.language::Integer") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") Callable<?> resultHandler) {
    long arg_0 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Long>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Long>(resultHandler) { public Object toCeylon(java.lang.Long event) { return ceylon.language.Integer.instance(event); } };
    delegate.getAndAdd(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void compareAndSet(
    final @TypeInfo("ceylon.language::Integer") long expected, 
    final @TypeInfo("ceylon.language::Integer") long value, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") Callable<?> resultHandler) {
    long arg_0 = expected;
    long arg_1 = value;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) { public Object toCeylon(java.lang.Boolean event) { return ceylon.language.Boolean.instance(event); } };
    delegate.compareAndSet(arg_0, arg_1, arg_2);
  }

}
