package TestCase;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utility.ExtentReportManager;

public class Q9 {
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
	
	public void GeneralSetting() {
		RestAssured.baseURI ="https://arcadia.pisystindia.com/";
		Response resp=given().header("Authorization",str).when().get("api/generalSetting").then().contentType(ContentType.JSON).extract().response();
		System.out.println("get output is =" + resp.asPrettyString());
	}
@Test(priority=2)

public void General() {
	RestAssured.baseURI ="https://arcadia.pisystindia.com/";
	Response resp=given().header("Authorization",str).when().get("api/     ").then().contentType(ContentType.JSON).extract().response();
	System.out.println("get output is =" + resp.asPrettyString());
}

}
