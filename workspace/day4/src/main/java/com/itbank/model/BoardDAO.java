package com.itbank.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDAO {

//	@Select("select * from board order by idx desc")
//	xml mapper 사용지 어노테이션은 사용하지 않는다
	
	List<BoardDTO> selectBoardAll(HashMap<String, Object> param);

	
	// 마이바티스에서는 파라미터를 여러개 전달하는 것을 권장하지 않음
	// 여러개를 전달시 DTO로 작성해서 보내거나, Map을 사용해서 보낸다
//	@Select("select * from board "
//			+ "where ${type} like '%${search}%'"
//			+ " order by idx desc")
//	List<BoardDTO> selectSearch(HashMap<String, Object> param);
	
	
	int selectPageCount(HashMap<String, Object> param);
	
	@Select("select * from board where"
			+ " idx=#{idx}")
	BoardDTO selectOne(int idx);
	
	@Insert("insert into " + 
			"board(title, contents, writer) " + 
			"values(#{title}, #{contents}, #{writer})")
	int insert(BoardDTO dto);

	@Update("update board set " + 
			"title = #{title}, " + 
			"writer = #{writer}, " + 
			"contents = #{contents} " + 
			"where idx = #{idx}")
	int update(BoardDTO dto);

	@Delete("delete from board " + 
			"where idx = #{idx}")
	int delete(int idx);

}
