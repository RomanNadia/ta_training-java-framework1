package org.testing.framework.models;

import java.util.Objects;

public class Engine {
    private final String instancesNumber;
    private final String ocType;
    private final String nameOfProvisioningModel;
    private String machineFamily;
    private String series;
    private final String machineType;
    private final Boolean addGPUs;
    private String gpuModel;
    private String numbOfGPU;
    private final String localSSD;
    private final String region;


    public Engine(String instancesNumber, String ocType, String nameOfProvisioningModel, String machineFamily,
                  String series, String machineType, String localSSD, String region) {
        this.instancesNumber = instancesNumber;
        this.ocType = ocType;
        this.nameOfProvisioningModel = nameOfProvisioningModel;
        this.machineFamily = machineFamily;
        this.series = series;
        this.machineType = machineType;
        this.addGPUs = false;
        this.localSSD = localSSD;
        this.region = region;
    }

    public Engine(String instancesNumber, String ocType, String nameOfProvisioningModel, String machineFamily,
                  String series, String machineType, String gpuModel, String numbOfGPU, String localSSD, String region) {
        this.instancesNumber = instancesNumber;
        this.ocType = ocType;
        this.nameOfProvisioningModel = nameOfProvisioningModel;
        this.machineFamily = machineFamily;
        this.series = series;
        this.machineType = machineType;
        this.addGPUs = true;
        this.gpuModel = gpuModel;
        this.numbOfGPU = numbOfGPU;
        this.localSSD = localSSD;
        this.region = region;
    }

    public Engine(String instancesNumber, String ocType, String nameOfProvisioningModel, String machineType,
                  Boolean addGPUs, String gpuModel, String numbOfGPU, String localSSD, String region) {
        this.instancesNumber = instancesNumber;
        this.ocType = ocType;
        this.nameOfProvisioningModel = nameOfProvisioningModel;
        this.machineType = machineType;
        this.addGPUs = addGPUs;
        this.gpuModel = gpuModel;
        this.numbOfGPU = numbOfGPU;
        this.localSSD = localSSD;
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(instancesNumber, engine.instancesNumber) && Objects.equals(ocType, engine.ocType)
                && Objects.equals(nameOfProvisioningModel, engine.nameOfProvisioningModel)
                && Objects.equals(machineType, engine.machineType) && Objects.equals(addGPUs, engine.addGPUs)
                && Objects.equals(gpuModel, engine.gpuModel) && Objects.equals(numbOfGPU, engine.numbOfGPU)
                && Objects.equals(localSSD, engine.localSSD) && Objects.equals(region, engine.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instancesNumber, ocType, nameOfProvisioningModel, machineType, addGPUs, gpuModel,
                numbOfGPU, localSSD, region);
    }

    public String getInstancesNumber() {
        return instancesNumber;
    }

    public String getOcType() {
        return ocType;
    }

    public String getNameOfProvisioningModel() {
        return nameOfProvisioningModel;
    }

    public String getMachineFamily() {
        return machineFamily;
    }

    public String getSeries() {
        return series;
    }

    public String getMachineType() {
        return machineType;
    }

    public Boolean getAddGPUs() {
        return addGPUs;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public String getNumbOfGPU() {
        return numbOfGPU;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getRegion() {
        return region;
    }
}
