package org.testing.framework.services;

import org.testing.framework.models.Engine;

public class EngineCreator {
    public static final String TEST_DATA_INSTANCES_NUMB = "testdata.engine.instances.numb";
    public static final String TEST_DATA_OC_TYPE = "testdata.engine.oc.type";
    public static final String TEST_DATA_PROVISIONING_MODEL = "testdata.engine.provisioning.model";
    public static final String TEST_DATA_MACHINE_FAMILY = "testdata.engine.machine.family";
    public static final String TEST_DATA_SERIES = "testdata.engine.series";
    public static final String TEST_DATA_MACHINE_TYPE = "testdata.engine.machine.type";
    public static final String TEST_DATA_ADD_GPUS = "testdata.engine.add.gpus";
    public static final String TEST_DATA_GPU_MODEL = "testdata.engine.gpu.model";
    public static final String TEST_DATA_NUMB_OF_GPU = "testdata.engine.numb.of.gpu";
    public static final String TEST_DATA_LOCAL_SSD = "testdata.engine.local.ssd";
    public static final String TEST_DATA_REGION = "testdata.engine.region";


    public static Engine withCredentialsFromProperty(String propertyFileName) {
        TestDataReader.setUpProperties(propertyFileName);
        return new Engine(TestDataReader.getTestData(TEST_DATA_INSTANCES_NUMB),
                TestDataReader.getTestData(TEST_DATA_OC_TYPE), TestDataReader.getTestData(TEST_DATA_PROVISIONING_MODEL),
                TestDataReader.getTestData(TEST_DATA_MACHINE_FAMILY), TestDataReader.getTestData(TEST_DATA_SERIES),
                TestDataReader.getTestData(TEST_DATA_MACHINE_TYPE), TestDataReader.getTestData(TEST_DATA_GPU_MODEL),
                TestDataReader.getTestData(TEST_DATA_NUMB_OF_GPU), TestDataReader.getTestData(TEST_DATA_LOCAL_SSD),
                TestDataReader.getTestData(TEST_DATA_REGION));
    }

}
