# beableto

[공공데이터]
- Problem : 공공데이터 오류율이 20% 내외, 지도별로 표현방식이 달라 위도/경도 근소한 오차 존재
- Solution : 직접적으로 모두 확인해서 수정

: 전동휠체어급속충전기
1. 불필요한 정보 정리와 분산된 정보 병합
2. 설치위치 > 도로명주소 > 위도/경도 순서로 정확도 확인/수정 (네이버지도/구글지도)
3. 지하철역 출구 위치 충전기는 위도/경도를 해당 출구로 수정
4. 관리기관전화번호 기준 관리기관명 확인/수정

: 엘리베이터/휠체어리프트
1. 외부 엘리베이터/휠체어리프트는 해당 출구 위도/경도 삽입
2. 내부 엘리베이터/휠체어리프트는 통일하여 역 위 위도/경도 삽입
3. 내부 엘리베이터/휠체어리프트 중 환승구간은 두 역이 겹치는 위 위도/경도 삽입
4. 내부 엘리베이터/휠체어리프트 중 겹치는 부분이 없다면, 각자 위도/경도 삽입

[Android]
- Android 3.4 Version
- Pixel 2 API 28 Android 9.0 (Google Play) x86

: MyPage
1. UI/UX 구현
2. 개인정보 수정, 비밀번호 변경 구현

: Customer
1. UI/UX 구현
2. 문의하기, 확인하기(목록) 구현

: Bus Register VGI
1. UI/UX 구현

[OpenAPI]
- 공공데이터 실시간 버스위치정보조회 API
- API 승인 완료
- 지도 위 표시 구현 중
