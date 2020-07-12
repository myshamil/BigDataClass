# Bigdataplatform_Web_Class_Note
Apache & Tomcat에 대한 설정 및 관리 노트  

<hr>   

**Apache**  

[서버 시작 및 종료]  
-> Startup Path on Mac :: cd /usr/local/Cellar/tomcat/<현재 버전 / 9.0.34>/bin/catalina  
-> Server Start up :: < 위의 경로에서 > ./catalina start  
-> Server Stop :: < 위의 경로에서 > ./catalina stop  

[서버 환경 설정]  
-> Path :: cd /usr/local/Cellar/tomcat/<현재 버전 / 9.0.34>/libexec/conf  
-> Port Setting :: cd /usr/local/Cellar/tomcat/<현재 버전 / 9.0.34>/libexec/conf/server.xml  
  == 여기서 Connector Port : ___ 부분을 변경해주도록 한다.  
  
-> Enconding Setting(1) :: cd /usr/local/Cellar/tomcat/<현재 버전 / 9.0.34>/libexec/conf/server.xml  
  == 여기서 Connector Port 문단의 마지막에 URIEncoding="UTF-8" 추가   

-> Encoding Setting(2) :: cd /usr/local/Cellar/tomcat/<현재 버전 / 9.0.34>/libexec/conf/web.xml  
  == 여기서 <filter-mapping> 문단과 <filter> 문단을 수정하는데.. 기억이 안난다..  
  
