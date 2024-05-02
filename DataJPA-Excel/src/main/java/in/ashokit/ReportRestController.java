package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController

public class ReportRestController {

@Autowired
	private ReportService reportService;

@GetMapping("/excel")
public void generateEcelReport(HttpServletResponse response)  throws Exception{
	
	response.setContentType("application/octet-stream");
	String headerKey ="Content-Disposition";
	String headerValue="attachment;filename=course.xls";
	response.setHeader(headerKey, headerValue);
	
	
	reportService.generateExcel(response);
	
	
}
}
