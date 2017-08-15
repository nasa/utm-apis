package io.swagger.api;

import io.swagger.model.Sds;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-15T16:53:28.339Z")

@Controller
public class SdsApiController implements SdsApi {

    public ResponseEntity<Sds> getSds(@ApiParam(value = "The specific subset of fields to return. Comma separated list. Default will be all fields.") @RequestParam(value = "fields", required = false) String fields,
        @ApiParam(value = "Query with specific criteria.  <br/><br/> <b>example usage:</b><br/> ``` .../api/v1/sds?q=labels contains weather, time_available_begin gte 2016-10-02T00:00:00Z, coverage_area contains POINT (-122.056455 37.414336)  ``` ``` .../api/v1/sds?q=labels contains weather&labels contains cow&auth_required eq false ``` <br/><br/> A series of binary operators and operands. - The lefthand side operands are the field names. - The righthand side (RHS) operands are *constants* of the corresponding type. - The allowed operators are dependent on the operand types.      - **geometric operands:** the RHS input should be [OGC well-known text](http://en.wikipedia.org/wiki/Well-known_text), limited to point, linestring, and polygon types. Geometric-types operands may use `intersects`, `contains`, and `within`.  <br/> We also allow the non-standard bounding box as a geometric RHS. This is of the form BBOX(lower_left_long lower_left_lat, upper_right_lon upper_right_lat).  <br/>      - **String operands** may use `eq`, `contains`, and `not`.  <br/>      - **Numeric operands** may use `eq`, `lt`, `lte`, `gt`, `gte`, and `not`. <br/>      - **Time operands** may use `eq`, `lt`, `lte`, `gt`, `gte`, and `not`.  RHS must be supplied in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601)<br/>      - **String *array* operands** may only use `contains`. The RHS string will     be checked for partial matches against all strings in the LHS array. The RHS     string has a minimum length of three characters.          - **Boolean operands** may only use `eq`.   If multiple criteria are specified, they are considered as an *AND* operation.  Multiple criteria may be provided via multiple q parameters. <br/> ") @RequestParam(value = "q", required = false) String q,
        @ApiParam(value = "A valid field name to use for sorting records. If multiple fields are provided, the sorting is based on the ordered priorty of that list.", defaultValue = "time_submitted") @RequestParam(value = "sort", required = false, defaultValue="time_submitted") String sort,
        @ApiParam(value = "For optional use with the 'sort' parameter. If 'sort' is not provided, then 'sort_increasing' will be ignored. Boolean value.  If multiple fields are provided in the 'sort' paramenter, this boolean value will apply to all of them.", defaultValue = "true") @RequestParam(value = "sortIncreasing", required = false, defaultValue="true") Boolean sortIncreasing,
        @ApiParam(value = "The maximum number or records to return.", defaultValue = "10") @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,
        @ApiParam(value = "The index from which to begin the list of returned records.", defaultValue = "0") @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset) {
        // do some magic!
        return new ResponseEntity<Sds>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postSds(@ApiParam(value = "Description of the data service" ,required=true ) @RequestBody Sds sds) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Sds> putSds(@ApiParam(value = "Operational plan with the following properties:   1. Contains a valid uss_operation_id.   2. time_available_end value that is in the future.   3. No date-time fields that are in the past are modified.   4. Other rules for a USS Operation POST are satisfied. " ,required=true ) @RequestBody Sds sds) {
        // do some magic!
        return new ResponseEntity<Sds>(HttpStatus.OK);
    }

}
