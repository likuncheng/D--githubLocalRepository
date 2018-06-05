package com.highwebsite.webUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;


public class serviceUtils {

	public static String md5(String password){
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte[] md5 = md.digest(password.getBytes());
			Base64 encoder = new Base64();
			byte[] resultbyte =  encoder.encode(md5);	
			String result = new String(resultbyte);
			System.out.println(result);
			return result;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
}
