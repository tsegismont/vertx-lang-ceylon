package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public class ConcreteHandlerUserTypeExtension {

  private final io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension delegate;

  public ConcreteHandlerUserTypeExtension(io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") RefedInterface1 arg0) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = (io.vertx.codegen.testmodel.RefedInterface1)arg0.getDelegate();
    delegate.handle(arg_0);
  }

}