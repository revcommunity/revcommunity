package org.revcommunity.nokaut;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 * Klasa reprezentuje obrazek pobrany z nokautu
 * @author Tomek
 *
 */
public class NokautImage implements MultipartFile {

	private InputStream inputStream;
	
	private String contentType;
	
	private String name;
	
	private String originalFilename;
	
	private boolean empty;
	
	private long size;
	
	public NokautImage(InputStream inpustream) {
		this.inputStream = inpustream;
	}
	
	public byte[] getBytes() throws IOException {
		
		return IOUtils.toByteArray(this.inputStream);
	}

	public String getContentType() {
		return this.contentType;
	}

	public InputStream getInputStream() throws IOException {

		return this.inputStream;
	}

	public String getName() {
		return this.name;
	}

	public String getOriginalFilename() {
		return this.originalFilename;
	}

	public long getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.empty;
	}

	public void transferTo(File arg0) throws IOException, IllegalStateException {
		throw new IOException("Nie wiem co tutaj zrobic");

	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOriginalFilename(String originalFilename) {
		this.originalFilename = originalFilename;
	}

	public void setSize(long size) {
		this.size = size;
		
		if(this.size > 0){
			this.empty = false;
		}
	}
	
	

}
