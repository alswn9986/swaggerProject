# Swagger 3.0 Sample Project
spring boot with swagger sample project

<br>

## API 문서화를 위한 Swagger 적용하기
1. Spring boot 프로젝트 생성
2. swagger 의존성 추가
```Groovy
implementation "io.springfox:springfox-boot-starter:3.0.0"
implementation "io.springfox:springfox-swagger-ui:3.0.0"
```

<br>

3. swagger 설정
4. 테스트용 API 생성(controller에 swagger 적용)
5. 결과
생성한 API 목록이 나온다.

![image](https://user-images.githubusercontent.com/101205543/199888308-c0d3cbf0-eabe-4c45-ac55-efd5ca488ab9.png)

다양한 파라미터를 넣고 직접 API를 호출해볼 수 있다.

![image](https://user-images.githubusercontent.com/101205543/199888831-bb9896e1-2ec3-4e42-912b-40c5c854c65d.png)
