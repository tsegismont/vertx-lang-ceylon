package io.vertx.ceylon.web.handler;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.ceylon.auth.common.AuthProvider;

@Name("redirectAuthHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class redirectAuthHandler_ {

  private static final redirectAuthHandler_ instance = new redirectAuthHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::redirectAuthHandler")
  public static redirectAuthHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public static AuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "todo") AuthProvider authProvider) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.RedirectAuthHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public static AuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "todo") AuthProvider authProvider, 
    final @TypeInfo("ceylon.language::String") @Name("loginRedirectURL") @DocAnnotation$annotation$(description = "todo") ceylon.language.String loginRedirectURL) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(loginRedirectURL);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.RedirectAuthHandler.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public static AuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "todo") AuthProvider authProvider, 
    final @TypeInfo("ceylon.language::String") @Name("loginRedirectURL") @DocAnnotation$annotation$(description = "todo") ceylon.language.String loginRedirectURL, 
    final @TypeInfo("ceylon.language::String") @Name("returnURLParam") @DocAnnotation$annotation$(description = "todo") ceylon.language.String returnURLParam) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(loginRedirectURL);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(returnURLParam);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.RedirectAuthHandler.create(arg_0, arg_1, arg_2));
    return ret;
  }

}