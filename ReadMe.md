# Kodluyoruz / Ne kadar güzel :-)
- Java 17
- Spring Framework
- Spring Boot
- Spring MVC
- Spring Data
- Spring Rest (http status)
- Spring Security

---
(Aslında username ve password ile giriş yapmayı yeterli görmüyorum.)
```
Bana kalırsa önce 1. gizli kullanıcı adı ve şifre, bunlar doğru olursa 2. kullanıcı adı ve 2. şifre, bunlar doğru olursa e-postaya kod gönder, o kodu doğru girerse telefona kod gönder, o kod doğru gelirse ekrandaki yangın musluğunu yada yaya geçidini seç, o da doğru olursa DNA testi, o da doğru olursa göz irisi testi, o da doğru olursa parmak izi en sonunda kimlik doğrulaması gerçekleşmeli.
```
## System Login / Sisteme Kullanıcı Adı ve Şifre ile Giriş Yapma
> Register / Kayıt Olma
> Login (username+password) / Authentication / Yani kimlik doğrulaması
> Authorization(Jwt) / Yetkilendirme

---

## Lesson Steps / Ders Adımları / Kullanılan Teknolojiler
> Spring Framework
> Spring Boot
> Spring MVC
> Spring Data (Jpa Hibernate)
> Spring Rest ( RestFull ==>Jersey)
> Spring Security

---

### Reference Documentation
* [GitHub](https://github.com/huso51/KodluyoruzSpringBoot)

* [H2 console](http://localhost:8080/h2-console/l)

* [Swagger](http//localhost:8080/swagger-ui.html)

---

### Project Steps / Proje Adımları
1. @Bean (ModelMapper)
2. Dto
3. BaseEntity (@MappedSuperclass)
4. EmployeeEntity (@Entity)
5. EmployeeRepository (@Repository)
6. EmployeeServices (interface)
7. EmployeeServiceImpl(@Service)
8. ResourceNotFoundException(@ResponseStatus)
9. EmployeeController(@RestController)

---

### Unit Test / Birim Testi
1. TestCrud (interface)
2. @SpringBootTest

---

### Auditing / Denetleme
1. AuditorAwareBean
2. AuditorAwareImpl (implements AuditorAware)
3. @SpringBootApplication


---
```sh 
1. Deneme

```



## Docker Deployment / Docker Üzerinde Yayımlama 
```sh
1.ADIM
$     ./mvnw clean package -DskipTests

2.ADIM
$    docker-compose up
$    docker ps


######POSTMAN########### / POSTMAN[Uçan Adam Postacı Osman Abi :-) ] ile EndPoint'lerin testi.
3.ADIM
POSTMAN

//EKLEME
http://localhost:8080/docker/v1/create/product


//LISTELE
http://localhost:8080/docker/v1/list/product


//FIND
http://localhost:8080/docker/v1/find/product/1



//DELETE
http://localhost:8080/docker/v1/delete/product/1


4.ADIM
$    docker exec -it spring_docker_postgresqldb_1 psql -U postgres studentdb


5.ADIM
$    studentdb=#  \dt ==> Tabloları göstermek
$    studentdb=#  select * from product
$    studentdb=#  \q ==> ÇIKIŞ

```

