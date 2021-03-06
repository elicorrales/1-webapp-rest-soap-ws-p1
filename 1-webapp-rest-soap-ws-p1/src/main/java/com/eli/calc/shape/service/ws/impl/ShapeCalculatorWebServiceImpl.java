package com.eli.calc.shape.service.ws.impl;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eli.calc.shape.service.ws.ShapeCalculatorWebService;
import com.eli.calc.shape.service.ws.resp.StatusCode;
import com.eli.calc.shape.service.ws.resp.StatusResponse;

//@WebService
public class ShapeCalculatorWebServiceImpl implements ShapeCalculatorWebService {


	private static final Logger logger = LoggerFactory.getLogger(ShapeCalculatorWebServiceImpl.class);

/*
	@Autowired
	private ShapeCalculatorService calculator;
*/	
	public ShapeCalculatorWebServiceImpl() {
		logger.debug("\n\n\nConstructor\n\n\n");
	}

	public void simpleNoResp() {
	}


	public String simpleString() {
		return "TEST";
	}

	public String simpleStringXml() {
		return "XML";
	}

	public String simpleStringJSON() {
		return "JSON";
	}

	public String simpleStringJSONnXML() {
		return "JSONnXML";
	}

/*
	public StatusCode statusCode() {
		return StatusCode.SUCCESS;
	}

	public StatusResponse statusCodeResponse() {
		return new StatusResponse();
	}
*/	
/*
	@Override
	public ShapeNamesResponse getShapeNames() {
		ShapeNamesResponse response = new ShapeNamesResponse();
		response.setCode(StatusCode.SUCCESS);
		response.setDescription("");
		return response;
	}

	@Override
	public CalcTypesResponse getCalcTypes() {
		CalcTypesResponse response = new CalcTypesResponse();
		response.setCode(StatusCode.SUCCESS);
		response.setDescription("");
		return response;
	}


	@Override
	public StatusResponse deletePendingRequests() {

		logger.debug("\n\n\nExecuting operation deletePendingRequests...\n\n\n");

		StatusResponse response = null;
		try {
			
			calculator.deleteAllPendingRequests();
			response = new StatusResponse(StatusCode.SUCCESS,"Requests Deleted");

		} catch (Exception e) {
			logger.error("Error attempting to deletePendingRequests",e);
			response = new StatusResponse("Error Attempting to Delete Requests",e);
		}
		
		return response;
	}

	@Override
	public StatusResponse deleteResults() {

		logger.debug("\n\n\nExecuting operation deleteResults...\n\n\n");

		StatusResponse response = null;
		try {
			
			calculator.deleteAllResults();
			response = new StatusResponse(StatusCode.SUCCESS,"Results Deleted");

		} catch (Exception e) {
			logger.error("Error attempting to deleteResults",e);
			response = new StatusResponse("Error Attempting to Delete Results",e);
		}
		
		return response;
	}

	@Override
	public StatusResponse queueCalculation(QueueCalculationParms parameters) {

		if (null!=parameters) {
			logger.debug("\n\n\nExecuting operation queueCalculation:"
				+parameters.getShapeName()+","
				+parameters.getCalcType()+","+
				parameters.getDimension()+" ...\n\n\n");
		} else {
			logger.debug("\n\n\nExecuting operation queueCalculation with NULL parameters...\n\n\n");
		}
		
		StatusResponse response = null;
		try {
			
			calculator.queueCalculationRequest(
				parameters.getShapeName(), parameters.getCalcType(), parameters.getDimension()
					);
			response = new StatusResponse(
					StatusCode.SUCCESS,
					"Request queued:"
					+parameters.getShapeName()+","
					+parameters.getCalcType()+","+
					parameters.getDimension());

		} catch (Exception e) {
			logger.error("Error attempting to queueCalculation",e);
			response = new StatusResponse("Error Attempting to Queue Calculation ",e);
		}

		return response;
	}

	@Override
	public PendingRequestsResponse getPendingRequests() {

		logger.debug("\n\n\nExecuting operation getPendingRequests...\n\n\n");

		PendingRequestsResponse response = null;
		try {
			
			List<CalculationRequest> list = calculator.getAllPendingRequests();
			response = new PendingRequestsResponse(list);

		} catch (InvalidDataAccessApiUsageException e) {
			logger.error("Error getPendingRequests: Unexpected Persistent Data. Check Database.",e);
			response = new PendingRequestsResponse(e);
	
		} catch (Exception e) {
			logger.error("Error attempting to getPendingRequests",e);
			response = new PendingRequestsResponse(e);
		}
	
		return response;
	}

	@Override
	public CalculatedResultsResponse getCalculatedResults() {

		logger.debug("\n\n\nExecuting operation getCalculatedResults...\n\n\n");

		CalculatedResultsResponse response = null;
		try {
			
			List<CalculationResult> list = calculator.getAllCalculatedResults();
			response = new CalculatedResultsResponse(list);

		} catch (Exception e) {
			logger.error("Error attempting to getCalculatedResults",e);
			response = new CalculatedResultsResponse(e);
		}
		
		return response;
	}

	@Override
	public RunPendingRequestsResponse runPendingRequestsStopOnError() {

		logger.debug("\n\n\nExecuting operation runPendingRequestsStopOnError...\n\n\n");

		RunPendingRequestsResponse response = null;
		try {
			
			int numRun = calculator.runAllPendingRequestsStopOnError();
			response = new RunPendingRequestsResponse(numRun);

		} catch (Exception e) {
			logger.error("Error attempting to runPendingRequestsStopOnError",e);
			response = new RunPendingRequestsResponse(e);
		}
		
		return response;
	}

	@Override
	public RunPendingRequestsResponse runPendingRequestsNoStopOnError() {

		logger.debug("\n\n\nExecuting operation runPendingRequestsNoStopOnError ...\n\n\n");

		RunPendingRequestsResponse response = null;
		try {
			
			int numRun = calculator.runAllPendingRequestsNoStopOnError();
			response = new RunPendingRequestsResponse(numRun);

		} catch (Exception e) {
			logger.error("Error attempting to runPendingRequestsNoStopOnError",e);
			response = new RunPendingRequestsResponse(e);
		}
		
		return response;
	}
*/
}
