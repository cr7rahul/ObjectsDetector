/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2015-11-16 19:10:01 UTC)
 * on 2016-01-05 at 19:29:54 UTC 
 * Modify at your own risk.
 */

package com.yv.recipe.backend.process;

/**
 * Service definition for Process (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ProcessRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Process extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the process library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "process/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Process(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Process(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the ProcessOperations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Process process = new Process(...);}
   *   {@code Process.ProcessOperations.List request = process.process().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public ProcessOperations process() {
    return new ProcessOperations();
  }

  /**
   * The "process" collection of methods.
   */
  public class ProcessOperations {

    /**
     * Create a request for the method "process.image".
     *
     * This request holds the parameters needed by the process server.  After setting any optional
     * parameters, call the {@link Image#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.yv.recipe.backend.process.model.ProcessRequest}
     * @return the request
     */
    public Image image(com.yv.recipe.backend.process.model.ProcessRequest content) throws java.io.IOException {
      Image result = new Image(content);
      initialize(result);
      return result;
    }

    public class Image extends ProcessRequest<com.yv.recipe.backend.process.model.ProcessRequest> {

      private static final String REST_PATH = "processImage";

      /**
       * Create a request for the method "process.image".
       *
       * This request holds the parameters needed by the the process server.  After setting any optional
       * parameters, call the {@link Image#execute()} method to invoke the remote operation. <p> {@link
       * Image#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.yv.recipe.backend.process.model.ProcessRequest}
       * @since 1.13
       */
      protected Image(com.yv.recipe.backend.process.model.ProcessRequest content) {
        super(Process.this, "POST", REST_PATH, content, com.yv.recipe.backend.process.model.ProcessRequest.class);
      }

      @Override
      public Image setAlt(java.lang.String alt) {
        return (Image) super.setAlt(alt);
      }

      @Override
      public Image setFields(java.lang.String fields) {
        return (Image) super.setFields(fields);
      }

      @Override
      public Image setKey(java.lang.String key) {
        return (Image) super.setKey(key);
      }

      @Override
      public Image setOauthToken(java.lang.String oauthToken) {
        return (Image) super.setOauthToken(oauthToken);
      }

      @Override
      public Image setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Image) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Image setQuotaUser(java.lang.String quotaUser) {
        return (Image) super.setQuotaUser(quotaUser);
      }

      @Override
      public Image setUserIp(java.lang.String userIp) {
        return (Image) super.setUserIp(userIp);
      }

      @Override
      public Image set(String parameterName, Object value) {
        return (Image) super.set(parameterName, value);
      }
    }

  }

  /**
   * Create a request for the method "greet".
   *
   * This request holds the parameters needed by the process server.  After setting any optional
   * parameters, call the {@link Greet#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public Greet greet() throws java.io.IOException {
    Greet result = new Greet();
    initialize(result);
    return result;
  }

  public class Greet extends ProcessRequest<com.yv.recipe.backend.process.model.ProcessRequest> {

    private static final String REST_PATH = "greetUser";

    /**
     * Create a request for the method "greet".
     *
     * This request holds the parameters needed by the the process server.  After setting any optional
     * parameters, call the {@link Greet#execute()} method to invoke the remote operation. <p> {@link
     * Greet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected Greet() {
      super(Process.this, "GET", REST_PATH, null, com.yv.recipe.backend.process.model.ProcessRequest.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Greet setAlt(java.lang.String alt) {
      return (Greet) super.setAlt(alt);
    }

    @Override
    public Greet setFields(java.lang.String fields) {
      return (Greet) super.setFields(fields);
    }

    @Override
    public Greet setKey(java.lang.String key) {
      return (Greet) super.setKey(key);
    }

    @Override
    public Greet setOauthToken(java.lang.String oauthToken) {
      return (Greet) super.setOauthToken(oauthToken);
    }

    @Override
    public Greet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Greet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Greet setQuotaUser(java.lang.String quotaUser) {
      return (Greet) super.setQuotaUser(quotaUser);
    }

    @Override
    public Greet setUserIp(java.lang.String userIp) {
      return (Greet) super.setUserIp(userIp);
    }

    @Override
    public Greet set(String parameterName, Object value) {
      return (Greet) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Process}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Process}. */
    @Override
    public Process build() {
      return new Process(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ProcessRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setProcessRequestInitializer(
        ProcessRequestInitializer processRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(processRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
