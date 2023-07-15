# BoardProject
스프링 부트를 이용한 게시판 프로젝트
<br>
<br>
## 개발환경
1. Spring Boot 2.7.13
2. JDK 17
3. MySQL
4. Spring  Data JPA
5. Thymeleaf
<br>
<br>
## 게시판 주요기능

1. 글 쓰기(/board/save)
2. 글 목록(/board)
3. 글 조회(/board/{id})
4. 글 수정(/board/update/{id})
    + 상세화면에서 수정 버튼 클릭
    + 서버에서 해당 게시글의 정보를 가지고 수정 화면 출력
    + 제목, 내용 수정 입력 받아서 서버로 요청
    + 수정 처리
5. 글 삭제(/board/delelte/{id})
6. 페이징 처리(/board/paging)
    + /board/paging?page=2
    + /board/paging/2
