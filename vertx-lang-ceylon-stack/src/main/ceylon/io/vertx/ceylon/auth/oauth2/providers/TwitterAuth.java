package io.vertx.ceylon.auth.oauth2.providers;

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
import io.vertx.ceylon.core.Vertx;
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Simplified factory to create an  for Twitter.\n")
public class TwitterAuth implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.TwitterAuth, TwitterAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.TwitterAuth, TwitterAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.TwitterAuth, TwitterAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.TwitterAuth, TwitterAuth>() {
        public TwitterAuth convert(io.vertx.ext.auth.oauth2.providers.TwitterAuth src) {
          return new TwitterAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<TwitterAuth, io.vertx.ext.auth.oauth2.providers.TwitterAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<TwitterAuth, io.vertx.ext.auth.oauth2.providers.TwitterAuth>() {
    public io.vertx.ext.auth.oauth2.providers.TwitterAuth convert(TwitterAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(TwitterAuth.class), io.vertx.ext.auth.oauth2.providers.TwitterAuth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.providers.TwitterAuth delegate;

  public TwitterAuth(io.vertx.ext.auth.oauth2.providers.TwitterAuth delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

}
