/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 */

/**
 * === Kubernetes ConfigMap Store
 *
 * The Kubernetes ConfigMap Store extends the Vert.x Configuration Retriever and provides support Kubernetes Config Map
 * and Secrets. So, configuration is retrieved by reading the config map or the secrets.
 *
 * ==== Using the Kubernetes ConfigMap Store
 *
 * To use the Kubernetes ConfigMap Store, add the following dependency to the
 * _dependencies_ section of your build descriptor:
 *
 * * Maven (in your `pom.xml`):
 *
 * [source,xml,subs="+attributes"]
 * ----
 * <dependency>
 * <groupId>${maven.groupId}</groupId>
 * <artifactId>${maven.artifactId}</artifactId>
 * <version>${maven.version}</version>
 * </dependency>
 * <dependency>
 * <groupId>${maven.groupId}</groupId>
 * <artifactId>vertx-config</artifactId>
 * <version>${maven.version}</version>
 * </dependency>
 * ----
 *
 * * Gradle (in your `build.gradle` file):
 *
 * [source,groovy,subs="+attributes"]
 * ----
 * compile '${maven.groupId}:vertx-config:${maven.version}'
 * compile '${maven.groupId}:${maven.artifactId}:${maven.version}'
 * ----
 *
 * ==== Configuring the store
 *
 * Once added to your classpath or dependencies, you need to configure the
 * {@link io.vertx.config.ConfigRetriever} to use this store:
 *
 * [source, $lang]
 * ----
 * {@link examples.Examples#example1(io.vertx.core.Vertx)}
 * ----
 *
 * You need to configure the store to find the right configmap. this is done with:
 *
 * * `namespace` - the project namespace, `default` by default. If the `KUBERNETES_NAMESPACE` ENV variable is set, it
 * uses this value.
 * * `name` - the name of the config map
 * * `optional` - whether or not the config map is optional (`true` by default)
 *
 * If the config map is composed by several element, you can use the `key` parameter to tell
 * which `key` is read
 *
 * The application must have the permissions to read the config map.
 *
 * To read data from a secret, just configure the `secret` property to `true`:
 *
 * [source, $lang]
 * ----
 * {@link examples.Examples#example2(io.vertx.core.Vertx)}
 * ----
 *
 * If the config map is not available, an empty JSON object is passed as configuration chunk. To disable this
 * behavior and explicitly fail, you can set the `optional` configuration to `false`.
 */
@Document(fileName = "kubernetes-store.adoc")
@ModuleGen(name = "vertx-config", groupPackage = "io.vertx")
package io.vertx.config.kubernetes;

import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.docgen.Document;
