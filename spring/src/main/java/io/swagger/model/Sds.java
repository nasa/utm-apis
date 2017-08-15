package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Geometry;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A contiguous area within which a USS has committed to providing services for UAS operations.  The specific level of services provided may be contained within the data provided from here in combination with data provided directly from the USS.  In the future, the information provided by this object may include more specific information about the services provided by the USS or the types of UAS operations that are supported by this USS Operation.
 */
@ApiModel(description = "A contiguous area within which a USS has committed to providing services for UAS operations.  The specific level of services provided may be contained within the data provided from here in combination with data provided directly from the USS.  In the future, the information provided by this object may include more specific information about the services provided by the USS or the types of UAS operations that are supported by this USS Operation.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-15T16:53:28.339Z")

public class Sds   {
  @JsonProperty("sds_id")
  private String sdsId = null;

  @JsonProperty("sds_provider")
  private String sdsProvider = null;

  @JsonProperty("sds_name")
  private String sdsName = null;

  @JsonProperty("time_submitted")
  private DateTime timeSubmitted = null;

  @JsonProperty("time_available_begin")
  private DateTime timeAvailableBegin = null;

  @JsonProperty("time_available_end")
  private DateTime timeAvailableEnd = null;

  @JsonProperty("coverage_area")
  private Geometry coverageArea = null;

  @JsonProperty("time_last_modified")
  private DateTime timeLastModified = null;

  @JsonProperty("contact_email")
  private String contactEmail = "Not provided";

  @JsonProperty("contact_phone")
  private String contactPhone = "Not provided";

  @JsonProperty("auth_required")
  private Boolean authRequired = false;

  @JsonProperty("auth_description")
  private String authDescription = null;

  @JsonProperty("sdsp_informational_url")
  private String sdspInformationalUrl = null;

  @JsonProperty("sdsp_openapi_url")
  private String sdspOpenapiUrl = null;

  @JsonProperty("sdsp_registration_url")
  private String sdspRegistrationUrl = null;

  @JsonProperty("labels")
  private List<String> labels = new ArrayList<String>();

  @JsonProperty("notes")
  private String notes = "NOT PROVIDED";

  public Sds sdsId(String sdsId) {
    this.sdsId = sdsId;
    return this;
  }

   /**
   * A unique identifier assigned by the discovery service upon successful submission.
   * @return sdsId
  **/
  @ApiModelProperty(value = "A unique identifier assigned by the discovery service upon successful submission.")
  public String getSdsId() {
    return sdsId;
  }

  public void setSdsId(String sdsId) {
    this.sdsId = sdsId;
  }

  public Sds sdsProvider(String sdsProvider) {
    this.sdsProvider = sdsProvider;
    return this;
  }

   /**
   * The name of the entity providing data service.
   * @return sdsProvider
  **/
  @ApiModelProperty(example = "Wonder Weather, Inc.", required = true, value = "The name of the entity providing data service.")
  public String getSdsProvider() {
    return sdsProvider;
  }

  public void setSdsProvider(String sdsProvider) {
    this.sdsProvider = sdsProvider;
  }

  public Sds sdsName(String sdsName) {
    this.sdsName = sdsName;
    return this;
  }

   /**
   * A name for this SDSP.
   * @return sdsName
  **/
  @ApiModelProperty(example = "Super Weather Service", required = true, value = "A name for this SDSP.")
  public String getSdsName() {
    return sdsName;
  }

  public void setSdsName(String sdsName) {
    this.sdsName = sdsName;
  }

  public Sds timeSubmitted(DateTime timeSubmitted) {
    this.timeSubmitted = timeSubmitted;
    return this;
  }

   /**
   * The time at which the submission of this SDSP was received at this discovery service.  Only modifiable by discovery service. ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ
   * @return timeSubmitted
  **/
  @ApiModelProperty(value = "The time at which the submission of this SDSP was received at this discovery service.  Only modifiable by discovery service. ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ")
  public DateTime getTimeSubmitted() {
    return timeSubmitted;
  }

  public void setTimeSubmitted(DateTime timeSubmitted) {
    this.timeSubmitted = timeSubmitted;
  }

  public Sds timeAvailableBegin(DateTime timeAvailableBegin) {
    this.timeAvailableBegin = timeAvailableBegin;
    return this;
  }

   /**
   * The time at which the SDSP will begin available to provide services Note that the SDSP may be availble for other information (registration, contact data, service descriptions, etc.) prior to  this time.  time_available_begin must be earlier than time_available_end.  time_available_begin cannot be more than one month later than time_submitted. ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ
   * @return timeAvailableBegin
  **/
  @ApiModelProperty(required = true, value = "The time at which the SDSP will begin available to provide services Note that the SDSP may be availble for other information (registration, contact data, service descriptions, etc.) prior to  this time.  time_available_begin must be earlier than time_available_end.  time_available_begin cannot be more than one month later than time_submitted. ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ")
  public DateTime getTimeAvailableBegin() {
    return timeAvailableBegin;
  }

  public void setTimeAvailableBegin(DateTime timeAvailableBegin) {
    this.timeAvailableBegin = timeAvailableBegin;
  }

  public Sds timeAvailableEnd(DateTime timeAvailableEnd) {
    this.timeAvailableEnd = timeAvailableEnd;
    return this;
  }

   /**
   * The time at which the SDSP will cease providing services. time_available_end must be later than time_available_begin. ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ
   * @return timeAvailableEnd
  **/
  @ApiModelProperty(required = true, value = "The time at which the SDSP will cease providing services. time_available_end must be later than time_available_begin. ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ")
  public DateTime getTimeAvailableEnd() {
    return timeAvailableEnd;
  }

  public void setTimeAvailableEnd(DateTime timeAvailableEnd) {
    this.timeAvailableEnd = timeAvailableEnd;
  }

  public Sds coverageArea(Geometry coverageArea) {
    this.coverageArea = coverageArea;
    return this;
  }

   /**
   * Get coverageArea
   * @return coverageArea
  **/
  @ApiModelProperty(required = true, value = "")
  public Geometry getCoverageArea() {
    return coverageArea;
  }

  public void setCoverageArea(Geometry coverageArea) {
    this.coverageArea = coverageArea;
  }

  public Sds timeLastModified(DateTime timeLastModified) {
    this.timeLastModified = timeLastModified;
    return this;
  }

   /**
   * The last time there was an update to the data regarding this SDSP.  Only modifiable by discovery service.  ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ
   * @return timeLastModified
  **/
  @ApiModelProperty(example = "2017-05-25T21:24:41Z", value = "The last time there was an update to the data regarding this SDSP.  Only modifiable by discovery service.  ISO 8601 compliant: YYYY-MM-DDTHH:mm:ssZ")
  public DateTime getTimeLastModified() {
    return timeLastModified;
  }

  public void setTimeLastModified(DateTime timeLastModified) {
    this.timeLastModified = timeLastModified;
  }

  public Sds contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * An optional contact email address for the SDS.
   * @return contactEmail
  **/
  @ApiModelProperty(value = "An optional contact email address for the SDS.")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public Sds contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * An optional contact number for the SDS.
   * @return contactPhone
  **/
  @ApiModelProperty(example = "650-555-5555 or +1-510-555-2222", value = "An optional contact number for the SDS.")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public Sds authRequired(Boolean authRequired) {
    this.authRequired = authRequired;
    return this;
  }

   /**
   * Boolean field designating if authentication and/or authorization are required to use this supplemental data service.  A 'false' value for this field implies anonymous, complete access to the data service.
   * @return authRequired
  **/
  @ApiModelProperty(value = "Boolean field designating if authentication and/or authorization are required to use this supplemental data service.  A 'false' value for this field implies anonymous, complete access to the data service.")
  public Boolean getAuthRequired() {
    return authRequired;
  }

  public void setAuthRequired(Boolean authRequired) {
    this.authRequired = authRequired;
  }

  public Sds authDescription(String authDescription) {
    this.authDescription = authDescription;
    return this;
  }

   /**
   * If authentiation or authorization are required, this field could be  used by teh SDSP to briefly describe what is required for access.
   * @return authDescription
  **/
  @ApiModelProperty(value = "If authentiation or authorization are required, this field could be  used by teh SDSP to briefly describe what is required for access.")
  public String getAuthDescription() {
    return authDescription;
  }

  public void setAuthDescription(String authDescription) {
    this.authDescription = authDescription;
  }

  public Sds sdspInformationalUrl(String sdspInformationalUrl) {
    this.sdspInformationalUrl = sdspInformationalUrl;
    return this;
  }

   /**
   * An optional website URL for the SDS intended for human use.
   * @return sdspInformationalUrl
  **/
  @ApiModelProperty(value = "An optional website URL for the SDS intended for human use.")
  public String getSdspInformationalUrl() {
    return sdspInformationalUrl;
  }

  public void setSdspInformationalUrl(String sdspInformationalUrl) {
    this.sdspInformationalUrl = sdspInformationalUrl;
  }

  public Sds sdspOpenapiUrl(String sdspOpenapiUrl) {
    this.sdspOpenapiUrl = sdspOpenapiUrl;
    return this;
  }

   /**
   * An optional URL for the SDSP to supply an OpenAPI specification of its interface. This field is highly recommended to aid in standardizing access to UTM data services.
   * @return sdspOpenapiUrl
  **/
  @ApiModelProperty(value = "An optional URL for the SDSP to supply an OpenAPI specification of its interface. This field is highly recommended to aid in standardizing access to UTM data services.")
  public String getSdspOpenapiUrl() {
    return sdspOpenapiUrl;
  }

  public void setSdspOpenapiUrl(String sdspOpenapiUrl) {
    this.sdspOpenapiUrl = sdspOpenapiUrl;
  }

  public Sds sdspRegistrationUrl(String sdspRegistrationUrl) {
    this.sdspRegistrationUrl = sdspRegistrationUrl;
    return this;
  }

   /**
   * An optional URL for users to register to use this data service.
   * @return sdspRegistrationUrl
  **/
  @ApiModelProperty(value = "An optional URL for users to register to use this data service.")
  public String getSdspRegistrationUrl() {
    return sdspRegistrationUrl;
  }

  public void setSdspRegistrationUrl(String sdspRegistrationUrl) {
    this.sdspRegistrationUrl = sdspRegistrationUrl;
  }

  public Sds labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public Sds addLabelsItem(String labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * An array of short, descriptive tags to aid users in searching for supplementary data services. 
   * @return labels
  **/
  @ApiModelProperty(example = "&quot; weather, winds, precipitation, streaming_data&quot;", value = "An array of short, descriptive tags to aid users in searching for supplementary data services. ")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public Sds notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Any additional free text that would aid consumers of the service discovery API in understanding this data service.
   * @return notes
  **/
  @ApiModelProperty(example = "This data service excels at servicing data.", value = "Any additional free text that would aid consumers of the service discovery API in understanding this data service.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sds sds = (Sds) o;
    return Objects.equals(this.sdsId, sds.sdsId) &&
        Objects.equals(this.sdsProvider, sds.sdsProvider) &&
        Objects.equals(this.sdsName, sds.sdsName) &&
        Objects.equals(this.timeSubmitted, sds.timeSubmitted) &&
        Objects.equals(this.timeAvailableBegin, sds.timeAvailableBegin) &&
        Objects.equals(this.timeAvailableEnd, sds.timeAvailableEnd) &&
        Objects.equals(this.coverageArea, sds.coverageArea) &&
        Objects.equals(this.timeLastModified, sds.timeLastModified) &&
        Objects.equals(this.contactEmail, sds.contactEmail) &&
        Objects.equals(this.contactPhone, sds.contactPhone) &&
        Objects.equals(this.authRequired, sds.authRequired) &&
        Objects.equals(this.authDescription, sds.authDescription) &&
        Objects.equals(this.sdspInformationalUrl, sds.sdspInformationalUrl) &&
        Objects.equals(this.sdspOpenapiUrl, sds.sdspOpenapiUrl) &&
        Objects.equals(this.sdspRegistrationUrl, sds.sdspRegistrationUrl) &&
        Objects.equals(this.labels, sds.labels) &&
        Objects.equals(this.notes, sds.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdsId, sdsProvider, sdsName, timeSubmitted, timeAvailableBegin, timeAvailableEnd, coverageArea, timeLastModified, contactEmail, contactPhone, authRequired, authDescription, sdspInformationalUrl, sdspOpenapiUrl, sdspRegistrationUrl, labels, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sds {\n");
    
    sb.append("    sdsId: ").append(toIndentedString(sdsId)).append("\n");
    sb.append("    sdsProvider: ").append(toIndentedString(sdsProvider)).append("\n");
    sb.append("    sdsName: ").append(toIndentedString(sdsName)).append("\n");
    sb.append("    timeSubmitted: ").append(toIndentedString(timeSubmitted)).append("\n");
    sb.append("    timeAvailableBegin: ").append(toIndentedString(timeAvailableBegin)).append("\n");
    sb.append("    timeAvailableEnd: ").append(toIndentedString(timeAvailableEnd)).append("\n");
    sb.append("    coverageArea: ").append(toIndentedString(coverageArea)).append("\n");
    sb.append("    timeLastModified: ").append(toIndentedString(timeLastModified)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    authRequired: ").append(toIndentedString(authRequired)).append("\n");
    sb.append("    authDescription: ").append(toIndentedString(authDescription)).append("\n");
    sb.append("    sdspInformationalUrl: ").append(toIndentedString(sdspInformationalUrl)).append("\n");
    sb.append("    sdspOpenapiUrl: ").append(toIndentedString(sdspOpenapiUrl)).append("\n");
    sb.append("    sdspRegistrationUrl: ").append(toIndentedString(sdspRegistrationUrl)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

