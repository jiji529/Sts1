package com.dahami.www.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dahami.www.videoVO;

@Repository
public class VideoDaoImpl implements VideoDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<videoVO> selectList() {

		return sql.selectList("video.list");
	}

}
