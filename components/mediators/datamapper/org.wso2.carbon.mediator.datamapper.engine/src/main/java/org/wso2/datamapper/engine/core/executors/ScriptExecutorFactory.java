/*
 * Copyright 2016 WSO2, Inc. http://www.wso2.org
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
package org.wso2.datamapper.engine.core.executors;

import org.wso2.datamapper.engine.core.IScriptExecutor;

/**
 * Created by nuwan on 2/29/16.
 */
public class ScriptExecutorFactory {

    /**
     * This private constructor added to hide the implicit public constructor
     */
    private ScriptExecutorFactory() {

    }

    public static IScriptExecutor getScriptExecutor(ScriptExecutorType executorType) {
        switch (executorType) {
            case RHINO:
                return new RhinoExecutor();
        }
        throw new IllegalArgumentException("");
    }
}
