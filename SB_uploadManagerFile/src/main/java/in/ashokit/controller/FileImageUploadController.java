package in.ashokit.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileImageUploadController{

	@PostMapping("/upload-file")
	public String uploadImage(@RequestParam("file")MultipartFile file) {
		
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		//String Path_Directory="C:\\Users\\nares\\OneDrive\\Pictures\\Saved Pictures\\pics";
		
		//Files.copy(file.getInputStream(),Path.get(Path_Directory+File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
		return "successfully Image is uploaded";
	}
}

//	@RestController
//	public class FileImageUploadController{
//
//	    @PostMapping("/upload-file")
//	    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
//	        try {
//	            if (file.isEmpty()) {
//	                return new ResponseEntity<>("File is empty", HttpStatus.BAD_REQUEST);
//	            }
//
//	            String directoryPath = "C:\\Users\\nares\\OneDrive\\Pictures\\Saved Pictures\\pics";
//	            String fileName = file.getOriginalFilename();
//	            Path filePath = Paths.get(directoryPath, fileName);
//
//	            // Copy file to the target location
//	            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
//
//	            // Return success response
//	            return ResponseEntity.ok("Successfully uploaded: " + fileName);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            return new ResponseEntity<>("Failed to upload file", HttpStatus.INTERNAL_SERVER_ERROR);
//	        }
//	    }
//	}
//
//
//
//
