package com.prime_sign.springframework.test.mvc;

import java.awt.image.BufferedImage;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(produces = MediaType.IMAGE_PNG_VALUE)
	@ResponseBody
	public BufferedImage getBufferedImage() {
		return new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
	}
	
}
