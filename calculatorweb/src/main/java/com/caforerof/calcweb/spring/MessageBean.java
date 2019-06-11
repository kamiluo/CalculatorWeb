package com.caforerof.calcweb.spring;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.caforerof.calculator.responses.OperandResponse;
import com.caforerof.calculator.responses.OperatorResponse;
import com.caforerof.calculator.responses.SessionIdResponse;

@Service
public class MessageBean {

    public long getSession() {
    	RestTemplate restTemplate = new RestTemplate();
    	SessionIdResponse answer = restTemplate.getForObject("http://localhost:8080/calculatorApi/getSessionId", SessionIdResponse.class);
    	return answer.getSessionId();
    }
    
    public String setOperand(double operand, long idSession) {
    	RestTemplate restTemplate = new RestTemplate();
    	OperandResponse answer = restTemplate.getForObject("http://localhost:8080/calculatorApi/addOperand/" + operand + "/" + idSession, OperandResponse.class);
    	return answer.getMessage();
    }
    
    public String setOperator(String operator, long idSession) {
    	RestTemplate restTemplate = new RestTemplate();
    	OperatorResponse answer = restTemplate.getForObject("http://localhost:8080/calculatorApi/setOperator/" + operator + "/" + idSession, OperatorResponse.class);
    	return String.valueOf(answer.getMessage() + " El resultado es : " + answer.getResult());
    }
}
