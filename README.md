# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 단계별 진행사항
* Step2 - 문자열 덧셈 계산기
  * 피드백
    * 코드를 읽을 때 위에서 아래로 읽어내려가므로 메서드의 위치도 그에 맞게 배치한다.
    * 외부에서 사용되지 않는 메서드는 적절한 접근 지정자를 설정한다.
    * 패턴에 대한 역할을 변수 혹은 상수명으로 나타내준다.
    * Null/Empty 테스트는 @ParameterizedTest/@NullAndEmptySource 어노테이션을 사용한다.
* Step3 - 자동차 경주
  * 기능 목록
    * 자동차 경주에 참여할 차의 개수 N과 이동 횟수인 M의 입력을 받는다.
    * 0에서 9 사이의 Random 값 중 4이상일 자동차가 전진한다.
    * 자동차의 상태를 화면에 출력한다.
  * 피드백
    * 구현할 기능 단위의 리스트를 상세하게 작성하고 커밋 단위와 연동하기
    * 구글 자바 컨벤션 - 인스턴스 멤버의 순서와 구분
    * primitive type / wrapper class
    * toString 은 디버깅 용도의 메서드, 출력문에 활용하는 것은 좋지 않다.
    * main() 함수의 클래스는 *Application 으로 네이밍
    * INDEX 상수를 Car 도메인에서 관리해야 할까?
    * 배열보다는 사용성이 좋은 컬렉션 프레임워크를 사용하기
    * equals(), hashcode() 의메 생각하기
    * 불필요한 return 제거
    * 불필요한 파라미터 줄이기
    * 변수명에 동사 사용하지 않기
    * RacingSupport class 역할 줄이기