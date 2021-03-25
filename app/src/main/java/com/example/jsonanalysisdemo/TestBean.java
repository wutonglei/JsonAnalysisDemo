package com.example.jsonanalysisdemo;

import java.util.List;

public class TestBean {
    @Override
    public String toString() {
        return "TestBean{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 0
     * msg : SUCCESS
     * data : {"total":3,"pageNo":1,"pageSize":1,"list":[{"indexCode":"df8w8cr800283c24c","resourceType":"camera","externalIndexCode":"gb1231341","name":"资源1","chanNum":1,"cascadeCode":"8w8cy82c084y0289c3","parentIndexCode":"80d9099q9e991231","longitude":5,"latitude":5,"elevation":"12","cameraType":1,"capability":"vss","recordLocation":"12","channelType":"analog","regionIndexCode":"d8a5476e-25c0-4aa2-b7e3-db3788ba1f77","regionPath":"@root000000@","transType":0,"treatyType":"hiksdk_net","installLocation":"vault","createTime":"2018-11-28T16:47:27:358+08:00","updateTime":"2018-11-28T16:48:34:011+08:00","disOrder":433,"resourceIndexCode":"a13a1e641ed841a2bd7567e5d00235d2","decodeTag":"hikvision","cameraRelateTalk":"bf097a5a30634db3b3c4a797c66e4a14","regionName":"@root000000@22c61b3e-7fea-46ed-89c4-b310d9fd9fe7@","regionPathName":"根节点/global_setUp_02178"}]}
     */

    private String code;
    private String msg;
    private DataDTO data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        @Override
        public String toString() {
            return "DataDTO{" +
                    "total=" + total +
                    ", pageNo=" + pageNo +
                    ", pageSize=" + pageSize +
                    ", list=" + list +
                    '}';
        }

        /**
         * total : 3
         * pageNo : 1
         * pageSize : 1
         * list : [{"indexCode":"df8w8cr800283c24c","resourceType":"camera","externalIndexCode":"gb1231341","name":"资源1","chanNum":1,"cascadeCode":"8w8cy82c084y0289c3","parentIndexCode":"80d9099q9e991231","longitude":5,"latitude":5,"elevation":"12","cameraType":1,"capability":"vss","recordLocation":"12","channelType":"analog","regionIndexCode":"d8a5476e-25c0-4aa2-b7e3-db3788ba1f77","regionPath":"@root000000@","transType":0,"treatyType":"hiksdk_net","installLocation":"vault","createTime":"2018-11-28T16:47:27:358+08:00","updateTime":"2018-11-28T16:48:34:011+08:00","disOrder":433,"resourceIndexCode":"a13a1e641ed841a2bd7567e5d00235d2","decodeTag":"hikvision","cameraRelateTalk":"bf097a5a30634db3b3c4a797c66e4a14","regionName":"@root000000@22c61b3e-7fea-46ed-89c4-b310d9fd9fe7@","regionPathName":"根节点/global_setUp_02178"}]
         */

        private Integer total;
        private Integer pageNo;
        private Integer pageSize;
        private List<ListDTO> list;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getPageNo() {
            return pageNo;
        }

        public void setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public List<ListDTO> getList() {
            return list;
        }

        public void setList(List<ListDTO> list) {
            this.list = list;
        }

        public static class ListDTO {
            @Override
            public String toString() {
                return "ListDTO{" +
                        "indexCode='" + indexCode + '\'' +
                        ", resourceType='" + resourceType + '\'' +
                        ", externalIndexCode='" + externalIndexCode + '\'' +
                        ", name='" + name + '\'' +
                        ", chanNum=" + chanNum +
                        ", cascadeCode='" + cascadeCode + '\'' +
                        ", parentIndexCode='" + parentIndexCode + '\'' +
                        ", longitude=" + longitude +
                        ", latitude=" + latitude +
                        ", elevation='" + elevation + '\'' +
                        ", cameraType=" + cameraType +
                        ", capability='" + capability + '\'' +
                        ", recordLocation='" + recordLocation + '\'' +
                        ", channelType='" + channelType + '\'' +
                        ", regionIndexCode='" + regionIndexCode + '\'' +
                        ", regionPath='" + regionPath + '\'' +
                        ", transType=" + transType +
                        ", treatyType='" + treatyType + '\'' +
                        ", installLocation='" + installLocation + '\'' +
                        ", createTime='" + createTime + '\'' +
                        ", updateTime='" + updateTime + '\'' +
                        ", disOrder=" + disOrder +
                        ", resourceIndexCode='" + resourceIndexCode + '\'' +
                        ", decodeTag='" + decodeTag + '\'' +
                        ", cameraRelateTalk='" + cameraRelateTalk + '\'' +
                        ", regionName='" + regionName + '\'' +
                        ", regionPathName='" + regionPathName + '\'' +
                        '}';
            }

            /**
             * indexCode : df8w8cr800283c24c
             * resourceType : camera
             * externalIndexCode : gb1231341
             * name : 资源1
             * chanNum : 1
             * cascadeCode : 8w8cy82c084y0289c3
             * parentIndexCode : 80d9099q9e991231
             * longitude : 5
             * latitude : 5
             * elevation : 12
             * cameraType : 1
             * capability : vss
             * recordLocation : 12
             * channelType : analog
             * regionIndexCode : d8a5476e-25c0-4aa2-b7e3-db3788ba1f77
             * regionPath : @root000000@
             * transType : 0
             * treatyType : hiksdk_net
             * installLocation : vault
             * createTime : 2018-11-28T16:47:27:358+08:00
             * updateTime : 2018-11-28T16:48:34:011+08:00
             * disOrder : 433
             * resourceIndexCode : a13a1e641ed841a2bd7567e5d00235d2
             * decodeTag : hikvision
             * cameraRelateTalk : bf097a5a30634db3b3c4a797c66e4a14
             * regionName : @root000000@22c61b3e-7fea-46ed-89c4-b310d9fd9fe7@
             * regionPathName : 根节点/global_setUp_02178
             */

            private String indexCode;
            private String resourceType;
            private String externalIndexCode;
            private String name;
            private Integer chanNum;
            private String cascadeCode;
            private String parentIndexCode;
            private Integer longitude;
            private Integer latitude;
            private String elevation;
            private Integer cameraType;
            private String capability;
            private String recordLocation;
            private String channelType;
            private String regionIndexCode;
            private String regionPath;
            private Integer transType;
            private String treatyType;
            private String installLocation;
            private String createTime;
            private String updateTime;
            private Integer disOrder;
            private String resourceIndexCode;
            private String decodeTag;
            private String cameraRelateTalk;
            private String regionName;
            private String regionPathName;

            public String getIndexCode() {
                return indexCode;
            }

            public void setIndexCode(String indexCode) {
                this.indexCode = indexCode;
            }

            public String getResourceType() {
                return resourceType;
            }

            public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
            }

            public String getExternalIndexCode() {
                return externalIndexCode;
            }

            public void setExternalIndexCode(String externalIndexCode) {
                this.externalIndexCode = externalIndexCode;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getChanNum() {
                return chanNum;
            }

            public void setChanNum(Integer chanNum) {
                this.chanNum = chanNum;
            }

            public String getCascadeCode() {
                return cascadeCode;
            }

            public void setCascadeCode(String cascadeCode) {
                this.cascadeCode = cascadeCode;
            }

            public String getParentIndexCode() {
                return parentIndexCode;
            }

            public void setParentIndexCode(String parentIndexCode) {
                this.parentIndexCode = parentIndexCode;
            }

            public Integer getLongitude() {
                return longitude;
            }

            public void setLongitude(Integer longitude) {
                this.longitude = longitude;
            }

            public Integer getLatitude() {
                return latitude;
            }

            public void setLatitude(Integer latitude) {
                this.latitude = latitude;
            }

            public String getElevation() {
                return elevation;
            }

            public void setElevation(String elevation) {
                this.elevation = elevation;
            }

            public Integer getCameraType() {
                return cameraType;
            }

            public void setCameraType(Integer cameraType) {
                this.cameraType = cameraType;
            }

            public String getCapability() {
                return capability;
            }

            public void setCapability(String capability) {
                this.capability = capability;
            }

            public String getRecordLocation() {
                return recordLocation;
            }

            public void setRecordLocation(String recordLocation) {
                this.recordLocation = recordLocation;
            }

            public String getChannelType() {
                return channelType;
            }

            public void setChannelType(String channelType) {
                this.channelType = channelType;
            }

            public String getRegionIndexCode() {
                return regionIndexCode;
            }

            public void setRegionIndexCode(String regionIndexCode) {
                this.regionIndexCode = regionIndexCode;
            }

            public String getRegionPath() {
                return regionPath;
            }

            public void setRegionPath(String regionPath) {
                this.regionPath = regionPath;
            }

            public Integer getTransType() {
                return transType;
            }

            public void setTransType(Integer transType) {
                this.transType = transType;
            }

            public String getTreatyType() {
                return treatyType;
            }

            public void setTreatyType(String treatyType) {
                this.treatyType = treatyType;
            }

            public String getInstallLocation() {
                return installLocation;
            }

            public void setInstallLocation(String installLocation) {
                this.installLocation = installLocation;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public Integer getDisOrder() {
                return disOrder;
            }

            public void setDisOrder(Integer disOrder) {
                this.disOrder = disOrder;
            }

            public String getResourceIndexCode() {
                return resourceIndexCode;
            }

            public void setResourceIndexCode(String resourceIndexCode) {
                this.resourceIndexCode = resourceIndexCode;
            }

            public String getDecodeTag() {
                return decodeTag;
            }

            public void setDecodeTag(String decodeTag) {
                this.decodeTag = decodeTag;
            }

            public String getCameraRelateTalk() {
                return cameraRelateTalk;
            }

            public void setCameraRelateTalk(String cameraRelateTalk) {
                this.cameraRelateTalk = cameraRelateTalk;
            }

            public String getRegionName() {
                return regionName;
            }

            public void setRegionName(String regionName) {
                this.regionName = regionName;
            }

            public String getRegionPathName() {
                return regionPathName;
            }

            public void setRegionPathName(String regionPathName) {
                this.regionPathName = regionPathName;
            }
        }
    }
}
