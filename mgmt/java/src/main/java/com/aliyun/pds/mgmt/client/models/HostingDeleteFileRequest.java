// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * 删除文件请求
 */
public class HostingDeleteFileRequest extends TeaModel {
    // drive_id
    @NameInMap("drive_id")
    @Validation(pattern = "[0-9]+")
    public String driveId;

    // file_path
    @NameInMap("file_path")
    @Validation(required = true, maxLength = 1000, minLength = 1)
    public String filePath;

    // permanently
    // type: false
    @NameInMap("permanently")
    public Boolean permanently;

    // share_id
    @NameInMap("share_id")
    @Validation(pattern = "[0-9a-zA-Z-]+")
    public String shareId;

    public static HostingDeleteFileRequest build(java.util.Map<String, ?> map) throws Exception {
        HostingDeleteFileRequest self = new HostingDeleteFileRequest();
        return TeaModel.build(map, self);
    }

    public HostingDeleteFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public HostingDeleteFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public HostingDeleteFileRequest setPermanently(Boolean permanently) {
        this.permanently = permanently;
        return this;
    }
    public Boolean getPermanently() {
        return this.permanently;
    }

    public HostingDeleteFileRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
