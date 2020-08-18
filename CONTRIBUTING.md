# 울릉에 기여하기
울릉에 기여해주실 의향을 표현하시다니, 감사할 따름입니다.

울릉에 기여해주신 모든 내용은 MIT 라이선스에 따라 공개됩니다.

# 기여하기 단계
- 이 레포지터리를 본인의 계정으로 포크해주세요.
- 포크된 레포지터리에 브랜치를 하나 추가해주세요.
- 변경이 완료된 후 포크의 브랜치로 푸쉬 후, 이 리포지터리의 마스터로 풀 리퀘스트를 해주세요.

# 주의사항
- 커밋 메세지는 다음과 같이 작성해주세요.  
 [종류]위치 : (변경사항)  
 예시) [추가] .gitignore : build/ 폴더 추가
- 종류는 다음과 같습니다.  
 [추가] [수정] [다듬기]
- 커밋의 단위는 되도록 1파일당 1커밋을 유지해 주세요.
- 전혀 다른 주제 여러개에 대해서 작업을 완료했을 경우, 별도의 풀 리퀘스트를 해주세요.

# 커밋 전 테스트
2020.08.18.01 버전의 예시 코드 및 출력 되어야 하는 결과 입니다.  
sample.uln: 
~~~
한국.메인.울릉 제작 

kr.kro.jhseo1107.EncryptBuilder1107 도입

객체 곱셈: 
	정적 함수 main: 문자열 의 배열 args 요구 
		반복: 정수 ㄱ = 0 으로 ㄱ < 10 동안 ㄱ = ㄱ + 1 
			반복: 정수 ㄴ = 0 으로 ㄴ < 10 동안 ㄴ = ㄴ + 1 
				System.out.println(곱셈(ㄱ, ㄴ)) 
				만약: 곱셈(ㄱ, ㄴ) > 10 이고 참 
					System.out.println("10보다 큼")
				;
			;
		;
	;

	함수 곱셈: 정수 ㄱ, 정수 ㄴ 요구 
		정수 임시 = ㄱ * ㄴ 
	:임시 돌려주기;
;
~~~
sample.uln.java:
~~~java
package 한국.메인.울릉;import kr.kro.jhseo1107.EncryptBuilder1107;public class 곱셈 {public static void main(String[] args) {for(int ㄱ = 0;ㄱ<10;ㄱ = ㄱ+1) {for(int ㄴ = 0;ㄴ<10;ㄴ = ㄴ+1) {System.out.println(곱셈(ㄱ, ㄴ));if(곱셈(ㄱ, ㄴ)>10&&true) {System.out.println("10보다 큼");}}}}public int 곱셈(int ㄱ, int ㄴ) {int 임시 = ㄱ*ㄴ;return 임시;}}
~~~
이를 다듬으면:
~~~java
package 한국.메인.울릉;

import kr.kro.jhseo1107.EncryptBuilder1107;

public class 곱셈 {
	public static void main(String[] args) {
		for(int ㄱ = 0; ㄱ < 10;ㄱ = ㄱ+1) {
			for(int ㄴ = 0; ㄴ < 10;ㄴ = ㄴ+1) {
				System.out.println(곱셈(ㄱ, ㄴ));
				if(곱셈(ㄱ, ㄴ) > 10 && true) {
					System.out.println("10보다 큼");
				}
			}
		}
	}
	public int 곱셈(int ㄱ, int ㄴ) {
		int 임시 = ㄱ * ㄴ;
		return 임시;
	}
}
~~~