import io.vertx.core {
  VertxOptions_=VertxOptions
}
import ceylon.json {
  JsonObject=Object,
  JsonArray=Array,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.ceylon.core.metrics {
  MetricsOptions,
  metricsOptions_=metricsOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.VertxOptions */
" Instances of this class are used to configure [Vertx](Vertx.type.html) instances.\n"
shared class VertxOptions(
  shared Integer? blockedThreadCheckInterval = null,
  shared String? clusterHost = null,
  shared Integer? clusterPingInterval = null,
  shared Integer? clusterPingReplyInterval = null,
  shared Integer? clusterPort = null,
  shared String? clusterPublicHost = null,
  shared Integer? clusterPublicPort = null,
  shared Boolean? clustered = null,
  shared Integer? eventLoopPoolSize = null,
  shared Boolean? haEnabled = null,
  shared String? haGroup = null,
  shared Integer? internalBlockingPoolSize = null,
  shared Integer? maxEventLoopExecuteTime = null,
  shared Integer? maxWorkerExecuteTime = null,
  shared MetricsOptions? metricsOptions = null,
  shared Integer? quorumSize = null,
  shared Integer? warningExceptionTime = null,
  shared Integer? workerPoolSize = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists blockedThreadCheckInterval) {
      json.put("blockedThreadCheckInterval", blockedThreadCheckInterval);
    }
    if (exists clusterHost) {
      json.put("clusterHost", clusterHost);
    }
    if (exists clusterPingInterval) {
      json.put("clusterPingInterval", clusterPingInterval);
    }
    if (exists clusterPingReplyInterval) {
      json.put("clusterPingReplyInterval", clusterPingReplyInterval);
    }
    if (exists clusterPort) {
      json.put("clusterPort", clusterPort);
    }
    if (exists clusterPublicHost) {
      json.put("clusterPublicHost", clusterPublicHost);
    }
    if (exists clusterPublicPort) {
      json.put("clusterPublicPort", clusterPublicPort);
    }
    if (exists clustered) {
      json.put("clustered", clustered);
    }
    if (exists eventLoopPoolSize) {
      json.put("eventLoopPoolSize", eventLoopPoolSize);
    }
    if (exists haEnabled) {
      json.put("haEnabled", haEnabled);
    }
    if (exists haGroup) {
      json.put("haGroup", haGroup);
    }
    if (exists internalBlockingPoolSize) {
      json.put("internalBlockingPoolSize", internalBlockingPoolSize);
    }
    if (exists maxEventLoopExecuteTime) {
      json.put("maxEventLoopExecuteTime", maxEventLoopExecuteTime);
    }
    if (exists maxWorkerExecuteTime) {
      json.put("maxWorkerExecuteTime", maxWorkerExecuteTime);
    }
    if (exists metricsOptions) {
      json.put("metricsOptions", metricsOptions.toJson());
    }
    if (exists quorumSize) {
      json.put("quorumSize", quorumSize);
    }
    if (exists warningExceptionTime) {
      json.put("warningExceptionTime", warningExceptionTime);
    }
    if (exists workerPoolSize) {
      json.put("workerPoolSize", workerPoolSize);
    }
    return json;
  }
}

shared object vertxOptions {

  shared VertxOptions fromJson(JsonObject json) {
    Integer? blockedThreadCheckInterval = json.getIntegerOrNull("blockedThreadCheckInterval");
    String? clusterHost = json.getStringOrNull("clusterHost");
    Integer? clusterPingInterval = json.getIntegerOrNull("clusterPingInterval");
    Integer? clusterPingReplyInterval = json.getIntegerOrNull("clusterPingReplyInterval");
    Integer? clusterPort = json.getIntegerOrNull("clusterPort");
    String? clusterPublicHost = json.getStringOrNull("clusterPublicHost");
    Integer? clusterPublicPort = json.getIntegerOrNull("clusterPublicPort");
    Boolean? clustered = json.getBooleanOrNull("clustered");
    Integer? eventLoopPoolSize = json.getIntegerOrNull("eventLoopPoolSize");
    Boolean? haEnabled = json.getBooleanOrNull("haEnabled");
    String? haGroup = json.getStringOrNull("haGroup");
    Integer? internalBlockingPoolSize = json.getIntegerOrNull("internalBlockingPoolSize");
    Integer? maxEventLoopExecuteTime = json.getIntegerOrNull("maxEventLoopExecuteTime");
    Integer? maxWorkerExecuteTime = json.getIntegerOrNull("maxWorkerExecuteTime");
    MetricsOptions? metricsOptions = if (exists tmp = json.getObjectOrNull("metricsOptions")) then metricsOptions_.fromJson(tmp) else null;
    Integer? quorumSize = json.getIntegerOrNull("quorumSize");
    Integer? warningExceptionTime = json.getIntegerOrNull("warningExceptionTime");
    Integer? workerPoolSize = json.getIntegerOrNull("workerPoolSize");
    return VertxOptions {
      blockedThreadCheckInterval = blockedThreadCheckInterval;
      clusterHost = clusterHost;
      clusterPingInterval = clusterPingInterval;
      clusterPingReplyInterval = clusterPingReplyInterval;
      clusterPort = clusterPort;
      clusterPublicHost = clusterPublicHost;
      clusterPublicPort = clusterPublicPort;
      clustered = clustered;
      eventLoopPoolSize = eventLoopPoolSize;
      haEnabled = haEnabled;
      haGroup = haGroup;
      internalBlockingPoolSize = internalBlockingPoolSize;
      maxEventLoopExecuteTime = maxEventLoopExecuteTime;
      maxWorkerExecuteTime = maxWorkerExecuteTime;
      metricsOptions = metricsOptions;
      quorumSize = quorumSize;
      warningExceptionTime = warningExceptionTime;
      workerPoolSize = workerPoolSize;
    };
  }

  shared object toJava extends Converter<VertxOptions, VertxOptions_>() {
    shared actual VertxOptions_ convert(VertxOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = VertxOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(VertxOptions obj) => obj.toJson();
}
