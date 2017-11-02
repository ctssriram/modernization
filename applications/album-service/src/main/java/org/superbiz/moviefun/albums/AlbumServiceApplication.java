package org.superbiz.moviefun.albums;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.superbiz.moviefun.blobstore.BlobStore;
import org.superbiz.moviefun.blobstore.EnableS3Config;
import org.superbiz.moviefun.blobstore.S3Store;

@EnableEurekaClient
@SpringBootApplication
@EnableS3Config
public class AlbumServiceApplication {
    public static void main(String... args) {
        SpringApplication.run(AlbumServiceApplication.class, args);
    }

}
