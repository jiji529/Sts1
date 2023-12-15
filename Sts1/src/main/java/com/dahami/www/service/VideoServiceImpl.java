package com.dahami.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dahami.www.videoVO;
import com.dahami.www.dao.VideoDao;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	VideoDao videodao;
	
	@Override
	public List<videoVO> selectList() {

		return videodao.selectList();
	}

}
