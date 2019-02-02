# simple_Othello

간단한 안드로이드 어플 만들기 ( 오델로 게임 )  

1일차) 안드로이드 개발환경 구축  

컴퓨터 os에 맞게 안드로이드 스튜디오 (Android Studio) 다운로드 및 설치 ( https://developer.android.com/studio/?hl=ko ),  
구현상황을 확인하기 위해 Andriod Studio 의 Emulator를 이용해도 되지만,  
소지한 스마트폰을 통해 직접 확인해보기 위해 USB driver를 다운로드 및 설치하였다.  

사용할 언어 : JAVA

안드로이드 스튜디오를 공부하면서 만들어보고 있기 때문에 조금 서툴다.  
activity_main.xml에 textView와 button 3개를 추가하여 메인화면을 간략하게 구성하였다.  
배경색이나 Layout을 조절하는 데 있어서 모든 스마트폰의 화면에 맞게 하기보다는 우선 소지하고 있는  
스마트폰에서 제대로 작동하는 것을 확인하면 Layout등 세부사항을 조절할 계획이다.


![default](https://user-images.githubusercontent.com/4442280/52089431-de64ba00-25f1-11e9-95d7-578e9af8c9d6.jpg)  
메인화면

메인화면에 쓰인 아이콘은 ( http://free-icon-rainbow.com/othello-board-game-free-icon-5/ ) 에서 다운로드하였다.

2일차) 게임 설명과 설정창 구성

게임시작 메뉴는 필요한 지식과 시간이 많기 때문에, 우선 게임 설명과 설정화면을 구성하였다.  
게임설명은 보드게임 오델로의 진행방식을 간략하게 설명하여 놓은 화면이다.

![default](https://user-images.githubusercontent.com/4442280/52165194-d9fae700-2740-11e9-985a-ffc72591e918.png)  
게임설명

설정에는 배경음과 효과음을 on / off 할 수 있도록 한다. 추가적으로 필요한 설정이 있으면 추후에 추가할 예정이다.

![default](https://user-images.githubusercontent.com/4442280/52165196-db2c1400-2740-11e9-9813-0e21ece09204.png)  
설정

배경음은 ( https://bgmstore.net/ ) 에서 다운로드하였고,  
효과음은 ( https://m.blog.naver.com/PostView.nhn?blogId=clean_world_&logNo=100055864459&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F )  
에서 다운로드하였다. 배경음을 넣는 과정에서 MainActivity에 넣으면 앱의 실행과 동시에 배경음이 나오지만,  
설정창에서 이를 on / off 하기 위해 bgm을 넣는 과정에서 헤매고 있다.  
효과음도 마찬가지로 on 일 땐 화면을 터치할 때마다 소리가 나도록 하고, off 이면 소리가 나지 않도록 설정할 것이다.

p.s. git bash을 사용하는 과정에서 실수로 Repository를 한 번 엎었다. 대충하지 말자..
