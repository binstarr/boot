소켓 통신을 이용한 채팅 프로그램 만들기

[기능]
양방향, 다중접속 구현

같은 방 유저끼리 채팅 기능
귓속말(쪽지)
방 만들기
방 나가기
전체 유저 목록 확인

[프로토콜 별 기능]

Whisper 귓속말
Chatting - "Chatting/방이름/유저이름/내용"
NewUser - 새로운 유저 방송처리
NewRoom - 방 생성
EnterRoom - 방 입장 : "EnterRoom/방이름/유저이름"
ExitRoom - 방 나가기 : "ExitRoom/방이름/유저이름"
OldUser/OldRoom : 기존에 있는 유저들 정보 업데이트



