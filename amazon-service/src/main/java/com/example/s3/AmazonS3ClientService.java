package com.example.s3;

import org.springframework.web.multipart.MultipartFile;

public interface AmazonS3ClientService {

	String uploadFileToS3Bucket(MultipartFile multipartFile, boolean enablePublicReadAccess);

    void deleteFileFromS3Bucket(String fileName);
}
