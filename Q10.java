package TestCase;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utility.ExtentReportManager;

import static io.restassured.RestAssured.*;

public class Q10 {
	ResponseSpecification res;
	
	RequestSpecification req_spec;
	


	String str=" ";
	
	@BeforeClass
	public void setSpecification() {
		res = RestAssured.expect();
		res.statusLine("HTTP/1.1 200 Ok");
		res.contentType(ContentType.JSON);
		ExtentReportManager.createReport("API_Report");
	}
	@Test(priority=1)
		public void loginuser1() {
		HashMap<String,String>params = new HashMap<String,String>();
		params.put("username", "avez.kazi@pisystindia.com");
		params.put("password","Avez@123456");
		RestAssured.baseURI="https://arcadia.pisystindia.com/";
		Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("op is"+resp.asPrettyString());
		LinkedHashMap<String,Object> payload=resp.body().jsonPath().get("payload");
		}
		@Test(priority=2)
		public void loginuser() {
		HashMap<String,String>params = new HashMap<String,String>();
		params.put("username", "mugdhanerlekar25@gmail.com");
		params.put("password","Nerlekar@1008");
		RestAssured.baseURI="https://arcadia.pisystindia.com/";
		Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("op is"+resp.asPrettyString());
		LinkedHashMap<String,Object> payload=resp.body().jsonPath().get("payload");
		}
	
		@Test(priority=2)
	
	public void GeneralSetting() {
		RestAssured.baseURI ="https://arcadia.pisystindia.com/";
		Response resp=given().header("Authorization",str).when().get("api/generalSetting").then().contentType(ContentType.JSON).extract().response();
		System.out.println("get output is =" + resp.asPrettyString());
	}

}



