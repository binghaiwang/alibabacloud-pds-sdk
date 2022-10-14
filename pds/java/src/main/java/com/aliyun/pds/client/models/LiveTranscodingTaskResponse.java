// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * 实时转码信息task响应
 */
public class LiveTranscodingTaskResponse extends TeaModel {
    // keep_original_resolution 转码后的视频分辨率是否保持原画(template分辨率大于当前视频)
    @NameInMap("keep_original_resolution")
    public Boolean keepOriginalResolution;

    // preview_url, 视频片段预览播放地址
    @NameInMap("preview_url")
    public String previewUrl;

    // stage, 实时转码内部状态(Deprecated)
    @NameInMap("stage")
    public String stage;

    // status, 转码状态
    @NameInMap("status")
    public String status;

    // template_height
    @NameInMap("template_height")
    public Long templateHeight;

    // template_id, 转码模板id
    @NameInMap("template_id")
    public String templateId;

    // template_name, 模板文案id
    @NameInMap("template_name")
    public String templateName;

    // template_width
    @NameInMap("template_width")
    public Long templateWidth;

    // url, 视频播放地址
    @NameInMap("url")
    public String url;

    public static LiveTranscodingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        LiveTranscodingTaskResponse self = new LiveTranscodingTaskResponse();
        return TeaModel.build(map, self);
    }

    public LiveTranscodingTaskResponse setKeepOriginalResolution(Boolean keepOriginalResolution) {
        this.keepOriginalResolution = keepOriginalResolution;
        return this;
    }
    public Boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    public LiveTranscodingTaskResponse setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public LiveTranscodingTaskResponse setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public LiveTranscodingTaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LiveTranscodingTaskResponse setTemplateHeight(Long templateHeight) {
        this.templateHeight = templateHeight;
        return this;
    }
    public Long getTemplateHeight() {
        return this.templateHeight;
    }

    public LiveTranscodingTaskResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public LiveTranscodingTaskResponse setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public LiveTranscodingTaskResponse setTemplateWidth(Long templateWidth) {
        this.templateWidth = templateWidth;
        return this;
    }
    public Long getTemplateWidth() {
        return this.templateWidth;
    }

    public LiveTranscodingTaskResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
