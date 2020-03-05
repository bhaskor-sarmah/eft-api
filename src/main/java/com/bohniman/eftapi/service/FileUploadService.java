package com.bohniman.eftapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import com.bohniman.eftapi.request.NewSuspectForm;

import sun.misc.BASE64Decoder;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.imageio.ImageIO;

@Service
public class FileUploadService {

	@Value("${app.file-upload}")
	private String UPLOADED_FOLDER;

	// save file
	public void saveUploadedFiles(List<MultipartFile> files) throws IOException {

		for (MultipartFile file : files) {

			if (file.isEmpty()) {
				continue; // next pls
			}

			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

		}

	}

	public void savePhoto(Byte[] file,NewSuspectForm newSuspectForm) throws IOException {

//		BASE64Decoder decoder = new BASE64Decoder();
//		byte[] decodedBytes = decoder.decodeBuffer(photo);

		// buffered image from the decoded bytes
		BufferedImage image = null;
		try {
			image = ImageIO.read(new ByteArrayInputStream(newSuspectForm.getPhoto()));
		} catch (Exception e) {

		}

		if (image == null) {
			System.out.println("no image");
		}
		File f = new File(UPLOADED_FOLDER + newSuspectForm.getSuspect().getOfflineId()+".jpg");

		// write the image
		ImageIO.write(image, "jpg", f);
	}
}
