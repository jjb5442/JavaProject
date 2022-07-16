package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

// Class가 아니므로 Spring 마크가 생기지 않음
// 
@Repository
public interface BookDAO {

	@Select("select banner from v$version")
	String selectVersion();
	
	@Select("select * from book")
	List<BookDTO> selectBookAll();
	
	// 참고)
	// - 마이바티스에서 사용할 interface는 오버로딩을 지원하지 않으니 주의

	@Select("select * from book where name like '%${search}%'")
	List<BookDTO> selectBook(String search);
	
	// $ : 메서드 파라미터에 있는 내용을 글자 그대로 채운다
	// 즉, ''가 자동으로 붙지 않음
	
	// # : 메서드 파라미터에 있는 데이터를 알아서 타입에 맞게 채운다
	// 즉, 문자열이면 ''가 자동으로 붙고, 숫자면 안 붙는다
}
