package io.vertx.ceylon.core.file;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public class FileProps {

  private final io.vertx.core.file.FileProps delegate;

  public FileProps(io.vertx.core.file.FileProps delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Integer")
  public long creationTime() {
    long ret = delegate.creationTime();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long lastAccessTime() {
    long ret = delegate.lastAccessTime();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long lastModifiedTime() {
    long ret = delegate.lastModifiedTime();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isDirectory() {
    boolean ret = delegate.isDirectory();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isOther() {
    boolean ret = delegate.isOther();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isRegularFile() {
    boolean ret = delegate.isRegularFile();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isSymbolicLink() {
    boolean ret = delegate.isSymbolicLink();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}