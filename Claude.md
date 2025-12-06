# 한국사 시험 사용자 서비스 - Claude 작업 가이드

## 프로젝트 개요
- Spring Boot 4.0 기반 한국사 시험 사용자 관리 서비스
- Java 17, JPA, OAuth2, MySQL 사용
- 사용자 인증/인가, 시험 참여 관리 기능

## 주요 기술 스택
- **Backend**: Spring Boot 4.0, Spring Security, Spring Data JPA
- **인증**: OAuth2 Client/Resource Server
- **데이터베이스**: MySQL (운영), H2 (테스트)
- **빌드**: Gradle
- **기타**: Lombok, Validation, Cache

## 개발 명령어
```bash
# 애플리케이션 실행
./gradlew bootRun

# 테스트 실행
./gradlew test

# 빌드
./gradlew build

# 린트/코드 스타일 체크
./gradlew checkstyleMain checkstyleTest
```

## 파일 구조
```
src/
├── main/java/com/kht/user/
│   ├── KoreaHistoryTestUserApplication.java
│   ├── config/           # 설정 클래스
│   ├── controller/       # REST 컨트롤러
│   ├── service/         # 비즈니스 로직
│   ├── repository/      # 데이터 접근
│   ├── entity/          # JPA 엔티티
│   └── dto/             # 데이터 전송 객체
├── main/resources/
│   ├── application.yml
│   └── application-local.yml
└── test/               # 테스트 코드
```

## 주요 기능 영역
- 사용자 인증/인가 (OAuth2)
- 사용자 프로필 관리
- 시험 참여 이력 관리
- 성적 조회/통계

## 데이터베이스 설정
- 로컬: H2 (테스트용)
- 개발/운영: MySQL 8.0+
- JPA 엔티티 기반 스키마 관리

## 보안 설정
- Spring Security + OAuth2
- JWT 토큰 기반 인증
- CORS 설정
- 권한별 API 접근 제어

## 테스트 전략
- 단위 테스트: JUnit 5
- 통합 테스트: @SpringBootTest
- 보안 테스트: @WithMockUser
- 데이터베이스 테스트: @DataJpaTest

## API 문서화
- Spring Doc OpenAPI 3 (필요시 추가)
- REST API 엔드포인트 명세

## 환경별 설정
- local: 로컬 개발 환경
- dev: 개발 서버 환경
- prod: 운영 서버 환경

## 로깅 및 모니터링
- Logback 설정
- 애플리케이션 상태 모니터링

## 배포 가이드
- Docker 컨테이너 빌드
- CI/CD 파이프라인 설정

## 문제 해결
- 일반적인 오류 및 해결 방법
- 디버깅 가이드