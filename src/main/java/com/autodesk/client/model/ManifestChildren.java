/*
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. Take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package com.autodesk.client.model;

import java.util.Objects;

import com.autodesk.client.model.Messages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Children Manifest
 */
@ApiModel(description = "Children Manifest")

public class ManifestChildren   {
  /**
   * Type of this JSON object
   */
  public enum TypeEnum {
    RESOURCE("resource"),

    MANIFEST("manifest"),

    GEOMETRY("geometry"),

    VIEW("view");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * Output file type
   */
  public enum RoleEnum {
    _2D("2d"),

    _3D("3d"),

    GRAPHICS("graphics"),

    MANIFEST("manifest"),

    THUMBNAIL("thumbnail"),

    IFC("ifc"),

    //to solved the issue GetManifest is returning an unhandled role enum
    PROPERTYDB("Autodesk.CloudPlatform.PropertyDatabase");


    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("role")
  private RoleEnum role = null;

  @JsonProperty("guid")
  private String guid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phaseNames")
  private String phaseNames = null;

  @JsonProperty("viewableID")
  private String viewableID = null;

  @JsonProperty("hasThumbnail")
  private Boolean hasThumbnail = null;

  @JsonProperty("mime")
  private String mime = null;

  @JsonProperty("urn")
  private String urn = null;

  @JsonProperty("progress")
  private String progress = null;

  /**
   * Status of the requested entity; possible values are: `pending`, `success`, `inprogress`, `failed`, `timeout` and `partialsuccess`
   */
  public enum StatusEnum {
    PENDING("pending"),

    INPROGRESS("inprogress"),

    SUCCESS("success"),

    FAILED("failed"),

    TIMEOUT("timeout"),

    PARTIALSUCCESS("partialsuccess");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("resolution")
  private List<String> resolution = new ArrayList<String>();

  @JsonProperty("modelGUID")
  private String modelGUID = null;

  @JsonProperty("objectIds")
  private List<Integer> objectIds = new ArrayList<Integer>();

  @JsonProperty("messages")
  private Messages messages = null;

  @JsonProperty("children")
  private List<ManifestChildren> children = new ArrayList<ManifestChildren>();

  public ManifestChildren type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get children
   * @return children
   **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ManifestChildren> getChildren() {
    return children;
  }

  public void setChildren(List<ManifestChildren> children) {
    this.children = children;
  }

  /**
   * Type of this JSON object
   * @return type
   **/
  @ApiModelProperty(example = "null", required = true, value = "Type of this JSON object")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ManifestChildren role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Output file type
   * @return role
   **/
  @ApiModelProperty(example = "null", required = true, value = "Output file type")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ManifestChildren name(String name) {
    this.name = name;
    return this;
  }


  /**
   * GUID of the derivative child
   * @return guid
   **/
  @ApiModelProperty(example = "null", value = "GUID of the derivative child")
  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }


  /**
   * Name of the derivative child
   * @return name
   **/
  @ApiModelProperty(example = "null", value = "Name of the derivative child")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ManifestChildren hasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
    return this;
  }

  /**
   * Phasename of the derivative child
   * @return phaseNames
   **/
  @ApiModelProperty(example = "null", value = "Phasename of the derivative child")
  public String getPhaseNames() {
    return phaseNames;
  }

  public void setPhaseNames(String phaseNames) {
    this.phaseNames = phaseNames;
  }


  /**
   * ViewableID of the derivative child
   * @return viewableID
   **/
  @ApiModelProperty(example = "null", value = "ViewableID of the derivative child")
  public String getViewableID() {
    return viewableID;
  }

  public void setViewableID(String viewableID) {
    this.viewableID = viewableID;
  }


  /**
   * Indicates if a thumbnail has been generated 
   * @return hasThumbnail
   **/
  @ApiModelProperty(example = "null", value = "Indicates if a thumbnail has been generated ")
  public Boolean getHasThumbnail() {
    return hasThumbnail;
  }

  public void setHasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
  }

  public ManifestChildren mime(String mime) {
    this.mime = mime;
    return this;
  }

  /**
   * MIME type of the generated file
   * @return mime
   **/
  @ApiModelProperty(example = "null", required = true, value = "MIME type of the generated file")
  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public ManifestChildren urn(String urn) {
    this.urn = urn;
    return this;
  }

  /**
   * Output file URN; used as a file identifier
   * @return urn
   **/
  @ApiModelProperty(example = "null", value = "Output file URN; used as a file identifier")
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public ManifestChildren progress(String progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Translation progress for requested entity
   * @return progress
   **/
  @ApiModelProperty(example = "null", value = "Translation progress for requested entity")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public ManifestChildren status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the requested entity; possible values are: `pending`, `success`, `inprogress`, `failed`, `timeout` and `partialsuccess` 
   * @return status
   **/
  @ApiModelProperty(example = "null", value = "Status of the requested entity; possible values are: `pending`, `success`, `inprogress`, `failed`, `timeout` and `partialsuccess` ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ManifestChildren resolution(List<String> resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * Available thumbnail resolution
   * @return resolution
   **/
  @ApiModelProperty(example = "null", value = "Available thumbnail resolution")
  public List<String> getResolution() {
    return resolution;
  }

  public void setResolution(List<String> resolution) {
    this.resolution = resolution;
  }

  public ManifestChildren modelGUID(String modelGUID) {
    this.modelGUID = modelGUID;
    return this;
  }

  /**
   * Get modelGUID
   * @return modelGUID
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getModelGUID() {
    return modelGUID;
  }

  public void setModelGUID(String modelGUID) {
    this.modelGUID = modelGUID;
  }

  public ManifestChildren objectIds(List<Integer> objectIds) {
    this.objectIds = objectIds;
    return this;
  }

  /**
   * Get objectIds
   * @return objectIds
   **/
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getObjectIds() {
    return objectIds;
  }

  public void setObjectIds(List<Integer> objectIds) {
    this.objectIds = objectIds;
  }

  public ManifestChildren messages(Messages messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Get messages
   * @return messages
   **/
  @ApiModelProperty(example = "null", value = "")
  public Messages getMessages() {
    return messages;
  }

  public void setMessages(Messages messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestChildren manifestChildren = (ManifestChildren) o;
    return Objects.equals(this.type, manifestChildren.type) &&
            Objects.equals(this.role, manifestChildren.role) &&
            Objects.equals(this.name, manifestChildren.name) &&
            Objects.equals(this.hasThumbnail, manifestChildren.hasThumbnail) &&
            Objects.equals(this.mime, manifestChildren.mime) &&
            Objects.equals(this.urn, manifestChildren.urn) &&
            Objects.equals(this.progress, manifestChildren.progress) &&
            Objects.equals(this.status, manifestChildren.status) &&
            Objects.equals(this.resolution, manifestChildren.resolution) &&
            Objects.equals(this.modelGUID, manifestChildren.modelGUID) &&
            Objects.equals(this.objectIds, manifestChildren.objectIds) &&
            Objects.equals(this.messages, manifestChildren.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, role, name, hasThumbnail, mime, urn, progress, status, resolution, modelGUID, objectIds, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestChildren {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phaseNames: ").append(toIndentedString(phaseNames)).append("\n");
    sb.append("    viewableID: ").append(toIndentedString(viewableID)).append("\n");
    sb.append("    hasThumbnail: ").append(toIndentedString(hasThumbnail)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    modelGUID: ").append(toIndentedString(modelGUID)).append("\n");
    sb.append("    objectIds: ").append(toIndentedString(objectIds)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

