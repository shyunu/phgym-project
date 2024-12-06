# 헬스장 회원 관리 및 회원 서비스 플랫폼 (관리자/회원)

## 목차
1. [프로젝트 소개](#ph-gym-프로젝트-소개)
2. [개발 일정](#개발-일정)
3. [팀원 구성](#팀원-구성)
4. [개발환경 및 기술스택](#개발환경-및-기술스택)
6. [프로젝트 설계](#프로젝트-설계)
7. [화면UI](#화면-ui)
8. [프로젝트 발표 ppt](#프로젝트-발표-ppt)

<br>

## PH-GYM 프로젝트 소개
### 💡 프로젝트 주제 선정
<img src="./images/gym-about1.png" alt="통계" width="400" />

- 직장인 10명 중 7명은 자기관리를 위해 헬스장을 다닌다고 합니다.
- 바쁜 일상 속에서도 건강을 챙기기 위한 노력은 점점 더 중요한 일상이 되고 있습니다.
<br>
<img src="./images/gym-about2.png" alt="카톡예약" width="400"  />

- 직장인들은 야근이나 갑작스러운 개인 일정 등으로 PT 예약을 미리 확정하기 어려운 경우가 많습니다.
- 매번 카카오톡을 통해 트레이너와 예약을 조정하고 변경하는 과정에서 피로감을 느낄 수 있었습니다. 😭
- 저희는 웹사이트를 통해 **예약을 간편하게 확정하고 변경할 수 있는 시스템**을 개발하게 되었습니다.
<br>

### ✨ PH-GYM 프로젝트 소개
PHGYM은 효율적인 헬스장 운영을 위한 웹 기반 시스템입니다. 회원들이 헬스장을 보다 편리하게 이용할 수 있도록 하기 위해 웹페이지를 개발하였습니다. <br>
회원들은 웹사이트를 통해 개인 계정에 접근하고, 스케줄을 관리하며, 다양한 헬스장 서비스에 쉽게 접근할 수 있습니다.

또한, 관리자는 관리자 모드를 통해 회원 정보를 효율적으로 관리하고, 각 담당 회원의 스케줄을 관리하여 보다 효과적인 결과를 도출할 수 있습니다. <br>
이 시스템은 헬스장 운영의 효율성을 높이고, 회원들에게 최상의 서비스를 제공하는 것을 목표로 하고 있습니다.

<br>

## 개발 일정

- **개발 기간** : 2024/07/03 ~ 07/31

<br>

## 팀원 구성

<div align="left">

| **김수현** | **임혜주** | **신지윤** | **남상혁** | **최해찬** |
| :------: |  :------: | :------: | :------: | :------: |
| [<img src="https://avatars.githubusercontent.com/u/172233951?s=64&v=4" height=100> <br/> @shyunu](https://github.com/suhyun-kim9) | [<img src="https://avatars.githubusercontent.com/u/129069292?v=4" height=100> <br/> @hyejux](https://github.com/hyejux) | [<img src="https://avatars.githubusercontent.com/u/80537541?s=64&v=4" height=100> <br/> @jishin14](https://github.com/jishin14) | [<img src="https://avatars.githubusercontent.com/u/180147317?v=4" height=100> <br/> @sxxxhyuk](https://github.com/sxxxhyuk) | [<img src="https://avatars.githubusercontent.com/u/172337052?v=4" height=100> <br/> @whfh3832](https://github.com/whfh3832) |
| 역할 | 역할 | 역할 | 역할 | 역할 |
| 프론트엔드 디자인 총괄 <br> 예약/결제페이지 연동 <br> 프로모션별 결제화면 구현 <br> 카카오맵 api 연동 |  프론트엔드 디자인 총괄 <br> 관리자페이지 구현 <br> 회원PT 일정 확인 구현 <br> 회원정보 기능 구현 | 백엔드 총괄 <br> 회원페이지 구현 <br> 출석체크 기능 구현 <br> PT 예약 및 양도 기능 구현 | 로그인 페이지 구현 <br> 회원가입 기능 구현 <br> 결과보고서 작성 | 게시판 페이지 구현 <br> 페이지네이션 구현 <br> 결과보고서 작성 |

</div>


<br>
  
## 개발환경 및 기술스택

| 항목 | 내용 |
|---|---|
| **OS** | Windows 10 / macOS |
| **IDE** | Visual Studio Code / Eclipse |
| **Version Control** | GitHub |
| **Build Tool** | Maven / Gradle |
| **Database** | OracleDB |
| **Server** | Apache Tomcat |
| **Frontend** | HTML5, CSS3, JavaScript (ES6), Bootstrap |
| **Backend** | Java (JDK 11), Eclipse(4.31.0) |
| **Database** | OracleDB |

<br>

## 프로젝트 설계
### 🔗 요구사항 명세서
<img src="./images/gym-doc.png" alt="요구사항 명세서" />

### 🔗 ERD CLOUD
<img src="./images/gym-erd.png" alt="ERD" />

### 🔗 유스케이스 다이어그램
<img src="./images/gym-usecase.png" alt="usecase" />

### 🔗 협업 공유 플랫폼
<img src="./images/gym-contact.png" alt="협업플랫폼" />


<br>

## 화면 UI
## 1. 로그인/회원가입
### 1-1. 로그인 화면
📍 사용자/관리자가 로그인할 수 있는 화면으로 토글로 모드를 전환할 수 있습니다.<br>
![로그인 화면](./images/login.png)

<br>

### 1-2. 회원가입 화면
📍 사용자/관리자가 회원가입할 수 있는 화면입니다.<br>
![회원가입 화면](./images/join.png)

<br>

## 2. 홈페이지 소개
### 2-1. 메인 화면
📍 PHGYM의 메인 화면입니다.<br>
![메인 화면](./images/mainHome.png)

<br>

### 2-2. 트레이너 소개 및 예약 연동 화면
📍 PHGYM의 트레이너 소개 및 예약 연동 화면입니다.<br>
![트레이너 소개 화면](./images/intro.png)

<br>

### 2-3. 프로모션 안내 화면
📍 프로모션별 소개 및 예약 연동 화면입니다.<br>
![프로모션 화면](./images/promotionList.png)

<br>

### 2-4. 프로모션 결제 화면
📍 프로모션별 결제 화면입니다.<br>
![결제 화면](./images/promotion.png)

<br>

### 2-5. 지도 화면
📍 오시는길 소개로, 카카오맵 api를 연동하여 지도를 배치하였습니다.<br>
![지도 화면](./images/map.png)

<br>

### 2-6. 에러 화면
📍 error 공통 화면입니다.<br>
![에러 화면](./images/error.png)

<br>

## 3. 회원 페이지

### 3-1. 출석체크 화면
📍 회원 헬스장 출석체크 화면입니다.<br>
![출석체크 화면](./images/checkin.png)

<br>

### 3-2. PT예약 화면
📍 회원 PT 예약 화면입니다.<br>
![PT예약 화면](./images/pt.png)

<br>

### 3-3. PT회원권 양도 화면
📍 회원 PT회원권 양도 화면입니다.<br>
![PT회원권 양도 화면](./images/ptChange.png)

<br>

## 4. 게시판 화면
📍 게시판 화면입니다.<br>
![게시판 화면](./images/board.png)

<br>

## 5. 관리자 페이지
### 5-1. 관리자페이지 메인 화면
📍 관리자페이지 메인 화면입니다.<br>
![관리자페이지 메인 화면](./images/adminMain.png)

<br>

### 5-2. 회원PT 일정확인 화면 
📍 관리자별 담당 회원PT 일정확인 화면입니다.<br>
![회원PT 일정확인 화면](./images/scheduleCheck.png)

<br>

### 5-3. 회원정보확인 화면 
📍 회원정보확인 화면입니다.<br>
![회원정보확인 화면](./images/checkInfo.png)


<br>

## 프로젝트 발표 PPT
[PHGYM ppt.pdf](https://github.com/user-attachments/files/18033466/PHGYM.ppt.pdf)


