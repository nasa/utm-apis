package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Geometry;
import io.swagger.model.SimplePoint;
import java.util.ArrayList;
import java.util.List;

/**
 * MultiPolygon
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-15T16:53:28.339Z")

public class MultiPolygon extends Geometry  {
  @JsonProperty("coordinates")
  private List<List<List<SimplePoint>>> coordinates = new ArrayList<List<List<SimplePoint>>>();

  public MultiPolygon coordinates(List<List<List<SimplePoint>>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public MultiPolygon addCoordinatesItem(List<List<SimplePoint>> coordinatesItem) {
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")
  public List<List<List<SimplePoint>>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<List<SimplePoint>>> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPolygon multiPolygon = (MultiPolygon) o;
    return Objects.equals(this.coordinates, multiPolygon.coordinates) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPolygon {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

