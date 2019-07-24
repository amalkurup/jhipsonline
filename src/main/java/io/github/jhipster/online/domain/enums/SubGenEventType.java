/**
 * Copyright 2017-2019 the original author or authors from the JHipster Online project.
 *
 * This file is part of the JHipster Online project, see https://github.com/jhipster/jhipster-online
 * for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jhipster.online.domain.enums;

public enum SubGenEventType {
    HEROKU("heroku"),
    CLOUDFOUNDRY("cloudfoundry"),
    AWS("aws"),
    CI_CD("ci-cd"),
    CLIENT(""),
    DOCKER_COMPOSE("docker-compose"),
    EXPORT_JDL("export-jdl"),
    IMPORT_JDL("import-jdl"),
    KUBERNETES("kubernetes"),
    LANGUAGES("languages"),
    OPENSHIFT("openshift"),
    RANCHER_COMPOSE("rancher-compose"),
    SERVER("server"),
    SPRING_CONTROLLER("spring-controller"),
    UPGRADE("upgrade");

    private final String databaseValue;

    SubGenEventType(String databaseValue) {
        this.databaseValue = databaseValue;
    }

    public String getDatabaseValue() {
        return databaseValue;
    }

    public static SubGenEventType[] getDeploymentTools() {
        return new SubGenEventType[]{
            HEROKU,
            CLOUDFOUNDRY,
            AWS,
            OPENSHIFT,
            KUBERNETES
        };
    }
}