package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.http.HttpMethod;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.core.Handler;

public class HttpClient implements Measured {

  private final io.vertx.core.http.HttpClient delegate;

  public HttpClient(io.vertx.core.http.HttpClient delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    java.lang.String arg_3 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    java.lang.String arg_3 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.request(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.request(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = absoluteURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.requestAbs(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.requestAbs(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.get(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.get(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.get(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.get(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.getAbs(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.getAbs(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.getNow(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.getNow(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.getNow(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.post(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.post(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.post(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.post(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.postAbs(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.postAbs(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.head(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.head(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.head(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.head(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.headAbs(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.headAbs(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.headNow(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.headNow(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.headNow(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.options(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.options(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.options(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.options(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.optionsAbs(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.optionsAbs(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.optionsNow(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.optionsNow(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.optionsNow(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.put(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.put(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.put(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.put(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.putAbs(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.putAbs(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.delete(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.delete(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.deleteAbs(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.deleteAbs(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    java.lang.String arg_5 = subProtocols.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_6 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    java.lang.String arg_4 = subProtocols.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    java.lang.String arg_3 = subProtocols.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)new io.vertx.ceylon.core.http.WebSocket(event)); } };
    HttpClient ret = new io.vertx.ceylon.core.http.HttpClient(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = (io.vertx.core.MultiMap)headers.getDelegate();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = (io.vertx.core.MultiMap)headers.getDelegate();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String subProtocols) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    java.lang.String arg_5 = subProtocols.toString();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    java.lang.String arg_4 = subProtocols.toString();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = (io.vertx.core.MultiMap)headers.getDelegate();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = (io.vertx.core.MultiMap)headers.getDelegate();
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    java.lang.String arg_3 = subProtocols.toString();
    WebSocketStream ret = new io.vertx.ceylon.core.http.WebSocketStream(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
