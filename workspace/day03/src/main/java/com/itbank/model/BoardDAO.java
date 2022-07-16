package com.itbank.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDAO {

	@Select("select * from board order by idx desc")
	List<BoardDTO> selectBoardAll();

	// 마이바티스에서는 파라미터를 여러개 전달하는 것을 권장하지 않음
	// 여러개를 전달시 DTO로 작성해서 보내거나, Map을 사용해서 보낸다
	@Select("select * from board "
			+ "where ${type} like '%${search}%'"
			+ " order by idx desc")
	List<BoardDTO> selectSearch(HashMap<String, Object> param);
	
	@Select("select * from board where idx=#{idx}")
	BoardDTO selectOne(int idx);
	
}
