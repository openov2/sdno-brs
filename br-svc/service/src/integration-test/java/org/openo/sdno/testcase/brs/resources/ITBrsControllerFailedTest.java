/*
 * Copyright 2016-2017 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.testcase.brs.resources;

import static org.junit.Assert.assertFalse;

import java.io.File;

import org.junit.Test;
import org.openo.baseservice.remoteservice.exception.ServiceException;
import org.openo.sdno.testcase.brs.checker.BrsChecker;
import org.openo.sdno.testframework.http.model.HttpModelUtils;
import org.openo.sdno.testframework.http.model.HttpRequest;
import org.openo.sdno.testframework.http.model.HttpRquestResponse;
import org.openo.sdno.testframework.replace.PathReplace;
import org.openo.sdno.testframework.testmanager.TestManager;
import org.openo.sdno.testframework.util.file.FileUtils;

/**
 * ITBrsControllerFailed test class.<br>
 * 
 * @author
 * @version SDNO 0.5 October 11, 2016
 */
public class ITBrsControllerFailedTest extends TestManager {

    private static final String CREATE_PATH =
            "src/integration-test/resources/brstestcase/brsControllerFailedTestCase/createfailed.json";

    private static final String UPDATE_PATH =
            "src/integration-test/resources/brstestcase/brsControllerFailedTestCase/updatefailed.json";

    private static final String DELETE_PATH =
            "src/integration-test/resources/brstestcase/brsControllerFailedTestCase/deleteuuidwrong.json";

    private static final String DELETE_FAILED_PATH =
            "src/integration-test/resources/brstestcase/brsControllerFailedTestCase/deletefailed.json";

    @Test
    public void controllerCreateFailedTest() {
        try {
            File createFile = new File(CREATE_PATH);
            String content = FileUtils.readFromJson(createFile);
            HttpRquestResponse httpObject = HttpModelUtils.praseHttpRquestResponse(content);
            BrsChecker controllerChecker = new BrsChecker(httpObject.getResponse());

            execTestCase(httpObject.getRequest(), controllerChecker);
        } catch(ServiceException e) {
            assertFalse(true);
        }
    }

    @Test
    public void controllerUpdateFailedTest() {
        try {

            doTest("test_failed", new File(UPDATE_PATH));
        } catch(ServiceException e) {
            assertFalse(true);
        }
    }

    @Test
    public void controllerDeleteUuidWrongTest() {
        try {
            doTest("test_failed", new File(DELETE_PATH));
        } catch(ServiceException e) {
            assertFalse(true);
        }
    }

    @Test
    public void controllerDeleteFailed() {
        try {
            doTest("test_failed", new File(DELETE_FAILED_PATH));
        } catch(ServiceException e) {
            assertFalse(true);
        }
    }

    private void doTest(String uuid, File testFile) throws ServiceException {
        HttpRquestResponse httpObject = HttpModelUtils.praseHttpRquestResponse(FileUtils.readFromJson(testFile));
        BrsChecker controllerChecker = new BrsChecker(httpObject.getResponse());
        HttpRequest request = httpObject.getRequest();
        request.setUri(PathReplace.replaceUuid("objectId", httpObject.getRequest().getUri(), uuid));
        controllerChecker.setExpectedResponse(httpObject.getResponse());
        execTestCase(request, controllerChecker);
    }
}
