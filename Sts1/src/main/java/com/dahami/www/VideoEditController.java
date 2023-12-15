package com.dahami.www;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dahami.www.service.VideoService;

@Controller
public class VideoEditController {
	
	@Autowired 
	VideoService videoService;
	
	@GetMapping("/aaa")
	public String video(Model model) {

		List<videoVO> videoAllList = videoService.selectList();
		
		model.addAttribute("videoList", videoAllList);
		
		return "video/video";
	}
		
}
		


	


