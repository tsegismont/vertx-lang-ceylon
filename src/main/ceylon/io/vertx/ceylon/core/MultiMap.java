package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@DocAnnotation$annotation$(description = "todo")
public class MultiMap {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MultiMap.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.MultiMap, MultiMap> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.MultiMap, MultiMap>() {
    public MultiMap convert(io.vertx.core.MultiMap src) {
      return new MultiMap(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<MultiMap, io.vertx.core.MultiMap> TO_JAVA = new io.vertx.lang.ceylon.Converter<MultiMap, io.vertx.core.MultiMap>() {
    public io.vertx.core.MultiMap convert(MultiMap src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.MultiMap delegate;

  public MultiMap(io.vertx.core.MultiMap delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public static MultiMap caseInsensitiveMultiMap() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(io.vertx.core.MultiMap.caseInsensitiveMultiMap());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String get(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> getAll(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, delegate.getAll(arg_0), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean contains(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    boolean ret = delegate.contains(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEmpty() {
    boolean ret = delegate.isEmpty();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public ceylon.language.Set<ceylon.language.String> names() {
    ceylon.language.Set<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.set(ceylon.language.String.$TypeDescriptor$, delegate.names(), io.vertx.lang.ceylon.ToCeylon.String);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap add(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.add(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap addAll(
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap map) {
    io.vertx.core.MultiMap arg_0 = (io.vertx.core.MultiMap)map.getDelegate();
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.addAll(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap set(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.set(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap setAll(
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap map) {
    io.vertx.core.MultiMap arg_0 = (io.vertx.core.MultiMap)map.getDelegate();
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.setAll(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap remove(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.remove(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap clear() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.clear());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}
