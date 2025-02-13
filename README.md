# 커피원두 및 부자재 납품업체 영업ERP 서비스 (웹사이트)

## 목차
1. [프로젝트 소개](#oneshot-프로젝트-소개)
2. [개발 일정](#개발-일정)
3. [팀원 구성](#팀원-구성)
4. [개발환경 및 기술스택](#개발환경-및-기술스택)
6. [프로젝트 설계](#프로젝트-설계)
7. [화면UI](#화면-ui)
8. [프로젝트 발표 ppt](#프로젝트-발표-ppt)

<br>

## oneshot 프로젝트 소개
<img src="./images/about1.png" alt="소개" height="300">

- 국내 커피 시장 규모는 매년 상승하는 추세를 보이고 있으며 **급성장하는 커피 시장과 그에 따른 효율적 운영 시스템의 필요성**에 주목하였습니다.

- 원두와 부자재 구매 및 재고관리, 부서별 인사 관리까지 통합적으로 지원하는 ERP시스템을 제작하였습니다.

<br>

## 개발 일정
: 2024/09/02 ~ 2024/09/26
<img src="./images/project-schedule.png" alt="개발일정" height="300">  

<br>


## 팀원 구성

<div align="center">

| **김수현** | **강현구** | **홍나린** | **신지윤** | **최해찬** | **남상혁** |
| :------: | :------: | :------: | :------: | :------: | :------: |
| [<img src="https://avatars.githubusercontent.com/u/172233951?s=64&v=4" height=100> <br/> @shyunu](https://github.com/shyunu) | [<img src="https://avatars.githubusercontent.com/u/80089798?s=64&v=4" height=100> <br/> @Hyeongu02](https://github.com/Hyeongu02) | [<img src="https://avatars.githubusercontent.com/u/172233963?s=64&v=4" height=100> <br/> @Hong-NaRin](https://github.com/Hong-NaRin) | [<img src="https://avatars.githubusercontent.com/u/80537541?s=64&v=4" height=100> <br/> @jishin14](https://github.com/jishin14) | [<img src="https://avatars.githubusercontent.com/u/172337052?v=4" height=100> <br/> @whfh3832](https://github.com/whfh3832) | [<img src="https://avatars.githubusercontent.com/u/180147317?v=4" height=100> <br/> @sxxxhyuk](https://github.com/sxxxhyuk) |
| 역할 | 역할 | 역할 | 역할 | 역할 | 역할 |
| <img src="./images/role1.png" alt="역할1" /> | <img src="./images/role2.png" alt="역할2" /> | <img src="./images/role3.png" alt="역할3" /> | <img src="./images/role4.png" alt="역할4" /> | <img src="./images/role5.png" alt="역할5" /> | <img src="./images/role6.png" alt="역할6" /> |


</div>

<br>

## 개발환경 및 기술스택

| 항목 | 내용 |
|---|---|
| **프로그래밍 언어** | Java 11 |
| **프론트엔드** | React 18.3.1 ,Thymeleaf |
| **프레임워크** | Spring Boot 2.7.18 |
| **보안** | Spring Security |
| **빌드 도구** | gradle-8.1 |
| **데이터베이스(DB)** | PostgreSQL 16.3 (AWS RDS) |
| **데이터베이스 연동** | MyBatis |
| **개발 도구(IDE)** | IntelliJ IDEA, VSCode |
<img src="./images/stack.png" alt="개발일정" height="300">  

<br>

## 프로젝트 설계
### 🔗 화면 구상(Figma)
<img src="./images/figma.png" alt="figma" />

### 🔗 ERD CLOUD
<img src="./images/ERD.png" alt="ERD" />

### 🔗 DataFlow
<img src="./images/process.png" alt="dataflow" />

### 🔗 프로젝트 협업(Slack)
<img src="./images/slack.png" alt="slack" />
<br>


## 화면 UI
## 1. 로그인 및 홈

### 1-1. 로그인 화면
📍 **본사 직원이 로그인하는 화면입니다.**

<div align="left">
  <img src="./images/login.png" alt="로그인 화면" height="400">
</div>

<br>

### 1-2. 메인 홈 화면
📍 **Oneshot ERP 메인 화면**  
연차(휴가제도)를 사용한 직원의 일정, 분기별 매출액, 목표판매량 도달률, 사원수, 사내 규정 등의 정보를 확인할 수 있습니다.

<div align="left">
  <img src="./images/mainHome.png" alt="메인 홈 화면" height="400">
</div>

<hr>

## 2. 인사관리 - 부서관리

### 2-1. 부서 등록 화면
📍 **부서 등록 화면**  
부서명을 입력하고 사용 가능 메뉴를 선택하면 해당 메뉴에 대해서만 사용 권한이 부여됩니다.

<div align="left">
  <img src="./images/department-regist.png" alt="부서등록 화면" height="400">
</div>

<br>

### 2-2. 부서 조회 화면
📍 **등록된 부서를 확인할 수 있는 화면입니다.**

<div align="left">
  <img src="./images/department-list.png" alt="부서조회 화면" height="400">
</div>

<br>

### 2-3. 부서 내 직원 조회 화면
📍 **해당 부서의 직원 리스트를 확인할 수 있는 화면입니다.**
<div align="left">
  <img src="./images/department-member.png" alt="부서 내 직원 조회 화면" height="400">
</div>

<br>

### 2-4. 부서 상태 변경 화면
📍 **부서의 사용가능메뉴를 변경 및 활성화 여부를 설정하는 화면입니다.**

<div align="left">
  <img src="./images/department-active.png" alt="부서 상태 선택 화면" height="400">
</div>

<hr>

## 3. 인사관리 - 사원관리

### 3-1. 사원 등록 화면
📍 **사원 등록 화면**  
양식에 맞게 정보를 입력하여 사원을 등록할 수 있습니다.

<div align="left">
  <img src="./images/employee-regist.png" alt="사원등록 화면" height="400">
</div>

<br>

### 3-2. 직원 퇴직 처리 화면
📍 **직원 퇴직 처리 화면입니다.**

<div align="left">
  <img src="./images/employee-retire.png" alt="직원 퇴직 처리 화면" height="400">
</div>

<hr>

## 4. 인사관리 - 근태관리

### 4-1. 휴가 신청 화면
📍 **휴가 신청 화면**  
휴가의 종류 및 휴가 시작일과 종료일을 선택하여 휴가를 신청할 수 있습니다.

<div align="left">
  <img src="./images/attendance-regist.png" alt="휴가 신청 화면" height="400">
</div>

<br>

### 4-2. 휴가 승인 화면
📍 **휴가 승인 화면입니다.**
승인하고자 하는 항목을 체크하여 승인을 할 수 있습니다.

<div align="left">
  <img src="./images/attendance-yes.png" alt="휴가 승인 화면" height="400">
</div>

<br>

### 4-3. 휴가 반려 화면
📍 **휴가 반려 화면입니다.**
신청된 휴가를 반려하고자 하면 반려 사유를 작성하여 반려 처리 가능합니다.

<div align="left">
  <img src="./images/attendance-no.png" alt="휴가 반려 화면" height="400">
</div>

<hr>

## 5. 재고관리 - 공급업체관리

### 5-1. 공급업체 등록 화면
📍 **공급업체 등록 화면**  
양식에 맞게 작성하여 공급업체를 작성할 수 있습니다.

<div align="left">
  <img src="./images/supplier-regist.png" alt="공급업체 등록 화면" height="400">
</div>

<br>

### 5-2. 공급업체 조회 및 수정 화면
📍 **공급업체 조회 및 수정 화면입니다.**
등록한 공급업체의 정보를 조회 및 수정할 수 있습니다.

<div align="left">
  <img src="./images/supplier-detail.png" alt="공급업체 조회 및 수정 화면" height="400">
</div>

<hr>

## 6. 재고관리 - 상품관리

### 6-1. 상품 등록 화면
📍 **상품 등록 화면**  
양식에 맞게 작성하여 상품을 작성할 수 있습니다.

<div align="left">
  <img src="./images/product-regist.png" alt="상품 등록 화면" height="400">
</div>

<br>

### 6-2. 상품 조회 화면
📍 **상품 조회 화면입니다.**
등록한 상품의 정보를 조회할 수 있습니다.

<div align="left">
  <img src="./images/product-list.png" alt="상품 조회 화면" height="400">
</div>

<hr>

## 7. 재고관리 - 구매관리

### 7-1. 구매 등록 화면
📍 **구매 등록 화면**  
구매양식에 맞게 작성하여 공급업체로부터 상품을 구매할 수 있습니다.

<div align="left">
  <img src="./images/purchase-regist.png" alt="구매 등록 화면" height="400">
</div>

<br>

### 7-2. 구매 후 재고 조회 화면
📍 **구매 후 재고 조회 화면입니다.**
구매한 상품의 개수만큼 재고가 생성된 것을 확인할 수 있습니다.

<div align="left">
  <img src="./images/purchase-stock.png" alt="구매 후 재고 조회 화면" height="400">
</div>

<hr>

## 8. 영업관리 - 계약관리

### 8-1. 계약 등록 화면
📍 **계약 등록 화면**  
고객사와의 계약을 통하여 계약 기간동안 계약가격으로 고객사와 거래할 수 있습니다. 그에 맞는 계약을 등록하는 과정입니다.

<div align="left">
  <img src="./images/contract-regist.png" alt="계약 등록 화면" height="400">
</div>

<br>

### 8-2. 계약 승인 화면
📍 **계약 승인 화면입니다.**
승인하고자 하는 계약을 선택하여 승인 처리합니다.

<div align="left">
  <img src="./images/contract-confirm.png" alt="계약 승인 화면" height="400">
</div>

<br>

### 8-3. 계약서 저장 화면
📍 **계약서 저장 화면입니다.**
계약 등록 시 첨부한 계약서를 조회 및 저장할 수 있습니다.

<div align="left">
  <img src="./images/contract-download.png" alt="계약서 저장 화면" height="400">
</div>

<hr>

## 9. 영업관리 - 판매관리

### 9-1. 판매 등록 화면
📍 **판매 등록 화면**  
고객사와 상품를 선택하면 승인된 계약건에 해당하는 계약가격이 자동으로 나타나게 되며 판매한 상품을 여러개 등록할 수 있습니다.

<div align="left">
  <img src="./images/sales-regist.png" alt="판매 등록 화면" height="400">
</div>

<br>

### 9-2. 판매 상세조회 화면
📍 **판매 상세조회 화면입니다.**
판매 등록건을 상세 조회할 수 있는 화면입니다.

<div align="left">
  <img src="./images/sales-detail.png" alt="판매 상세조회 화면" height="400">
</div>

<br>

### 9-4. 판매 배송처리 화면
📍 **판매 배송처리 화면입니다.**
판매 등록건을 배송처리할 수 있습니다.

<div align="left">
  <img src="./images/sales-delivery.png" alt="판매 배송처리 화면" height="400">
</div>

<br>

## 프로젝트 발표 ppt
### [oneshot.pdf](https://github.com/user-attachments/files/18019003/oneshot.pdf)
