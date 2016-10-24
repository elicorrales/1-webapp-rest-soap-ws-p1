package com.eli.calc.shape.service.ws;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eli.calc.shape.service.ws.resp.StatusCode;
import com.eli.calc.shape.service.ws.resp.StatusResponse;

@WebService       //Needed for SOAP, not for REST 
@Path("/shapecalc") // Needed For REST
					// without it, CXF WADL2JAVA complains of no resources
					// and Swagger will have no resource definitions
public interface ShapeCalculatorWebService {

	@GET
	@Path("/simple-no-resp")
	void simpleNoResp();
	
	@GET
	//@Produces is not defined here
	@Path("/simple-string")
	String simpleString();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/simple-string-xml")
	String simpleStringXml();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/simple-string-json")
	String simpleStringJSON();

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/simple-string-json-xml")
	String simpleStringJSONnXML();

	
/*
	@GET
	@Path("/status-code")
	StatusCode statusCode();//Enum


	@GET
	@Path("/status-code")
	StatusResponse statusCodeResponse(); //Custom response; also contains Enum
*/

/*
	@GET
	@Path("/shapeNames")
	ShapeNamesResponse getShapeNames();
	
	@GET
	@Path("/calcTypes")
	CalcTypesResponse getCalcTypes();
	
	@DELETE
	@Path("/pending")
	StatusResponse deletePendingRequests();
	
	@DELETE
	@Path("/results")
	StatusResponse deleteResults();
	
	@PUT
	@Path("/pending")
	@WebMethod(operationName="queueCalculation")
    StatusResponse queueCalculation(
    		@WebParam(
    				name="QueueCalculationParms",
    				targetNamespace = "http://parms.ws.service.shape.calc.eli.com/"
    				)
    		@XmlElement(required=true)
    		QueueCalculationParms parameters
    		);


    @GET
    @Path("/pending")
	PendingRequestsResponse getPendingRequests();
	
    @GET
    @Path("/results")
	CalculatedResultsResponse getCalculatedResults();
	
    @PUT
    @Path("/run/stop")
	RunPendingRequestsResponse runPendingRequestsStopOnError();

    @PUT
    @Path("/run/nostop")
	RunPendingRequestsResponse runPendingRequestsNoStopOnError();
*/	
}